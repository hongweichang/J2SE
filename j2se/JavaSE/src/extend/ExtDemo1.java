package extend;

public class ExtDemo1 {

	public static void main(String[] args) {
		Student std = new Student("cuiwenhao", 22, "qinghua daxue");
		// std.setAge(12);
		// std.setName("cuiwenhao");
		// std.setSchool("beijing daxue");
		// System.out.println(std.getAge()+"  "+std.getName()+" "+std.getSchool());
		System.out.println(std.getInfo());

	}

}

class Student extends Person {
	private String school; // ���������

	public Student(String name, int age, String school) {
		super(name, age); // �����˴���� super() ���ø����е��޲ι��췽��
		this.school = school;
		// System.out.println("Student constructor");
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	//override �����ĸ�д
	public String getInfo() {

		return super.getInfo() + " school:" + this.school;
	}

}

class Person {

	private String name;
	private int age;

	public String getInfo() {

		return "name: " + this.name + " age:" + this.age;
	}

	public Person(String name, int age) {
		// System.out.println("Person constructor");
		this.name = name;
		this.age = age;
	}

	public Person() {
		System.out.println("--Person constructor");
	}

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
		this.age = age;
	}

}
