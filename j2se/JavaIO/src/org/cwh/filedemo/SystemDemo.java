package org.cwh.filedemo;

import java.io.InputStream;

public class SystemDemo {

	public static void main(String[] args) throws Exception {
		InputStream input = System.in;
		byte[] b = new byte[5];
		System.out.print("����������:");
		int len = input.read(b);
		System.out.print("�����������:"+new String(b, 0, len));
		
		
	}
}
