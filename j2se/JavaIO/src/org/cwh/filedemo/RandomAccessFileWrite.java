package org.cwh.filedemo;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileWrite {

	public static void main(String[] args) throws Exception {

		File file = new File("D:" + File.separator + "test.txt");
		RandomAccessFile raf = new java.io.RandomAccessFile(file, "rw");

		String name = "zhangsan"; // �ַ���8λ
		int age = 30; // ���� 4λ
		raf.writeBytes(name);// ���ֽڵķ�ʽ���ַ���д��
		raf.writeInt(age);

		name = "lisi    "; // �ַ�����8λ
		age = 22; // ���� 4λ
		raf.writeBytes(name);// ���ֽڵķ�ʽ���ַ���д��
		raf.writeInt(age);

		name = "wangwu  "; // �ַ�����8λ
		age = 21; // ���� 4λ
		raf.writeBytes(name);// ���ֽڵķ�ʽ���ַ���д��
		raf.writeInt(age);

		raf.close();
	}

}
