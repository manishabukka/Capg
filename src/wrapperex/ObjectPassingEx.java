package wrapperex;

import java.util.Scanner;
import basics.Student;

public class ObjectPassingEx {
	Student s = new Student();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1 = new Student();
		ObjectPassingEx ob = new ObjectPassingEx();
		s1 = ob.accept();
		ob.display(s1);

	}

	private void display(Student s1) {
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getFees());
		
	}

	private Student accept() {
		// TODO Auto-generated method stub

		System.out.println("enter name");
		s.setName(sc.next());
		System.out.println("enter roll");
		s.setRoll(sc.nextInt());
		System.out.println("enter fees");
		return s;
	}

}
