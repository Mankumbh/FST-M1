package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> number = new HashSet<String>();
        // Adding element to HashSet

        // Adding element to HashSet
        number.add("Jan");
        number.add("Feb");
        number.add("March");
        number.add("April");
        number.add("MAy");
        number.add("June");

        //Print HashSet
        System.out.println("Original HashSet: " + number);
        //Print size of HashSet
        System.out.println("Size of HashSet: " + number.size());

        //Remove element
        System.out.println("Removing A from HashSet: " + number.remove("three"));
        //Remove element that is not present
        if (number.remove("four")) {
            System.out.println("four removed from the Set");
        } else {
            System.out.println("four is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if four is present: " + number.contains("number"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + number);
    }

}