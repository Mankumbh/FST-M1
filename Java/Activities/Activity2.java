package activities;

import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args) {

        int myArray[] = {10, 77, 10, 54, -11, 10};

        System.out.println("Original Array: " + Arrays.toString(myArray));

        int numSearch=10;
        int sum=30;

        System.out.println("Result: " + result(myArray, numSearch, sum));
    }

    public static boolean result(int[] numbers, int numSearch, int sum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == numSearch) {
                //Add them
                temp_sum += numSearch;
            }

            if (temp_sum > sum) {
                break;
            }
        }

        return temp_sum == sum;
    }
}
