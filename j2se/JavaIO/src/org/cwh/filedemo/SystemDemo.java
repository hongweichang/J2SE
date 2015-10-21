package org.cwh.filedemo;

import java.io.InputStream;

public class SystemDemo {

	public static void main(String[] args) throws Exception {
		InputStream input = System.in;
		byte[] b = new byte[5];
		System.out.print("请输入内容:");
		int len = input.read(b);
		System.out.print("输入的内容是:"+new String(b, 0, len));
		
		
	}
}
