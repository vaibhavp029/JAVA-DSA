package day04;

import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr, int low, int high, int target){
        while(low<=high) {
            int mid = (low + high) / 2;
            if(target == arr[mid])
            {
                return mid;
            }

            else if(target < arr[mid])
            {
                high = mid - 1;
            }

            else if (target > arr[mid])
            {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //array must be sorted
        int[] arr = {2, 5, 8, 12, 15,};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to search in array: ");
        int target = sc.nextInt();
        int low = 0;
        int high = (arr.length - 1);

        int result = binarySearch(arr, low, high, target);

        if(result == -1)
            System.out.print("Element not found!");

        else
            System.out.print("Element found at index " + result);

        sc.close();

    }
}