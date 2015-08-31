package org.edu.other;

/**
 * User: VR
 * Date: 29.08.15
 * Time: 21:57
 */
public class Palindrome {

    public static boolean isPalindrome(String str) {

        if (str == null || str.length() == 0) {
            return false;
        }

        char[] chars = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
            while (!Character.isAlphabetic(chars[i]) && i < j) i++;
            while (!Character.isAlphabetic(chars[j]) && i < j) j--;

            if (i > j || ((i == j) && !Character.isAlphabetic(chars[i]))) return false;

            if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        assert isPalindrome("aba");
        assert isPalindrome("ABA");
        assert isPalindrome("a");
        assert !isPalindrome("  ");
        assert !isPalindrome("");
        assert !isPalindrome(" ");
        assert !isPalindrome(null);
        assert !isPalindrome(" ab");
        assert !isPalindrome(" a b ");
        assert isPalindrome(" a");
        assert isPalindrome("a ");
        assert isPalindrome(" a ");
        assert isPalindrome("  a ");
        assert isPalindrome("a b a ");
        assert isPalindrome(" a b   a");


    }

}
