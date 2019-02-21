package HakerRank;

import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter seat no:");
		n=sc.nextInt();
		s=n%12;
		switch(s)
		{
		case 0:
			System.out.println("seat:"+(n-11)+" WS");
			break;
		case 1:
			System.out.println("seat:"+(n+11)+" WS");
			break;
		case 2:
			System.out.println("seat:"+(n+9)+" MS");
			break;
		case 3:
			System.out.println("seat:"+(n+7)+" AS");
			break;
		case 4:
			System.out.println("seat:"+(n+5)+" AS");
			break;
		case 5:
			System.out.println("seat:"+(n+3)+" MS");
			break;
		case 6:
			System.out.println("seat:"+(n+1)+" WS");
			break;
		case 7:
			System.out.println("seat:"+(n-1)+" WS");
			break;
		case 8:
			System.out.println("seat:"+(n-3)+" MS");
			break;
		case 9:
			System.out.println("seat:"+(n-5)+" AS");
			break;
		case 10:
			System.out.println("seat:"+(n-7)+" AS");
			break;
		case 11:
			System.out.println("seat:"+(n-9)+" MS");
			break;
		}
		
		

	}

}
