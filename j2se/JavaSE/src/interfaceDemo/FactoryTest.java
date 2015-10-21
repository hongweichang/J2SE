package interfaceDemo; // �������ģʽ

interface Fruit{
	
	public void eat();
}

class Apple implements Fruit{
	public void eat(){
		System.out.println("��ƻ������");
	}
}

class Orange implements Fruit{
	public void eat(){
		System.out.println("�����ӡ���");
	}
}

class Factory{//������
	public static Fruit getFruit(String fruitName){
		Fruit f = null;
		if ("apple".equals(fruitName)) {//*�ַ����Ƚ�ʱ��Զ�ѳ�������ǰ��
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
