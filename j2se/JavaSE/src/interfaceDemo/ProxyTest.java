package interfaceDemo;
//�������ģʽ proxy �������ĵĲ���������ʵ�ʹ������� ������ֻ����������

interface buyHouse {
	
	public void buy();
}

class buyer implements buyHouse{//ʵ�ʹ�����
	
	public void buy(){
		System.out.println("����");
	}
}
class badBuyer implements buyHouse{//ʵ�ʳ�����
	
	public void buy(){
		System.out.println("������");
	}
}

class proxyCompany implements buyHouse{//�н鹫˾
	private buyHouse bh = null;
	public proxyCompany(buyHouse bh){
		this.bh = bh;
		
	}
	public void before(){
		System.out.println("---ǰ��׼��");
	}
	public void buy(){
		this.before();
		this.bh.buy();//ʵ�ʹ����ߵ��򷿲���
		this.after();
	}
	public void after(){
		System.out.println("---���ڴ���");
	}
	
}
public class ProxyTest {
	
	public static void main(String[] args) {
		buyHouse bh1 = new proxyCompany(new buyer());
		buyHouse bh2 = new proxyCompany(new badBuyer());
		bh1.buy();
		bh2.buy();
	}
}
