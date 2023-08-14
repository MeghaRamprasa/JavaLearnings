package automation.basics.com;
	
abstract class flies{
	String color;
	
	//abstract methods
	abstract double area();
	public abstract String tostring();
	
	//constructor
	public flies(String c)
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


class butterfly extends flies{
	double radius;

	//it's own constructor
	public butterfly(String c, double r) {
		//calling flies constructor
		super(c);
		System.out.println("butterfly constructor is called");
		this.radius=r;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String tostring() {
		return "butterfly colour is" + super.getColor() + "and the area of the butterfly is " +area();
	}
	
}

class dragon extends flies{
	
	double length;
	double breadth;


	public dragon(String c, double l, double b) {
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
		return "dragon colour is" + super.getColor() + "and the area of the dragon is " +area();
		
	}
	
}

public class insects {
	public static void main(String[] args) {
		
		flies s2 = new dragon("Blue", 5.5, 4);
		
		//System.out.println(s3.toString());
		System.out.println(s2.toString());
				
				

	}

}
