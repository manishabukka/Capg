package conditional;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");	
		int num1=sc.nextInt();
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		System.out.println("enter third number:");
		int num3=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("greatest"+num1);
			
		}
		else if(num2>num3)
		{
			System.out.println("greatest"+num2);
		}
		else if(num1==num2 && num2==num3)
		{
			
			System.out.println("not possible");
			
		}
		else
		{
			System.out.println("greatest"+num3);
			
		}

}
}