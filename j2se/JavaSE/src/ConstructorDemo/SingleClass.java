package ConstructorDemo;


//单例设计
class test{
	
	private static test t = new test();
	
	private test(){
			
	}
	
	//静态方法  不用实例化对象也能使用
	public static test getTestObj(){
		
		return t;
	}
	
	public void print(){
		
		System.out.println("-----------");
	}
}

public class SingleClass {
  public static void main(String[] args) {
	test.getTestObj().print();
	
}
	
}
