package innerClass;

//内部类可以方位外部类的私有成员

class Outter{
	
	private String name = "cuiwenhao";
	
	private void out(){
		
		System.out.println("out out");
	}
	
	class Inner{				
		public void print(){
			
			System.out.println("happy new year! "+name);
			new Outter().out();
		}
		
	}	
	public void fun(final String str){		
		class In{				
			public void pout(){			
				System.out.println(str+"! "+name);
			}
		}
		new In().pout();
	}
}


public class InnerTest {
	
	
	public static void main(String[] args) {
		Outter out = new Outter(); 
		Outter.Inner in = out.new Inner(); //实例化内部类对象
		
		in.print();
		out.fun("nihao");
		
		
		
	}

}


