package learn.basics.com;

import automation.basics.com.PackageSample;

public class HelloWorld {
	
	int variablepresentthroughout; //is this instance variable? can be access in all methids but not main
	static int whatisstaticvariable; //This is static variable, can be used throughout the class, in methods and main
	 
	
	
	public void method() {
		int isthislocalvariable =10;
		System.out.println(isthislocalvariable); 
		System.out.println("Yes it is only present to this method");
		System.out.println(variablepresentthroughout);
		System.out.println(whatisstaticvariable);
	}

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		
		
		//Declaring variables
		int megha = 3003;
		System.out.println(megha);
		
		String data = "mynameismegha";
		System.out.println(data);
		
		int declaring;
		declaring = 1992;
		System.out.println(declaring);
		
		System.out.println(whatisstaticvariable);
		
	//	System.out.println(differenttypes); different types of variables 
		

	}

}
