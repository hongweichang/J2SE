package innerClass;

abstract class Apple {

	public abstract void eat();
}

class bug {

	public void fun1(Apple a) {
		a.eat();
	}

	public void fun2() {
		this.fun1(new Apple() {// 匿名内部类
			public void eat() {
				System.out.println("hello world!!!"); //实现抽象方法
			}
		});
	}
}

public class NonameTest {
	public static void main(String[] args) {
		new bug().fun2();
		
	}
}
