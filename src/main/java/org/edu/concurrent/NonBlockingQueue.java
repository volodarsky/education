package org.edu.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class NonBlockingQueue<V> {

    private AtomicReference<Node<V>> head;
    private AtomicReference<Node<V>> tail;

    public NonBlockingQueue() {
        head = tail = new AtomicReference<>(new Node<>(null, null));
    }

    static class Node<V> {

        final V value;
        AtomicReference<Node<V>> next;

        public Node(V value, Node<V> next) {
            this.value = value;
            this.next = new AtomicReference<>(next);
        }
    }

    public boolean push(V value) {

        final Node<V> newNode = new Node<>(value, null);

        final Node<V> currTail = tail.get();
        final Node<V> residue = currTail.next.get();

        while (true) {
            if (currTail == tail.get()) {
                if (residue == null) {
                    if (currTail.next.compareAndSet(null, newNode)) {
                        tail.compareAndSet(currTail, newNode);
                        return true;
                    }
                } else {
                    tail.compareAndSet(currTail, residue);
                }
            }
        }
    }

    public V pop() {
        Node<V> oldHead;
        Node<V> newHead;

        do {
            oldHead = head.get();
            if (oldHead.value == null) {
                return null;
            }
            newHead = oldHead.next.get();
        } while (!head.compareAndSet(oldHead, newHead));

        return oldHead.value;
    }


}
