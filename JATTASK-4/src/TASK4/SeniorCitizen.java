package TASK4;

import java.util.Scanner;

public class SeniorCitizen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		if(age>=60) {
			System.out.println("senior citizen");
		}
		else {
			System.out.println("not a senior citizen");
		}
		sc.close();
	}

}
