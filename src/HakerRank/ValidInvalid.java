package HakerRank;

import java.util.Scanner;

public class ValidInvalid {
	public static void main(String[] args) {
String s;
Scanner sc = new Scanner(System.in);
 s=sc.next();

if(s.contains("A") || s.contains("E") || s.contains("I") || s.contains("O") || s.contains("U") || s.contains("Y")) {
	
	System.out.println("invalid");
}
else {
	
	if((s.charAt(0) + s.charAt(1))%2==0 && (s.charAt(0) + s.charAt(1))%2==0 && (s.charAt(0) + s.charAt(1))%2==0 && (s.charAt(0) + s.charAt(1))%2==0)
	{
		
		System.out.println("valid");
	}
	else {
		System.out.println("invalid");
	}
	
}
}
}

