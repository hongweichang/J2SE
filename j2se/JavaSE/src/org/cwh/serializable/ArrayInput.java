package org.cwh.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ArrayInput {

	
	public static void main(String[] args) throws Exception {
		
		File file = new File("D:"+File.separator+"arrayperson.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Person p[] = (Person[])ois.readObject();
		for (Person per : p) {
			System.out.println(per.toString());

		}
		ois.close();

	}

}
