package Abstract;

abstract class A {// 抽象类必须有一个抽象方法,比一般类多了一个抽象方法

	public A() {

		System.out.println("AA");
	}

	public abstract void fun();
}

class B extends A {

	public B() {
		super(); //默认隐藏的语句
		System.out.println("BB");
	}

	public void fun() {
		System.out.println("ss");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {

		B b = new B();
		b.fun();
	}

}
