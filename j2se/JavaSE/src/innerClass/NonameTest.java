package innerClass;

abstract class Apple {

	public abstract void eat();
}

class bug {

	public void fun1(Apple a) {
		a.eat();
	}

	public void fun2() {
		this.fun1(new Apple() {// �����ڲ���
			public void eat() {
				System.out.println("hello world!!!"); //ʵ�ֳ��󷽷�
			}
		});
	}
}

public class NonameTest {
	public static void main(String[] args) {
		new bug().fun2();
		
	}
}
