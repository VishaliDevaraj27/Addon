package project;

import java.util.Scanner;

public class nestedifelse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		System.out.println("Enter your Weight:");
		int weight=sc.nextInt();
		if(age>=20){
			if(weight>=50) {
				System.out.println("'Age and weight are satisfied to donate blood'");
			}
			else
			{
				System.out.println("'Oops you are under weight!'");
			}
		}
		else
		{
			System.out.println("Age is not satisfied to donate blood");
		}
	}

}
