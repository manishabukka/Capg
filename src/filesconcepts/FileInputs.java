package filesconcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("D:\\Programs\\demo2.txt");
			System.out.println("enter integer");
			int n=sc.nextInt();
			fileOutputStream.write(n);
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
