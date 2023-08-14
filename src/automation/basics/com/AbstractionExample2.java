package automation.basics.com;

abstract class shape{
	
	public void area() {
		
	}
	
	public void area(int length, int breadth) {
		// TODO Auto-generated method stub
		
	}

	public void area(int radius) {
		// TODO Auto-generated method stub
		
	}

	public void colour() {
		System.out.println("Colour of the shape is");
	}
	
}

class circle extends shape{
	
	@Override
	public void area(int radius) {
		int area = 2*radius;
		System.out.println("the area is " +area);
	}
}

class rectangle extends shape{
	
//	int length;
//	int breadth;
	
	@Override
	public void area(int length,int breadth) {
		int area = length* breadth;
		System.out.println("the area is " +area);
	}
}

public class AbstractionExample2 {

	public static void main(String[] args) {
		circle c =new circle();
		rectangle r = new rectangle();
		c.area(4);
		r.area(2,5);
		

	}

}
