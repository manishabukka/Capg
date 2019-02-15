package abstractclasse;

public class Person extends Human{
	public static void main(String[] args)
	{
	Human h = new Person();
	h.walk();
	h.move();
	h.dance();
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("walking");
		
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("moving");
		
	}

}
