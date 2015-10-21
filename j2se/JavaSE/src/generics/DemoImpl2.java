package generics;

public class DemoImpl2 implements Demo<DemoImpl2> {

	@Override
	public void print(DemoImpl2 demo) {
		System.out.println("param:"+demo);		
	}

}
