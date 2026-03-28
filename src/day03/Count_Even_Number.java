package day03;

public class Count_Even_Number {
    public static void main(String[] args){
        int[] arr = {10,19,2,11,31,1,50};
        int countEven = 0;

        for(int i : arr){
            if(i%2==0)
                countEven++;
        }

        System.out.print("Even Numbers in array: " + countEven);
    }
}
