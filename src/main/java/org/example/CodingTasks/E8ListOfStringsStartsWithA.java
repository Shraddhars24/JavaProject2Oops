package org.example.CodingTasks;

import java.util.ArrayList;
import java.util.List;

public class E8ListOfStringsStartsWithA {
    //Create a method to filter the List of Strings to keep only those starts with "A" and return them in Lower Case
    public static List<String> startsWithAtoLowercase(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (s.startsWith("A")) {//Filter the strings those starts with "A"
                result.add(s.toLowerCase());//convert the string to lowercase
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //Call the startsWithAtoLowercase method and print the string
        List<String> fruits = List.of("Apple", "Banana", "Apricot", "Pineapple");
        System.out.println(startsWithAtoLowercase(fruits));
    }
}
