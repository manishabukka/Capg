package basics;

import java.util.Scanner;

public class BasicArithmatic {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num3;
		System.out.println("enter first number:");	
		double num1=sc.nextDouble();
		System.out.println("enter second number:");
		double num2=sc.nextDouble();
		System.out.println("enter operator:");
		String ch=sc.next();
		switch(ch)
		{
		
		case "+": num3=num1 + num2;
		System.out.println("addition is"+num3);
		break;
		case "-": num3=num1 - num2;
		System.out.println("subtraction is"+num3);
		break;
		case "*": num3=num1 * num2;
		System.out.println("multiplication is"+num3);
		break;
		case "/": num3=num1 / num2;
		System.out.println("division is"+num3);
		break;
		default: System.out.println("error");
		
		}
	}

}
