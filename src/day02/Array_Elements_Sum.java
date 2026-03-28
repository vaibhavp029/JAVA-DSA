package day02;

public class Array_Elements_Sum {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int i : arr)
        {
            sum = sum + i;
        }

        System.out.println("Sum of elements in array: " + sum);
    }
}
