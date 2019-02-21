package filesconcepts;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputs1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 FileInputStream fileInputStream;
		
			try {
				fileInputStream = new FileInputStream("D:\\Programs\\demo2.txt");
				try {
					System.out.println(fileInputStream.read());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("done");
			
	
		 

	}

}