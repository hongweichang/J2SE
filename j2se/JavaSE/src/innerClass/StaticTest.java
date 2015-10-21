package innerClass;

class A{
	private static String name = "moonho";
	public static void sss(){
		System.out.println("sss");
	}
	
	static class B{//内部类由static 关键字声明的话就会变成外部类
		
		String addr ="beijing";
		public void fun(){
			System.out.println(name);
			A.sss();
		}
	}
	 class C{//内部类由static 关键字声明的话就会变成外部类
		
		String addr ="shanghai";
		public void fun(final String str){
			 class D{//内部类由static 关键字声明的话就会变成外部类
					
					public void fun(){
						System.out.println("方法中内部类的方法："+str);
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
	c.fun("传递这个");
}
}
