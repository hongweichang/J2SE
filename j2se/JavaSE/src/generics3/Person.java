package generics3;

public class Person<T extends Info> {//ָ������ 

	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
}
