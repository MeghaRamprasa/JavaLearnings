package learn.basics.com;

public class DataTypes {

	public static void main(String[] args) {
		int num= 41000;
		short num2 = 20;
		boolean toggle = true;
		char myLetter = 'M';
		int myNumChange = 15;
		double decimals = 2.8;
		float dec = (float) 0.8;
		
		
		char alpha;//declaration of char is changed from old to new format
		alpha = 234;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(alpha);
		System.out.println(toggle);
		System.out.println(myLetter);
		System.out.println(myNumChange);

		System.out.println("Reassigning  new value for myNumChange");
		myNumChange = 20;  // myNum is now 20
		System.out.println(myNumChange);
		
		short range =  (short) 41000; //Add cast to short
		System.out.println(range);
		System.out.println(decimals);
		System.out.println(dec);
		
	}

}
