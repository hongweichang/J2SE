package org.cwh.serializable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArrayOutput {


	public static void main(String[] args) throws Exception {
		
		File file = new File("D:"+File.separator+"arrayperson.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		Person p[] = {new Person("aa", 2),new Person("bb", 3),new Person("cc", 4)};
		oos.writeObject(p);
		oos.close();
	}

}
