package automation.basics.com;

public class JumpStatements {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++)
		{
			
			if(i == 2 || i == 6)
			{
				continue;
			}else
			System.out.println("the value of " + i);
		}
		
		System.out.println("@@@@@@");
		
		for(int i=1;i<=10;i++)
		{
			
			if(i == 2 || i == 6)
			{
				break;
			}else
			System.out.println("the value of " + i);
		}
		
		System.out.println(sumof2numbers(12, 12));
		
	}
	static int sumof2numbers(int a,int b)
	{
		int sum = a+b;
		return sum;
		
	}

	//Practice with Examples

}
