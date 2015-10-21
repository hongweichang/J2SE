package Abstract;
//抽象类的应用 ：最大的功能就是模板设计
abstract class Person {
	
	private String name; //封装性
	private int age;
	
	public Person(String name,int age){
		
		this.name = name;
		this.age = age;
	}
	
	public void say(){
		System.out.println(this.getContent());
	}
	
	public abstract String getContent();
	
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

class Student extends Person {
	private float score;
	
	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public Student(String name,int age,float score){
		
		super(name, age);
		this.score = score;
	}
	
	public String getContent(){
		return "student say --> name: "+super.getName()+" age: "+super.getAge()+" score: "+this.getScore();
	}
}

class Worker extends Person { //继承性
	int saraly;
	public Worker(String name,int age, int saraly){
		super(name, age);
		this.saraly = saraly;
	}
	public int getSaraly() {
		return saraly;
	}
	public void setSaraly(int saraly) {
		this.saraly = saraly;
	}
	public String getContent(){
		return "worker say --> name: "+super.getName()+" age: "+super.getAge()+" saraly: "+this.getSaraly();
	}
}



public class AbstractTest {
	public static void main(String[] args) {
		Person p1 = new Student("cuiwenhao", 18, 100.0f); //对象多态性
		Person p2 = new Worker("moonho", 18, 12000);
		p1.say();
		p2.say();
	}

}
