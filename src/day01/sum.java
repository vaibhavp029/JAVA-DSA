package day01;

import java.util.Scanner;

public class sum{
	public static void add(int a, int b){
		int c = a + b;
		System.out.println("SUM: " + c);
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("""
                *** SUM PROGRAM ***
                
                Enter number 1:\s""");
		int a = sc.nextInt();

		System.out.print("Enter number 2: ");
		int b = sc.nextInt();

		add(a,b);

		sc.close();

}
}
