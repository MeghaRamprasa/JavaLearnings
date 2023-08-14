package automation.basics.com;

class A{
	public void methodA(){
		System.out.println("Method A");
	}
}

 class B extends A{
	public void methodB(){
		System.out.println("Method B");
	}
}

 class C extends B{
	public void methodC(){
		System.out.println("Method C");
	}
}
public class Inheritance {


	
	public static void main(String[] args) {
		
		System.out.println("Single Inheritance");
		//Inheritance IH = new Inheritance();
		B b=new B();
		b.methodA();
		b.methodB();
		
		System.out.println("Multiple Inheritance");
		//Inheritance IH1 = new Inheritance();
		C c=new C();
		c.methodA();
		c.methodB();
		c.methodC();
		
	}

}
