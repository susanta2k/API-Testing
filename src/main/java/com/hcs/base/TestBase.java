package com.hcs.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.hcs.utility.Utility;

public class TestBase {
	
	Properties prop;
	
	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(Utility.PROP_FILE_PATH);
			prop.load(fs);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
