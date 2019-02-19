package basics;

public class Batch {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("priya");
		s1.setRoll(12);
		s1.setFees(4545);
		s1.setCollegeName("Vjit123");
		/*System.out.println("Student1:");
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		System.out.println(s1.getFees());*/
		
		
		Student s2 = new Student();
		s2.setName("tom");
		s2.setRoll(13);
		s2.setFees(5000);
		s2.setCollegeName("Vjit");
		/*System.out.println("Student2:");
		System.out.println(s2.getName());
		System.out.println(s2.getRoll());
		System.out.println(s2.getFees());
		System.out.println(s2.getCollegeName()+"\n");*/
		
		Student s3 = new Student();
		s3.setName("priya");
		s3.setRoll(14);
		s3.setFees(5500);
		s3.setCollegeName("VjitManisha");
		/*System.out.println("Student3:");
		System.out.println(s3.getName());
		System.out.println(s3.getRoll());
		System.out.println(s3.getFees());
		System.out.println(s3.getCollegeName()+"\n");*/
		
		
		System.out.println(s1.getCollegeName()+"\n");
		System.out.println(s2.getCollegeName()+"\n");
		System.out.println(s3.getCollegeName()+"\n");
	}

}
