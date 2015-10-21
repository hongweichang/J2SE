package Integer;

public class IntegerTest {

	
	public static void main(String[] args) {
		int i = 2;
		Integer i2 = i; //装箱操作 基本数据类型->包装类
		int j = i2; // 拆箱操作 包装类->基本数据类型
	    System.out.println(j*j);
	   
		String str = "12.3";
		try {
			 //System.out.println(Integer.parseInt(str));
			 System.out.println(Double.parseDouble(str)); //字符串变为基本数据类型
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		/*for (String string : args) { //foreach jdk1.5的新特性
			
		}*/

	}

}
