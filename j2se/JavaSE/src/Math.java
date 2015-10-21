

class MathOper{
	
	public int div(int i,int j) throws Exception{
		
		return i/j;
	}
}

public class Math {
public static void main(String[] args) {
	 try {
		new MathOper().div(10, 10);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
