package automation.basics.com;



abstract class Abstractionclass {
	
	public void abstractmethod1()
	{
		
	}
	
	public void abstractmethod2()
	{
		
	}
	
	public void addition()
	{
		int a=20;
		int b=3;
		System.err.println("Method with concrete steps " + a+b);
	}
	
class child extends Abstractionclass{
		
		@Override
		public void abstractmethod1()
		{
			
		}
		
		//writing override word is mandatory in child class when the abstract method 
		//from abstract parent class is used?
		public void abstractmethod2()
		{
			
		}
	}
	

public class Abstraction {

	public void main(String[] args) {
		child c = new child();
		c.abstractmethod1();
		c.abstractmethod2();
		c.addition();
		
		child c2 = new child();
		c2.addition();
		c2.abstractmethod1();
		c2.abstractmethod2();

	}

}
}

