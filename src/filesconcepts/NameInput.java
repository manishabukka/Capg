package filesconcepts;


import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class NameInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 FileInputStream fileInputStream;
		
			try {
				fileInputStream = new FileInputStream("D:\\Programs\\name1.txt");
				try {
					int i;
					while((i=fileInputStream.read())!=-1)
					System.out.println((char)i);
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