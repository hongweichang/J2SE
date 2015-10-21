package thisdemo;


class Person{
	private String name;
	private int age;
	public void print(Person per){
		
		System.out.println(this);
		System.out.println(per);
	}
	
	
}
public class ThisDemo {
	
	static{ //¾²Ì¬¿é
		
		System.out.println("static -----");
		//System.exit(1);
	}

	public static void main(String[] args) {
		
		Person per = new Person();
		per.print(per);
	}

}
