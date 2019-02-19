package conditional;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");	
		int num=sc.nextInt();
		int n=1;
		while(n<=10)
		{
			System.out.println(num+"*"+n+"="+(num*n));
			n++;
		}

}
}
