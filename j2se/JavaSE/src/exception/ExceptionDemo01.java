package exception;

class Math {
	
	public static int div(int i,int j) throws Exception{
		System.out.println("before");
		int temp = 0;
		try {
			temp = i/j;
		} catch (Exception e) {
			//System.out.println("++");
			throw e;//�׳��쳣
		}finally{//�Ƿ����쳣 ��ִ��
			System.out.println("after");
		}
		
		return temp;
	}
}

public class ExceptionDemo01 {

	public static void main(String[] args){
		try {
			//throw new Exception("�������"); //�׳��쳣
			int i = Math.div(10, 0);
		} catch (Exception e) {
			//System.out.println("---");
			System.out.println(e);
		}
		

	}

}
