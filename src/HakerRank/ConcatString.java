package HakerRank;

import java.util.Scanner;

public class ConcatString {
	String s,s1,s2;
	int x,y;
	Scanner sc= new Scanner(System.in);
	public  void concating()
	{
		System.out.println("enter String:");
		s=sc.nextLine();
		x=s.length();
		System.out.println("enter String:");
		s1=sc.nextLine();
		y=s1.length();		
		s2=s.concat(s1);
		char[] ar= s.toCharArray();
		char[] ar1= s1.toCharArray();
		System.out.println(s2);
		char a[]= new char[x+y];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if((i%2)==0)
			{
				a[i]=ar[j];
				j++;
				
				
			}
			
			
		}
		int j1=0;
		for (int k = 0; k < a.length; k++) {
		if((k%2)!=0)
			{
				a[k]=ar1[j1];
				j1++;
				
			}
			
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConcatString i1= new ConcatString();
		i1.concating();
		
		
	}
}
