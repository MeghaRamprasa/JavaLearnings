package learn.basics.com;

public class Operations {

	public static void main(String[] args) {
		
		//Arithmetic Operations
		int op1 = 10;
		int op2 = 20;
		double op3 = op1/op2;
		int op4 = -10;
		
		System.out.println(op1+op2);
		
		System.out.println(op1*op2);
		
		System.out.println(op1/op2); //10/20=0.5
		System.out.println(op3);
		
		System.out.println(op1%op2); 
		
		System.out.println(op2%op1); 
		
		System.out.println(op1-op2);
		
		System.out.println(op4-op2);
		
		System.out.println(op2-op1);
		
		System.out.println("END");
		
		//Unary Operations
		for(int meg=0; meg>=10; meg++)
		{
			System.out.println(meg);
		}
		

	}


}
