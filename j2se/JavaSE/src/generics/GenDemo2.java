package generics;

public class GenDemo2 {

	
	public static void main(String[] args) {
		Demo<String> di = new DemoImpl<String>();
		
		Demo<DemoImpl2> di2 = new DemoImpl2();
		di.print("piaomeiguang");
		System.out.println(di2);
		di2.print(new DemoImpl2());
		
	}

}
