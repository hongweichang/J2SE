package org.cwh.filedemo;

import java.io.File;

public class FileList {
	static int sum = 0; //��̬����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:" + File.separator + "study");

		// �г���Ŀ¼�µ��ļ����ļ��е�����
		/*
		 * String[] str = file.list(); for (int i = 0; i < str.length; i++) {
		 * System.out.println(str[i]); }
		 */

		// �г���Ŀ¼�µ��ļ����ļ��е�����·��

		new FileList().showfile(file);
		System.out.println(sum);

	}

	// �ݹ� �г���Ŀ¼�µ�����Ŀ¼���ļ�
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