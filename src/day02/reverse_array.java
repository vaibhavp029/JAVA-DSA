package day02;

public class reverse_array {
    public static void main(String[] args){
        int[] arr = {8, 2, 3, 5, 7, 1};
        System.out.print("Array before reversing: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }

        System.out.print("\n\nArray after reversing: ");

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
