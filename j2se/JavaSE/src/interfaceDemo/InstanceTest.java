package interfaceDemo;

class X {
	
	public void funX(){
		System.out.println("x�� public void funX()");
	}
	public void print(){
		System.out.println("x��public void print()");
	}
}

class Y extends X{
	
	public void print(){//Override
		System.out.println("y�าд��public void print()");
	}
	
	public void funY(){
		System.out.println("y�� public void funY()");
	}
}

class Z extends X{
	
	public void print(){//Override
		System.out.println("z�าд��public void print()");
	}
	
	public void funZ(){
		System.out.println("z�� public void funZ()");
	}
}

public class InstanceTest {
	public static void main(String[] args) {
		X x1 = new Y(); //����ת��
		X x2 = new Z();
		fun(x1);
		fun(x2);
	}
	public static void fun(X x){
		
		if (x instanceof Y) {
			Y y = (Y)x; //����ת��ʱ�������ж��Ƿ��������ʵ��
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
