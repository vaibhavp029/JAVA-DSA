package day03;

public class Find_Minimum {
    public static void main(String[] args){

        int[] arr = {10,18,2,12,32,0,5};
        int min = arr[0];

        for(int i: arr){
            if(i<min)
                min = i;
        }

        System.out.print("Minimum in array: " + min);
    }
}
