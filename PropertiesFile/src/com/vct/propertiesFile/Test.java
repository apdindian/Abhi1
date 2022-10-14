package com.vct.propertiesFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {
		try {
			FileReader reader = new FileReader("db.properties");
			Properties p = new Properties();
			p.load(reader);
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
