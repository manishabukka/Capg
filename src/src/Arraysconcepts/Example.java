package Arraysconcepts;

import java.util.Scanner;

public class Example {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,size;
		System.out.println("enter size");
		size = sc.nextInt();
		int accNo[] = new int[size];
		for (int i = 0; i < accNo.length; i++) {
			System.out.println("enter element : ");
			num = sc.nextInt();
			accNo[i]=num;
		}
		for (int i = 0; i < accNo.length; i++) {
			System.out.println(accNo[i]);
			
		}

}
}
