package day02;

public class Max_number {
    public static void main(String[] args)
    {
        int[] arr = {8,110,52,1,45};
        int max = arr[0];

        for(int i: arr)
        {
            if(i>max)
            {
                max = i;
            }
        }

        System.out.print("Max element in array: " + max);
    }
}
