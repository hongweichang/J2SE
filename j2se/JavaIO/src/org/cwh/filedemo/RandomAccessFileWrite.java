package org.cwh.filedemo;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileWrite {

	public static void main(String[] args) throws Exception {

		File file = new File("D:" + File.separator + "test.txt");
		RandomAccessFile raf = new java.io.RandomAccessFile(file, "rw");

		String name = "zhangsan"; // 字符串8位
		int age = 30; // 整型 4位
		raf.writeBytes(name);// 以字节的方式将字符串写入
		raf.writeInt(age);

		name = "lisi    "; // 字符串是8位
		age = 22; // 整型 4位
		raf.writeBytes(name);// 以字节的方式将字符串写入
		raf.writeInt(age);

		name = "wangwu  "; // 字符串是8位
		age = 21; // 整型 4位
		raf.writeBytes(name);// 以字节的方式将字符串写入
		raf.writeInt(age);

		raf.close();
	}

}
