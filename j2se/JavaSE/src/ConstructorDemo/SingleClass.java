package ConstructorDemo;


//�������
class test{
	
	private static test t = new test();
	
	private test(){
			
	}
	
	//��̬����  ����ʵ��������Ҳ��ʹ��
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
