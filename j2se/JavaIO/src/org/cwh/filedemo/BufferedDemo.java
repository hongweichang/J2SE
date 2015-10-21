package org.cwh.filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedDemo {
	
	public static void main(String[] args) throws Exception{
		
		File file = new File("D:" + File.separator + "buf.txt");
		//InputStream input = new FileInputStream(file);
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String message = buf.readLine();
		System.out.println(message);
		
	}

}
