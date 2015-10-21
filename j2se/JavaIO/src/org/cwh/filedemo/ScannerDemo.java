package org.cwh.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws Exception {

		File file = new File("D:"+File.separator+"buf.txt");
		Scanner sc = new Scanner(new FileInputStream(file));
		StringBuffer buf = new StringBuffer();
		while (sc.hasNext()) {
			buf.append(sc.nextLine()).append("\n");
		}
		String str= buf.toString();
		System.out.println(str+"length="+str.length());
	}

}
