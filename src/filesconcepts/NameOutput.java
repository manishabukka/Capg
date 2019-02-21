package filesconcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class NameOutput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("D:\\Programs\\name1.txt");
			System.out.println("enter String");
			String s= sc.next();
			byte[] b= s.getBytes();
			fileOutputStream.write(b);
			System.out.println("done");
			fileOutputStream.close();
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}