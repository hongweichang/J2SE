package generics3;

public class Contact implements Info {
	private String phoneNumber;
	private String addr;

	public Contact() {
		super();
	}

	public Contact(String phoneNumber, String addr) {
		super();
		this.phoneNumber = phoneNumber;
		this.addr = addr;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {//��д ��д�Ļ��ͻ���������Ϣ

		return "�˵���Ϣ��" + "\n" + "phoneNumber:" + phoneNumber + "\t" + "addr:" + addr;
	}

}
