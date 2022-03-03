package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Two Wheeler");
        myList.add("Three Wheeler");
        myList.add("Four Wheeler");
        //Adding object at specific index
        myList.add(2, "Scooter");
        myList.add(4, "Auto");
        myList.add(5, "Car");

        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is car is in list: " + myList.contains("Car"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("Auto");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}