package org.cwh.filedemo;

import java.io.File;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:" + File.separator + "ntobd3.txt");
		//PrintStream ps = new PrintStream(new FileOutputStream(file));
		PrintStream ps = new PrintStream(file);
		ps.println("你好啊22232323");
		ps.println(23.23);
		// jdk1.5 新功能 格式化
		String str = "崔文豪";
		int age = 27;
		float score = 99.9f;
		char sex = 'M';
		ps.printf("姓名：%s; 年龄：%d; 成绩：%5.2f; 性别：%c ", str, age, score, sex);
		ps.close();

	}

}
