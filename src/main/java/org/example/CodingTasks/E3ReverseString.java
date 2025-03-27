package org.example.CodingTasks;

public class E3ReverseString {
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);// Create a StringBuilder from the input string
        reversed.reverse();
        String reverse = reversed.toString();

        return reverse; // Reverse and convert back to String

    }

    public static void main(String[] args) {
        //Create an Object in main method
        E3ReverseString reverseString = new E3ReverseString();
        //Call the reverseString method to reverse the String.
        System.out.println(reverseString.reverseString("Syntax"));
        System.out.println(reverseString.reverseString("Java"));
        System.out.println(reverseString.reverseString("Hello"));


    }
}
