package org.cwh.filedemo;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("E:" + File.separator + "fileDemo.txt");

		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
