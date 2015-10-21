package org.cwh.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//字节输出流
//OutputStream是抽象类abstract 需要用它的子类来实例化
public class CopyDemo {

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("操作的语法不正确");
			System.out.println("例：java copy 源文件路径 目的文件路径");
			System.exit(1);
		}
		if (args[0].equals(args[1])) {
			System.out.println("无法复制自身文件");
			System.out.println("例：java copy 源文件路径 目的文件路径");
			System.exit(1);
		}
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		if (file1.exists()) {
			InputStream in = new FileInputStream(file1);
			OutputStream out = new FileOutputStream(file2);
			//边读边写
			int temp = 0;
			while ((temp = in.read()) != -1) {
				out.write(temp);
			}
			System.out.println("copy success!");
			in.close();
			out.close();

		} else {
			System.out.println("源文件不存在！ ");
		}

	}

}
