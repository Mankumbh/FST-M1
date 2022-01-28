package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String args[]) {
        int[] arr = { 9, 5, 1, 4, 3 };
        sort(arr);
        System.out.println("Array sorted in Ascending Order: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    }
