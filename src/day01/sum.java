package day01;

import java.util.Scanner;

public class sum{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("*** SUM PROGRAM ***\n\n" + "Enter number 1: ");
		int a = sc.nextInt();

		System.out.println("Enter number 2: ");
		int b = sc.nextInt();

		int c = a + b;
		System.out.println("\n\nSUM: " + c);		

}
}
