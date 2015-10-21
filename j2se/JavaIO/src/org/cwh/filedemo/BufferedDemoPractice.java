package org.cwh.filedemo;


public class BufferedDemoPractice {

	public static void main(String[] args) throws Exception {
		
		// File file = new File("D:" + File.separator + "buf.txt");
		// InputStream input = new FileInputStream(file);
		int i = new InputData().getInt("请输入第一个整数:", "输入的不是整数,");
		int j = new InputData().getInt("请输入第二个整数:", "输入的不是整数,");
		new InputData().addInt(i, j);
	}
}


