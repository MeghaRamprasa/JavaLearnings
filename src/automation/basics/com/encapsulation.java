package automation.basics.com;

class person{
	private int age;
	private String name;
	
	public void setAge(int a) { this.age= a;}
	public void setName(String n) {this.name=n;}
	
	public int getAge() {return age;}
	public String getName() {return name;}
	
	
}

public class encapsulation {

	public static void main(String[] args) {
		
		person p = new person();
		p.setAge(31);
		p.setName("Megha");
		
		
		System.out.println("Name of the person is " +p.getName());
		System.out.println("Age of the person is " +p.getAge());

	}

}
