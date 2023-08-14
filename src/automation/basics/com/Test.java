package automation.basics.com;
	
abstract class Shape{
	String color;
	
	//abstract methods
	abstract double area();
	public abstract String tostring();
	
	//constructor
	public Shape(String c)
	{
		System.out.println("Constructor is called");
		this.color= c;
		
	}
	
	//concrete method
	public String getColor()
	{
		return color;
	}
	
}


class Circle extends Shape{
	double radius;

	//it's own constructor
	public Circle(String c, double r) {
		//calling shape constructor
		super(c);
		System.out.println("Circle constructor is called");
		this.radius=r;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String tostring() {
		return "Circle colour is" + super.getColor() + "and the area of the circle is " +area();
	}
	
}

class Rectangle extends Shape{
	
	double length;
	double breadth;


	public Rectangle(String c, double l, double b) {
		super(c);
		this.length=l;
		this.breadth=b;
	}

	@Override
	double area() {
		return length*breadth;
	}

	@Override
	public String tostring() {
		return "Rectangle colour is" + super.getColor() + "and the area of the rectangle is " +area();
		
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		Shape s2 = new Rectangle("Blue", 5.5, 4);
		
		//System.out.println(s3.toString());
		System.out.println(s2.toString());
				
				

	}

}
