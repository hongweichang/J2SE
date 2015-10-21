package generics;

public class DemoImpl<T> implements Demo<T> {

	@Override
	public void print(T param) {
		System.out.println("param:"+param);		
	}

}
