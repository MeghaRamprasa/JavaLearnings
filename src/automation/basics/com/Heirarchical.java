package automation.basics.com;


class teacher{
	public void science()
	{
		
	}
}

class student1 extends teacher{
	public void maths()
	{
		
	}
}

class student2 extends teacher{
	
}

class student3 extends teacher{
	
}

public class Heirarchical {
	
	public static void main(String[] args) {
		student1 s1 = new student1();
		s1.science();
		s1.maths();
		
		student2 s2 = new student2();
		s2.science();
		
		
		student3 s3 = new student3();
		s3.science();
		

	}

}
