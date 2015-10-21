package interfaceDemo;

class X {
	
	public void funX(){
		System.out.println("x类 public void funX()");
	}
	public void print(){
		System.out.println("x类public void print()");
	}
}

class Y extends X{
	
	public void print(){//Override
		System.out.println("y类覆写的public void print()");
	}
	
	public void funY(){
		System.out.println("y类 public void funY()");
	}
}

class Z extends X{
	
	public void print(){//Override
		System.out.println("z类覆写的public void print()");
	}
	
	public void funZ(){
		System.out.println("z类 public void funZ()");
	}
}

public class InstanceTest {
	public static void main(String[] args) {
		X x1 = new Y(); //向上转型
		X x2 = new Z();
		fun(x1);
		fun(x2);
	}
	public static void fun(X x){
		
		if (x instanceof Y) {
			Y y = (Y)x; //向下转型时必须先判断是否是子类的实例
			y.funY();
			y.funX();
			y.print();
		}
		
		if (x instanceof Z) {
			Z z = (Z)x;
			z.funZ();
			z.funX();
			z.print();
		}
	}

}
