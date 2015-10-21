package staticDemo;

class Person{
	String name ;
	private static String city="A city";
	public Person(String name){
		System.out.println("--");
		this.name = name;
	}
	public static void setCity(String c){
		city = c;

	}
	public String getInfo(){
	
		return "name:"+name+" city:"+city;
	}
}

public class staticTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("lilei");
		Person p2 = new Person("mary");
		
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
		Person.setCity("B city");
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
	}

}
