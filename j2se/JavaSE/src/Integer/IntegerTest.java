package Integer;

public class IntegerTest {

	
	public static void main(String[] args) {
		int i = 2;
		Integer i2 = i; //װ����� ������������->��װ��
		int j = i2; // ������� ��װ��->������������
	    System.out.println(j*j);
	   
		String str = "12.3";
		try {
			 //System.out.println(Integer.parseInt(str));
			 System.out.println(Double.parseDouble(str)); //�ַ�����Ϊ������������
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		/*for (String string : args) { //foreach jdk1.5��������
			
		}*/

	}

}
