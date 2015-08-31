
def sieve(s : Stream[Int]) : Stream[Int] = { Stream.cons(s.head, sieve(s.tail.filter(_ % s.head != 0)))}

def primes = sieve(Stream from 2);

primes take 30 print








