public class LinearSearch
{
	public static boolean contains(int[] arr, int target)
	{
		for(int i=0; i<arr.length; i++)
		{
			 if(arr[i]==target)
			 {
			  return true;
			 }
		}
		return false;
	}

	public static void forAllIndices(int[] arr, int target)
	{
	 System.out.print("At Indices: ");
	 boolean found = false;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]==target)
			{
			found = true;
			System.out.print(i + " ");
			}
		}
		if(!found)
		{
		System.out.print("Not found");
		}		
	}

	public static int countOccurrences(int[] arr, int target)
	{
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
		 if(arr[i] == target)
		 {
		  count++;
		 }
		}
		return count;
	}

	public static void main(String[] args)
	{
		int[] arr = {10,20,10,40,10};
		int target = 40;

		System.out.println("Contains: " + contains(arr, target));
		forAllIndices(arr, target);
		System.out.println("\nOccurrences: " + countOccurrences(arr, target) + "\n\n");
	
		target = 70;
		
		System.out.println("Contains: " + contains(arr, target));
		forAllIndices(arr, target);
		System.out.println("\nOccurrences: " + countOccurrences(arr, target) + "\n\n");
	
		target = 10;

		System.out.println("Contains: " + contains(arr, target));
		forAllIndices(arr, target);
		System.out.println("\nOccurrences: " + countOccurrences(arr, target) + "\n\n");
	}

}
