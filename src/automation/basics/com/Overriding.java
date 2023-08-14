package automation.basics.com;

class parent {
	public void show() {
		System.out.println("parent");
	}
}

class child extends parent{
	@Override
	public void show() {
		System.out.println("child");
	}
	
}
public class Overriding {
	
	

	public static void main(String[] args) {
		parent p = new parent();
		p.show();
		child c = new child();
		c.show();
		

	}

}
