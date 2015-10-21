package org.cwh.filedemo;

import java.io.File;
import java.io.IOException;

public class CreateDir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:"+File.separator+"fileDemo"+File.separator+"fileDemo.txt");
		try {
	
			file.getParentFile().mkdir();
			file.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
