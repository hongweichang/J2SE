package generics3;

public class Demo {

	public static void main(String[] args) {
		Person<Basic> per1 = new Person<Basic>();
		Person<Contact> per2 = new Person<Contact>();
		per1.setInfo(new Basic("cuiwenhao", 27));
		per2.setInfo(new Contact("13671291101", "wangjing"));
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
	}
}
