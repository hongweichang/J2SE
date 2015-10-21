package org.cwh.filedemo;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileRead {

	public static void main(String[] args) throws Exception {

		File file = new File("D:" + File.separator + "test.txt");
		RandomAccessFile raf = new java.io.RandomAccessFile(file, "r");
		byte[] b = new byte[8];
		String name = null;
		int age = 0;
		raf.skipBytes(12);// 跨过第一个人的信息
		for (int i = 0; i < 8; i++) {
			b[i] = raf.readByte();
		}
		age = raf.readInt();
		name = new String(b);
		System.out.println("name:" + name + " age:" + age);

		long lpoint = raf.getFilePointer();
		System.out.println(lpoint);
		
		//
		for (int i = 0; i < 8; i++) {
			b[i] = raf.readByte();
		}
		age = raf.readInt();
		name = new String(b);
		System.out.println("name:" + name + " age:" + age);
		
		//
		lpoint = raf.getFilePointer();
		System.out.println(lpoint);
		raf.seek(0);
		
		lpoint = raf.getFilePointer();
		System.out.println(lpoint);
		for (int i = 0; i < 8; i++) {
			b[i] = raf.readByte();
		}
		age = raf.readInt();
		name = new String(b);
		System.out.println("name:" + name + " age:" + age);
		raf.close();
	}

}
