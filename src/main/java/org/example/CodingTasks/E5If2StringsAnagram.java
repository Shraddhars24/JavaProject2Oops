package org.example.CodingTasks;

import java.util.Arrays;

public class E5If2StringsAnagram {
    //Create a method to check if a String is Anagram
    public boolean isAnagram(String str1, String str2) {
        //Remove the space and special characters and convert the String to lower case
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //Compare the length of the String and if the lengths are not equal, they can't be Anagram return false.
        if (str1.length() != str2.length()) {
            return false;
        }
        //Convert Strings to Char Arrays and sort them
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        //Compare if sorted Char Arrays are equal to each other.
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        //Create an object in the main method
        E5If2StringsAnagram ifAnagram = new E5If2StringsAnagram();
        //Call the isAnagram method and print if the input is Anagram if Yes Output is true and If NO Output is false.
        System.out.println(ifAnagram.isAnagram("listen", "silent"));
        System.out.println(ifAnagram.isAnagram("night", "thing"));
        System.out.println(ifAnagram.isAnagram("night", "thing"));
        System.out.println(ifAnagram.isAnagram("night", "tight"));
        System.out.println(ifAnagram.isAnagram("A gentleman", "Elegant man"));
        System.out.println(ifAnagram.isAnagram("Dirty Room", "Dormitory"));
        System.out.println(ifAnagram.isAnagram("Earth", "Heart"));
    }
}
