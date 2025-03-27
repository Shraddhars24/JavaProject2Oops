package org.example.CodingTasks;

import java.util.Arrays;
import java.util.List;

public class E7CountWordsInString {
    // Declare an Instance variable to store the input string
    private String text;

    //Create a Constructor to initialize the text
    E7CountWordsInString(String text) {
        this.text = text;
    } //Create a method to Count the Number of Words in a String using split()

    // split(),Splits the string based on non-word characters (punctuation, spaces, etc.)
    public int countWords() {
        if (text == null || text.isEmpty()) {
            return 0;
        }  // Convert the string to a list of words using split()
        String[] words = text.split("[\\s\\p{Punct}]+");  // Split by spaces or punctuation
        return words.length;
    }

    public static void main(String[] args) {
        // Creating an object of E7CountWordsInString  class
        E7CountWordsInString countWordsInString = new E7CountWordsInString("Hello, world! Welcome to Java programming.");
        // Calling the countWords() method and printing the result
        System.out.println("Number of Words in a String: " + countWordsInString.countWords());
    }
}
