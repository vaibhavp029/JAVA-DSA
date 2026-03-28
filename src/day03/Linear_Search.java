package day03;

import java.util.Scanner;

public class Linear_Search {
    public static void linearSearch(int[] arr, int target){

        int foundCount = 0;

        for(int i=0; i<arr.length; i++){
            if(target==arr[i]){
                if(foundCount==0) {
                    System.out.print("\nElement found at indices: " + i);
                }
                else{
                    System.out.print(", " + i);
                }
                foundCount++;
            }
        }

        if(foundCount==0){
            System.out.print("Element not found!");
        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        int[] arr = {0,18,2,2,32,0,5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Array Elements: ");

        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.print("\n\nEnter element to search: ");
        int target = sc.nextInt();

        linearSearch(arr, target);

        sc.close();
    }
}
