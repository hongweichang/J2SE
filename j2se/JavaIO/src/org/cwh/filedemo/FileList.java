package org.cwh.filedemo;

import java.io.File;

public class FileList {
	static int sum = 0; //静态变量

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:" + File.separator + "study");

		// 列出该目录下的文件或文件夹的名称
		/*
		 * String[] str = file.list(); for (int i = 0; i < str.length; i++) {
		 * System.out.println(str[i]); }
		 */

		// 列出该目录下的文件或文件夹的完整路径

		new FileList().showfile(file);
		System.out.println(sum);

	}

	// 递归 列出该目录下的所有目录及文件
	public void showfile(File file) {
		
		if (file.isDirectory()) {
			File[] fileList = file.listFiles();
			if (fileList != null) {
				for (int i = 0; i < fileList.length; i++) {
					showfile(fileList[i]);
				}
			}
		}
		System.out.println(file);
		sum++;
	}
}