package HakerRank;

import java.util.Scanner;

public class TimeCon {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String time= sc.next();
		String arr[]=time.split(":");
		String ap= arr[2].substring(2,4);
		int hours=Integer.parseInt(arr[0]);
		int mins=Integer.parseInt(arr[1]);
		int secs=Integer.parseInt(arr[2].substring(0,2));
		int h = hours;
		if(ap.equals("AM") && h==12)
		{
			h=0;
		}else if(ap.equals("PM") && h<12)
		{
			h=h+12;
		}
		System.out.printf("%02d:%02d:%02d",h,mins,secs);
			
		

}
}
