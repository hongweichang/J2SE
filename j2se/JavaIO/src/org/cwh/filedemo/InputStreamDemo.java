package org.cwh.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//�ֽ������
//OutputStream�ǳ�����abstract ��Ҫ������������ʵ����
public class InputStreamDemo {

	
	public static void main(String[] args) throws Exception{
	
		File file = new File("D:" + File.separator + "OutputStreamDemo.txt");
		InputStream in = null;
		in = new FileInputStream(file);
		/*byte[] b= new byte[1024];
		int len = in.read(b);
		System.out.println(	"len = "+len);
		System.out.println(	new String(b,0,len));*/
		byte[] b= new byte[(int)file.length()];
		for (int i = 0; i < b.length; i++) {
			b[i]= (byte)in.read();
		}
		System.out.println(	new String(b));
		in.close();
	}

}
