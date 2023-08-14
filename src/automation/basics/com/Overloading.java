package automation.basics.com;

public class Overloading {
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}

	public void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	 
	
	public static void main(String[] args) {
		Overloading OL = new Overloading();
		OL.sum(10, 20);
		OL.sum(28.5, 67.3);
		OL.sum(34, 34, 65);

	}

}
