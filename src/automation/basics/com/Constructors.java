package automation.basics.com;

public class Constructors {
	
	int length, breadth, height;
	void sampleconstructor(int l, int b, int h)
	{
		System.out.println("Sample Constructor is called");
		this.length=l;
		this.breadth=b;
		
	}

	public static void main(String[] args) {
		
		Constructors C = new Constructors();
		C.sampleconstructor(10,20,30);
		System.out.println(C.length);
		System.out.println(C.breadth);
		System.out.println(C.height);
		
	}

}
