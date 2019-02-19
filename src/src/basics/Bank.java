package basics;

public class Bank {
	int accNo;
	int balance;
	public Bank()
	{
		System.out.println("constructor called");
	}
	public Bank(int accNo, int balance)
	 {
		this();
		 this.accNo=accNo;
		 this.balance=balance;
		 System.out.println(accNo+" "+balance);
		 new Bank();
	 }

	public static void main(String[] args) {
		
		{
		 
		 
		 Bank b2 = new Bank(22,76);
		 new Bank(68,98);

	}

}
}
