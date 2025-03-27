package org.example.CodingTasks;

public class E4IfStringIsPalindrome {
    //Create a method to check if a String is Palindrome
    public boolean isPalindrome(String phrase) {
        //Remove the space and special characters and convert the String to lower case
        phrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        //Create a StringBuilder to reverse the String
        StringBuilder reversePhrase = new StringBuilder(phrase);
        reversePhrase.reverse();
        //Convert StringBuilder to String
        String reverse = reversePhrase.toString();
        return phrase.equals(reverse);

    }

    public static void main(String[] args) {
        //Create an object in the main method
        E4IfStringIsPalindrome ifPalindrome = new E4IfStringIsPalindrome();
        //Call the isPalindrome method and print if the input is Palindrome if Yes Output is true and If NO Output is false.
        System.out.println(ifPalindrome.isPalindrome("Madam"));
        System.out.println(ifPalindrome.isPalindrome("Kayak"));
        System.out.println(ifPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(ifPalindrome.isPalindrome("Race a car"));
        System.out.println(ifPalindrome.isPalindrome("Race Car"));
        System.out.println(ifPalindrome.isPalindrome("Level"));


    }
}


