package generics3;

public class Basic implements Info {
	private String name;
	private int age;

	public Basic() {
		super();
	}

	public Basic(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public String toString() {//覆写

		return "人的信息：" + "\n" + "name:" + name + "\t" + "age:" + age;
	}

}
