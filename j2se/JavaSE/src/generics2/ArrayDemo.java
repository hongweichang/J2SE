package generics2;

public class ArrayDemo {

	public static void main(String[] args) {
		Integer i[] = {1,2,3,4,5};
		for (int j : print(i)) {
			System.out.println(j);
		}
		
	}
	
	public static <T> T[] print(T[] param){//泛型应用于方法
		return param;
		
	}
}
