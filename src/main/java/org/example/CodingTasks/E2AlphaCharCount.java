package org.example.CodingTasks;

public class E2AlphaCharCount {
    private String message;

    // // Create a Constructor to initialize string
    public E2AlphaCharCount(String message) {
        this.message = message;
    }// Create a method to count alphabetic characters

    public int countAlphaChar() {
        int count = 0;
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;

    }
    //Call the countAlphaChar method and  print the number of characters from the String message.

    public static void main(String[] args) {
        E2AlphaCharCount alphaCharCount = new E2AlphaCharCount("Hello Syntax Technologies Batch 22");
        System.out.println("Number of alpha characters: " + alphaCharCount.countAlphaChar());
    }
}
