package org.cwh.filedemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;


//�ֽ������
//OutputStream�ǳ�����abstract ��Ҫ������������ʵ����
public class OutputStreamDemo {
	
	public static void main(String[] args) throws Exception{
	
		File file = new File("D:" + File.separator + "OutputStreamDemo.txt");
		System.out.println(file.exists());
		OutputStream out = null;
		out = new FileOutputStream(file);
		String str = "as";// ʹ��\r\n����
		out.write(str.getBytes());
		int len = str.getBytes().length;
		System.out.println("len="+len);
		out.close();		
	}

}
