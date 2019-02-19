package Arraysconcepts;

import java.util.Scanner;

public class MultiDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Long accNo,adhNo,bal,phn;
		long num;
		long kotak[][] = new long[4][];
		long custdetails1[] = new long[4];
		long custdetails2[] = new long[4];
		long custdetails3[] = new long[4];
		long custdetails4[] = new long[4];
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 for (int i = 0; i < custdetails1.length; i++) {
			 System.out.println("enter  details");
			 num=sc.nextLong();
			  custdetails1[i]=num;
			 
			
		}
		 
		 for (int i = 0; i < custdetails2.length; i++) {
			 System.out.println("enter  details");
			 num=sc.nextLong();
			 custdetails2[i]=num;
			 
			
		}
		 
		 for (int i = 0; i < custdetails3.length; i++) {
			 System.out.println("enter details");
			 num=sc.nextLong();
			 custdetails3[i]=num;
			 
			
		}
		 
		 for (int i = 0; i < custdetails4.length; i++) {
			 System.out.println("enter details");
			 num=sc.nextLong();
			 custdetails4[i]=num;
			 
			
		}

		 kotak[0] = custdetails1;
		 kotak[1] = custdetails2;
		 kotak[2] = custdetails3;
		 kotak[3] = custdetails4;
		 for (int i = 0; i < kotak.length; i++) {
			 for(int j=0; j<kotak[i].length;j++) {
				 System.out.println(kotak[i][j]);
				 
			 }
			 System.out.println();
			
		}
		

}
}