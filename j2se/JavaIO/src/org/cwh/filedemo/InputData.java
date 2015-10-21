package org.cwh.filedemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputData {

	private BufferedReader buf;

	public InputData() {
		this.buf = new BufferedReader(new InputStreamReader(System.in));
	}

	public String getString(String info) throws IOException {

		System.out.print(info);
		String str = this.buf.readLine();
		return str;
	}

	public int getInt(String info, String error) throws Exception {
		boolean flag = true;
		int i = 0;
		while (flag) {
			String str = this.getString(info);
			if (str.matches("\\d+")) {
				i = Integer.parseInt(str);
				flag = false;
			} else {
				System.out.println(error);
			}
		}
		return i;

	}

	public void addInt(int i, int j) {
		System.out.println("-----result-----");
		System.out.println(i + "+" + j + "=" + (i + j));
	}
}
