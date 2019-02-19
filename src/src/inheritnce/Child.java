package inheritnce;

public class Child extends Parent {
	String car="audi15";
	
	public Child()
	{
		System.out.println(car);
		System.out.println(super.car);
		super.show();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		
	c1.show();

	}

}
