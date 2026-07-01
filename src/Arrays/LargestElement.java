public class LargestElement
{
 public static int largestElement(int[] arr)
 {
  int max = arr[0];
  for(int i=1; i<arr.length; i++)
  {
   if(arr[i] > max)
   {
    max = arr[i];
   }
  }
 return max;
 }

 public static void main(String[] args)
 {
  int arr[] = {10, 25, 2, 65, 28, 42, 0};

  System.out.println("Largest Element: " + largestElement(arr));
 }
}
