package project;

import java.util.Scanner;

public class conditionalstatement {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("'not to vote'");
		}
		else
		{
			System.out.println("'eligible to vote'");
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ticket price:");
		int price=sc.nextInt();
		if(price>=60 && price<=100)
		{
			System.out.println("'seat from 1 to 30'");
			
		}
		else if(price>100 && price<350)
		{
			System.out.println("'seat from 31 to 100'");
		}
		else if(price>350 && price<999)
		{
			System.out.println("'seat from 101 to 300'");
		}
		else 
		{
			System.out.println("'you can be seated in a special cabin'");
		}
	}
}
