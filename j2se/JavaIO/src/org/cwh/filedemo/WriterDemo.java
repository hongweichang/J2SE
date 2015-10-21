package org.cwh.filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

//字符输出流
//Writer是抽象类abstract 需要用它的子类FileWriter来实例化
public class WriterDemo {

	public static void main(String[] args) throws Exception{
	
		File file = new File("D:" + File.separator + "WriterDemo.txt");
		Writer  wr= null;
		wr = new FileWriter(file);
		String str = "hello WriterDemo";// 使用\r\n换行
		wr.write(str);
		//wr.flush();
		wr.close(); //关闭的时候强制刷新
	}

}
