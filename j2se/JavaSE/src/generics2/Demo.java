package generics2;

public class Demo {


	public static void main(String[] args) {
		
		Person<Info<String>> p = new Person<Info<String>>();//���͵�Ƕ������
		p.setInfo(new Info<String>());
		p.getInfo().setParam("wenhao");
		System.out.println(p.getInfo().getParam());

	}

}
