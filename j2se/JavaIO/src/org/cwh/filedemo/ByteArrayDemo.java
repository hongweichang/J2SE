package org.cwh.filedemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayDemo {

	
	public static void main(String[] args) {
		String str = "hello we world!";
		ByteArrayInputStream bis = null;
		ByteArrayOutputStream bos = null;
		bos = new ByteArrayOutputStream();
		bis = new ByteArrayInputStream(str.getBytes());
		int temp = 0;
		while ((temp=bis.read())!=-1) {
			
			bos.write(Character.toUpperCase(temp));
		}
		System.out.println(bos.toString());
		

	}

}
