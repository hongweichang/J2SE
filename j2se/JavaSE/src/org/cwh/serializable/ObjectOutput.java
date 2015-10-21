package org.cwh.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutput {

	
	public static void main(String[] args) throws Exception {
		
		File file = new File("D:"+File.separator+"person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(new Person("cuiwenhao", 26));
		oos.close();
		
	}

}
