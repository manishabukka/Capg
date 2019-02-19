package Exceptions;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		int a=17;
		
		int arr[] = { 2, 3, 4, 5};
		try
		{
			//System.out.println(a/0);
			
			System.out.println(arr[7]);
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("end");

	}

}
