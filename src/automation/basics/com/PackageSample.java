package automation.basics.com;

public class PackageSample {

	public static void main(String[] args) {

		int meg = 0;
		if(meg<5)
		{
			System.out.println(meg);
			meg++;
		}else
		{
			System.out.println("Loop is stopped");
		}
		
		System.out.println(meg);
		
		if(true)
		{
			System.out.println("true");
		}else
		{
			System.out.println("false");
		}
		
		int seq1 = 20, seq2 = 20, seq3 = 60;
		if(seq1 > seq2)
		{
			System.out.println(seq1 +"is greater than" +seq2);
		}else if(seq1 > seq3)
		{
			System.out.println(seq2 +"is greater than" +seq3);
		}else if(seq3 > seq1 && seq3 > seq2)
		{
			System.out.println(seq3 +" is greater than " +seq1 +" and " +seq2);
		}else
		{
			System.out.println("None of the condition matches");
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Value of i is " +i);
		}

		//multiplcation(20,3);
	
	}
	
	static int multiplcation(int a , int b)
	{
		int mul = a*b;
		return mul;
	}
}

	
