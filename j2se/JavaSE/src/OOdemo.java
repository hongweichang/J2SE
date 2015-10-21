class Person {

	private String name; // ������������ Ĭ��ֵ��null
	private int age; // ������������ ��ֵ�� ���� Ĭ��ֵ��0

	public Person() {
		System.out.println("�޲ι��췽��");
	}

	public Person(String name) {
		this.setName(name);
	}

	public Person(int age) {
		this.setAge(age);
	}

	public Person(String name, int age) {
		this.setAge(age);
		this.setName(name);
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
		}

	}

	public void tell() {
		System.out.println("name : " + name + " age: " + age);
	}
}

public class OOdemo {

	public static void main(String[] args) {

		Person p1 = null;
		p1 = new Person("bbb", -26); // ������ʵ��������
		new Person("aaa").tell();
		new Person();
		p1.tell();

	}

}
