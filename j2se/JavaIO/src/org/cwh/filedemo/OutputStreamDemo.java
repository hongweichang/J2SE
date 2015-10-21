package org.cwh.filedemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;


//字节输出流
//OutputStream是抽象类abstract 需要用它的子类来实例化
public class OutputStreamDemo {
	
	public static void main(String[] args) throws Exception{
	
		File file = new File("D:" + File.separator + "OutputStreamDemo.txt");
		System.out.println(file.exists());
		OutputStream out = null;
		out = new FileOutputStream(file);
		String str = "as";// 使用\r\n换行
		out.write(str.getBytes());
		int len = str.getBytes().length;
		System.out.println("len="+len);
		out.close();		
	}

}
