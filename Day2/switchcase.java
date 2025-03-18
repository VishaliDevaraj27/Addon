package project;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("'Select an Operator:'");
		System.out.println("1.Addition:");
		System.out.println("2.Subtraction:");
		System.out.println("3.Multiplication:");
		System.out.println("4.Division:");
		System.out.println("Enter your choice:");				
		int choice = sc.nextInt();
		System.out.println("Enter the First number:");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number:");
		double num2=sc.nextDouble();
		double result;
		switch(choice)
		{
		case 1:
			System.out.println("ADDITION");
			result=num1-num2;
			System.out.println("Result="+result);
			break;
		case 2:
			System.out.println("SUBTRACTION");
			result=num1+num2;
			System.out.println("Result="+result);
			break;
		case 3:
			System.out.println("MULTIPLICATION");
			result=num1*num2;
			System.out.println("Result="+result);
			break;
		case 4:
			System.out.println("DIVISION");
			if(num2!=0)
				{
				result=num1/num2;
				System.out.println("Result:"+result);
				}
			else {
				System.out.println("Error!");
				
			}
			break;
			
		default:
				System.out.println("INVALID OPTION");
		}
		
	}
}
