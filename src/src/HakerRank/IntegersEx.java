package HakerRank;

import java.util.Scanner;

public class IntegersEx {
	
	public static void arr(int[] arr1,int n)
	{
		float s1=0,s2=0,s3=0,c1=0,c2=0,c3=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<0)
			{
				s1++;
			}
			else if(arr1[i]==0)
			{
				s2++;
			}
			else if(arr1[i]>0)
			{
				s3++;
			}
			 c1= s1/n;
		 c2= s2/n;
			 c3= s3/n;
		}
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num,size;
		System.out.println("enter size");
		size = sc.nextInt();
		int arr2[] = new int[size];
		System.out.println("enter element : ");
		for (int i = 0; i < arr2.length; i++) {
			
			num= sc.nextInt();
			arr2[i]=num;
		}
		IntegersEx i1 = new IntegersEx();
		i1.arr(arr2,size);
	}

}
