package finalDemo;

class A{
	public final void  fun(){}
}

class B extends A{
	
	//public  void fun(){}
}

public class finalTest {
	public  final String NAME;
	
	public finalTest(String n){
		this.NAME = n;
	}
public static void main(String[] args) {
	finalTest f1 = new finalTest("sdsd");
	//f1.NAME="ddddddd";
	finalTest f2 = new finalTest("sss");


}
}
