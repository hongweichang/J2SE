package interfaceDemo;

abstract class C  implements A,B{//���������ʵ�ֶ���ӿ� ע�� ����û�з�����
	
	public abstract void funC();
}

interface D extends A,B{}//һ���ӿ�ͬʱ���Լ̳ж���ӿ�

interface A {
	/*public static final*/ String NAME = "cuiwenhao"; // 1.ȫ�ֳ���

	//public abstract void fun();  // 2.���󷽷�  *û�з�����
	public void fun(); //����ʡ�� abstract
	

	//public abstract void print();
	public void print();

}

interface B {//һ���ӿڲ��ܼ̳�һ��������
	
	public void funB();
}

public class interfaceTest extends C  { //һ����ֻ�ܼ̳�һ���� ����һ�������ʵ�ֶ���ӿ�
	//�ȼ̳���ʵ��
	public  void fun(){System.out.println("--fun--");}
	
	public void funB(){//�ӿ�B�еĳ��󷽷�
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
