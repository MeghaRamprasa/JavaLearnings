package automation.basics.com;

public class Strings {

	public static void main(String[] args) {

		String name = "Megha"; //same memory allocated to name and name1
		String name1 = "Megha";
		String name2 = new String("Ramprasad"); //different memory is allocated to name2 and name3
		String name3 = new String("Ramprasad");
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		StringBuffer SB = new StringBuffer("GeeksOfGeeks"); //how and where to use this?
		StringBuilder StrBuild = new StringBuilder();StrBuild.append("ABC");
		System.out.println(StrBuild);
	}

}
