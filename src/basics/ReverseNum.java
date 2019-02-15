package basics;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");	
		int num1=sc.nextInt();
		
		
		while(num1!=0)
		{
			int rem;
			int rev= num1%10;
			rev=rev*10+rem;
			num1=num1/10;
			
		}

	}

}
