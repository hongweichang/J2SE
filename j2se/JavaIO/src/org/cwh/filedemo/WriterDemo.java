package org.cwh.filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

//�ַ������
//Writer�ǳ�����abstract ��Ҫ����������FileWriter��ʵ����
public class WriterDemo {

	public static void main(String[] args) throws Exception{
	
		File file = new File("D:" + File.separator + "WriterDemo.txt");
		Writer  wr= null;
		wr = new FileWriter(file);
		String str = "hello WriterDemo";// ʹ��\r\n����
		wr.write(str);
		//wr.flush();
		wr.close(); //�رյ�ʱ��ǿ��ˢ��
	}

}
