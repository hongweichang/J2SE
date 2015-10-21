class A{
	
	public String toString(){
		return "sd";
	}
}

public class samsung{
	
	public static void main(String[] args) {
		Object obj = new A();
		A a = (A)obj;
		System.out.println(obj.equals(a));
		
	}
}