package org.example.CodingTasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class E9FirstNoRepeatChar {
    public static char firstNoRepeatChar(String s) {
        // Create a LinkedHashMap to maintain the order of characters as they appear in the string
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        // Count how many times each character occurs in a string
        //Updates the frequency of each character in the charCount map.
        for (char c : s.toCharArray()) {// converts the string into a character array with toCharArray()
            /*The getOrDefault(c, 0) method checks if the character c already exists in the map;
             if not, it returns 0, then adds 1 to the frequency count.*/
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character in a string
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no non-repeating character is found, return a placeholder value
        return '\0'; // '\0' indicates no non-repeating character
    }

    public static void main(String[] args) {
        //The main method tests the firstNoRepeatChar method by providing the string "abracadabra" as the input

        String input = "abracadabra";
        char result = firstNoRepeatChar(input);
        // If a non-repeating character is found, it prints it; otherwise, it prints that no non-repeating character was found.

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
