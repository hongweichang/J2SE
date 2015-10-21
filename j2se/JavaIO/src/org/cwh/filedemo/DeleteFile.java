package org.cwh.filedemo;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("E:"+File.separator+"fileDemo.txt");
		
		if (file.exists()&&file.isFile()) {
			file.delete();
			System.out.println("file deleted!");
		}else {
			System.out.println("file not exist!");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("file create!");
		}
		
		
	}

}
