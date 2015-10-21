package interfaceDemo;

abstract class C  implements A,B{//抽象类可以实现多个接口 注意 可以没有方法体
	
	public abstract void funC();
}

interface D extends A,B{}//一个接口同时可以继承多个接口

interface A {
	/*public static final*/ String NAME = "cuiwenhao"; // 1.全局常量

	//public abstract void fun();  // 2.抽象方法  *没有方法体
	public void fun(); //可以省略 abstract
	

	//public abstract void print();
	public void print();

}

interface B {//一个接口不能继承一个抽象类
	
	public void funB();
}

public class interfaceTest extends C  { //一个类只能继承一个类 但是一个类可以实现多个接口
	//先继承再实现
	public  void fun(){System.out.println("--fun--");}
	
	public void funB(){//接口B中的抽象方法
		System.out.println(NAME+"---------");
		
	}
	public  void funC(){
		
		System.out.println("abstract");
	}

	public   void print(){System.out.println("--print--");}

	public static void main(String[] args) {
		new interfaceTest().fun();
		new interfaceTest().print();
		new interfaceTest().funB();
		new interfaceTest().funC();
		System.out.println(NAME);
	}

}
