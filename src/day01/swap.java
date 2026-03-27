package day01;

import java.util.Scanner;

class swap{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.print("*** SWAP ***\n\nEnter first integer: ");
	int a = sc.nextInt();
	System.out.print("Enter second integer: ");
	int b = sc.nextInt();
	
	System.out.println("\nBefore Swapping:\na: " + a + "\nb: " + b);

	a = a + b;
	b = a - b;
	a = a - b;

	System.out.println("\nAfter Swapping:\na: "+ a + "\nb: " + b);	
	
}
}
