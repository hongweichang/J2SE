package org.cwh.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//�ֽ������
//OutputStream�ǳ�����abstract ��Ҫ������������ʵ����
public class CopyDemo {

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("�������﷨����ȷ");
			System.out.println("����java copy Դ�ļ�·�� Ŀ���ļ�·��");
			System.exit(1);
		}
		if (args[0].equals(args[1])) {
			System.out.println("�޷����������ļ�");
			System.out.println("����java copy Դ�ļ�·�� Ŀ���ļ�·��");
			System.exit(1);
		}
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		if (file1.exists()) {
			InputStream in = new FileInputStream(file1);
			OutputStream out = new FileOutputStream(file2);
			//�߶���д
			int temp = 0;
			while ((temp = in.read()) != -1) {
				out.write(temp);
			}
			System.out.println("copy success!");
			in.close();
			out.close();

		} else {
			System.out.println("Դ�ļ������ڣ� ");
		}

	}

}
