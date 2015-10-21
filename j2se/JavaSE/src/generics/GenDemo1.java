package generics;

public class GenDemo1 {

	
	public static void main(String[] args) {

		Point<String> p1 = new Point<String>();
		Point<Object> p2 = new Point<Object>();
		fun(p1);
		fun(p2);
	/*	p.setX(12);
		p.setY(23);*/
		
	

	}
	
	public static void fun(Point<? super String> po){// ?表示接收任意的泛型类型 方法上也可以用上限
		//super 下限
			System.out.println("x:"+po.getX());
		System.out.println("y:"+po.getY());
		
	}

}
