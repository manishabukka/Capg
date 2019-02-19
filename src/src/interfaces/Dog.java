package interfaces;

public class Dog implements Animal {

	public static void main(String[] args) {
		Dog g = new Dog();
		g.bark();
		g.eat();
		g.sleep();
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("dog is barking");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog is eating");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("dog is sleeping");
		
	}

}
