package org.cwh.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//字节输出流
//OutputStream是抽象类abstract 需要用它的子类来实例化
public class FileCopyDemo {

	
	public static void main(String[] args) throws Exception{
	
		File source = new File("D:" + File.separator + "111.rar");
		File target = new File("E:" + File.separator + "OutputStreamDemo.txt");
		new filecopy(source, target);	
	}
}

class filecopy{
	
	public filecopy(File source, File target) throws Exception{
		if (source.exists()) {
			InputStream in = new FileInputStream(source);
			OutputStream out = new FileOutputStream(target);
			byte[] b = new byte[(int)source.length()];
			for (int i = 0; i < source.length(); i++) {
				b[i]=(byte)in.read();
				out.write(b[i]);
			}
			
			
			
			//in.read(b);
			//out.write(b);
			System.out.println("copy success!");
			in.close();
			out.close();
		}
		else {
			System.out.println("the file is not exist!");
		}
		
		
	}
	
}
