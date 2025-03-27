package org.example.CodingTasks;

import java.util.Locale;

public class E6CountVowels {
    //Create a method to count Vowels
    public int countVowels(String str) {
        return (int) str.toLowerCase()//Convert String to lowerCase
                .chars()//Convert String to Instream means we get the ASC|| values of the characters
                .filter(c -> "aeiou".indexOf(c) != -1)//Used Lambda to find or filter the Vowels
                .count();// Count remaining Characters.
    }

    public static void main(String[] args) {
        //Create an object in the main method

        E6CountVowels countVowels = new E6CountVowels();
        //Call the countVowels method to count the vowels from the String and print the number of count

        System.out.println(countVowels.countVowels("documentation"));
        System.out.println(countVowels.countVowels("Princess"));
        System.out.println(countVowels.countVowels("Technologies"));
        System.out.println(countVowels.countVowels("Syntax"));
    }
}
