package TASK4;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num==");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given number is prime number");
		}
		else {
			System.out.println("Given number is odd number");
		}
		sc.close();
		
	}
}
