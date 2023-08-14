package automation.basics.com;

public class Arrays {

	public static void main(String[] args) {
		int array[];
		float[] arraytwo;
		
		array = new int[6];
		arraytwo = new float[] {(float) 23.5,(float) 45.6};
		
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		array[5]=60;
		
		String[] arraythree = new String[] {"megha", "learning", "java", "testng", "selenium"};
		String arrayfour[] = new String[] {"megha1", "learning1", "java1", "testng1", "selenium1"};
		
		for(int i=0;i<6;i++)
		{
			System.out.println("The value of i " + i + " is " +array[i]);
		}

		for(int i=0;i<2;i++)
		{
			System.out.println("The value of i " + i + " is " +arraytwo[i]);
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("The value of i " + i + " is " +arraythree[i]);
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("The value of i " + i + " is " +arrayfour[i]);
		}
		
		
//		int multidimentional[];
//		multidimentional = new int[6];
//		
//		int arr[] = new int[2];
//		
//		multidimentional[0]= arr[];
	}

}
