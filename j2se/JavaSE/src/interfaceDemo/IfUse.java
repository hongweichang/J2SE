package interfaceDemo;

interface USB {
	
	public void start();
	public void stop();
	public void min();
}

abstract class USBAdapter implements USB{//���������ģʽ
	
	public  void start(){
		
	}
	public  void stop(){
		
	}
	public void min(){
		
	}
}

class Printer extends  USBAdapter{
	
	public void start(){
		System.out.println("��ӡ����ʼ����");
		}
	public void stop(){
		System.out.println("��ӡ��ֹͣ����");
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
