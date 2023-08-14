package automation.basics.com;

class handling{
	static int dividebyzero(int a,int b)
	{
		int i = a/b;
		return i;
		
	}
	

static int computeDivision(int a, int b) {
	int res =0;
	try
	{
		res=dividebyzero(a,b);
	}
	catch(NumberFormatException ex){
		System.out.println("NumberFormat exception occured");
	}
	return 0;
}

public class exception {

	public static void main(String[] args) {
		int a =5;
		int b=0;
		
		 try {
			 int i = computeDivision(a,b);
			 
		 }
		 
		 catch (ArithmeticException ex) {
			 System.out.println(ex.getMessage());
		 }
		
	}
}


}
