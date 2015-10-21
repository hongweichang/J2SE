package interfaceDemo;
//代理设计模式 proxy 真正核心的操作还是由实际购房者做 代理类只是起辅助作用

interface buyHouse {
	
	public void buy();
}

class buyer implements buyHouse{//实际购房者
	
	public void buy(){
		System.out.println("买房子");
	}
}
class badBuyer implements buyHouse{//实际抄房者
	
	public void buy(){
		System.out.println("抄房子");
	}
}

class proxyCompany implements buyHouse{//中介公司
	private buyHouse bh = null;
	public proxyCompany(buyHouse bh){
		this.bh = bh;
		
	}
	public void before(){
		System.out.println("---前期准备");
	}
	public void buy(){
		this.before();
		this.bh.buy();//实际购房者的买房操作
		this.after();
	}
	public void after(){
		System.out.println("---后期处理");
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
