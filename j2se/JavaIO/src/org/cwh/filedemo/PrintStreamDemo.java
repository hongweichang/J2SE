package org.cwh.filedemo;

import java.io.File;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:" + File.separator + "ntobd3.txt");
		//PrintStream ps = new PrintStream(new FileOutputStream(file));
		PrintStream ps = new PrintStream(file);
		ps.println("��ð�22232323");
		ps.println(23.23);
		// jdk1.5 �¹��� ��ʽ��
		String str = "���ĺ�";
		int age = 27;
		float score = 99.9f;
		char sex = 'M';
		ps.printf("������%s; ���䣺%d; �ɼ���%5.2f; �Ա�%c ", str, age, score, sex);
		ps.close();

	}

}
