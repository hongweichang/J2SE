package innerClass;

class A{
	private static String name = "moonho";
	public static void sss(){
		System.out.println("sss");
	}
	
	static class B{//�ڲ�����static �ؼ��������Ļ��ͻ����ⲿ��
		
		String addr ="beijing";
		public void fun(){
			System.out.println(name);
			A.sss();
		}
	}
	 class C{//�ڲ�����static �ؼ��������Ļ��ͻ����ⲿ��
		
		String addr ="shanghai";
		public void fun(final String str){
			 class D{//�ڲ�����static �ؼ��������Ļ��ͻ����ⲿ��
					
					public void fun(){
						System.out.println("�������ڲ���ķ�����"+str);
					}
				}
			 new D().fun();
		}
	}
	public void print(){
		new B().fun();
		
	}

}

public class StaticTest {
public static void main(String[] args) {
	A.B b = new A.B();
	A.C c = new A().new C();
	
	b.fun();
	c.fun("�������");
}
}
