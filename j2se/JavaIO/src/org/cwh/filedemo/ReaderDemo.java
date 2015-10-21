package org.cwh.filedemo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//字符输入流
//OutputStream是抽象类abstract 需要用它的子类来实例化
public class ReaderDemo {

	public static void main(String[] args) throws Exception {

		File file = new File("D:" + File.separator + "WriterDemo.txt");
		Reader re = null;
		re = new FileReader(file);
		char[] cf = new char[(int) file.length()];
		for (int i = 0; i < cf.length; i++) {
			cf[i] = (char) re.read();
		}
		System.out.println(cf);
		
		re.close();
	}

}
