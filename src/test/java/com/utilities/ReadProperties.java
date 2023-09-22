package com.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\Alibaba_Framework\\src\\test\\resources\\configfiles\\config.properties");
		 Properties p = new Properties();
		 p.load(fr);
		 System.out.println(p.getProperty("browser"));
		 System.out.println(p.getProperty("testurl"));
	}
}
