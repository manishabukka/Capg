package conditional;

import java.util.Scanner;

public class Integers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num1=sc.nextInt();
		
		if(num1%2==0) {
			num1=num1+10;
		
			System.out.println("answer is"+num1);
		}
			else
			{
				num1=num1+15;
				System.out.println("answer is"+num1);
			
			}
				
			
		

	}

}
