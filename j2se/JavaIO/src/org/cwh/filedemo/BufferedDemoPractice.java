package org.cwh.filedemo;


public class BufferedDemoPractice {

	public static void main(String[] args) throws Exception {
		
		// File file = new File("D:" + File.separator + "buf.txt");
		// InputStream input = new FileInputStream(file);
		int i = new InputData().getInt("�������һ������:", "����Ĳ�������,");
		int j = new InputData().getInt("������ڶ�������:", "����Ĳ�������,");
		new InputData().addInt(i, j);
	}
}


