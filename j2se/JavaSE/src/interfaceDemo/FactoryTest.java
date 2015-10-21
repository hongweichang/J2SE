package interfaceDemo; // 工厂设计模式

interface Fruit{
	
	public void eat();
}

class Apple implements Fruit{
	public void eat(){
		System.out.println("吃苹果。。");
	}
}

class Orange implements Fruit{
	public void eat(){
		System.out.println("吃橘子。。");
	}
}

class Factory{//工厂类
	public static Fruit getFruit(String fruitName){
		Fruit f = null;
		if ("apple".equals(fruitName)) {//*字符串比较时永远把常量放在前面
			f = new Apple();
		}
		if ("orange".equals(fruitName)) {
			f = new Orange();
		}
		return f;
	}
}

public class FactoryTest {
	
	public static void main(String[] args) {
		Fruit f = Factory.getFruit("orange");
		if (f!=null) {
			f.eat();
		}
		
		
	}
}
