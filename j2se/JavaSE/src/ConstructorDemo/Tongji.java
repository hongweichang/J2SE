package ConstructorDemo;

class t{
	private static int a = 0;
	String name;
	public t(){
		a++;
		name = "Noname - "+a;
		
	}
	public t(String name){
		this.name = name;
	}
	public void getInfo(){
		
		System.out.println("name: "+name);
	}
}
public class Tongji {
	public static void main(String[] args) {
		new t().getInfo();
		new t("sf").getInfo();
		new t().getInfo();
		new t("sdfsfd").getInfo();
	}

}
