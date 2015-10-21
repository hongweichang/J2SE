package org.cwh.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInput {

	
	public static void main(String[] args) throws Exception {
		
		File file = new File("D:"+File.separator+"person.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Person p = (Person)ois.readObject();
		String str = p.toString();
		System.out.println(str);
	}

}
