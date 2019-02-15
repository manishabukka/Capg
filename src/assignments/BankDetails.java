package assignments;

import java.util.Scanner;

public class BankDetails {
	double balance=500;
	double amount;
	int accno;
	Scanner sc = new Scanner(System.in);
	//credit
	public void transcation(double amount) {
	
		this.amount= amount;
		
		balance=balance+amount;
		System.out.println("New Balance"+balance);
		
	}
	private void transaction(double amount, int accno) {
		// TODO Auto-generated method stub
		this.amount=amount;
		if(balance>amount) {
		balance=balance-amount;
		System.out.println("New Balance"+balance);
		}
		else {
			System.out.println("Insufficient amount.");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Credit 2.debit 3.balance");
		System.out.println("enter choice:");	
		int s=sc.nextInt();
		BankDetails b = new BankDetails();
		switch(s)
		{
		
		case 1:
			System.out.println("enter amount:");	
			double num1=sc.nextDouble();
			
			b.transcation(num1);
			break;
		case 2:
			System.out.println("Enter amount");
			System.out.println("Enter acc no");
			double tempp=sc.nextDouble();
			int num2= sc.nextInt();
			b.transaction(tempp,num2);
			break;
		default:
			System.out.println("Enter valid input");
			
	}
		


}
	
}