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
	
	public String toString() {//覆写 不写的话就会打出对象信息

		return "人的信息：" + "\n" + "phoneNumber:" + phoneNumber + "\t" + "addr:" + addr;
	}

}
