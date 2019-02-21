package HakerRank;

import java.util.Scanner;

public class Picture {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,w,h;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter L:");
		l=sc.nextInt();
		System.out.println("enter W:");
		w=sc.nextInt();
		System.out.println("enter H:");
		h=sc.nextInt();
		
		 if((w>=l) && (h>=l))
		{
			if(h==w)
			{
				System.out.println("accepted");
			}
			else 
			{
				System.out.println("crop it");
			}
		}
		 else
		 {
			 System.out.println("upload another photo");
		 }
		
		
	}

}
