package interfaceDemo;

interface USB {
	
	public void start();
	public void stop();
	public void min();
}

abstract class USBAdapter implements USB{//适配器设计模式
	
	public  void start(){
		
	}
	public  void stop(){
		
	}
	public void min(){
		
	}
}

class Printer extends  USBAdapter{
	
	public void start(){
		System.out.println("打印机开始工作");
		}
	public void stop(){
		System.out.println("打印机停止工作");
		}
}



class Computer {
	
	public static void plugin(USB usb){
		usb.start();
		usb.stop();
	}
}

public class IfUse {
	public static void main(String[] args) {
		
		Computer.plugin(new Printer());
		
	}

}
