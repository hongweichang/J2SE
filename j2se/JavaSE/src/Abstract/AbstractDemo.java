package Abstract;

abstract class A {// �����������һ�����󷽷�,��һ�������һ�����󷽷�

	public A() {

		System.out.println("AA");
	}

	public abstract void fun();
}

class B extends A {

	public B() {
		super(); //Ĭ�����ص����
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
