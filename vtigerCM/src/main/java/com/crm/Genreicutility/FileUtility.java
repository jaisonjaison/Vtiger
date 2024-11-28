package com.crm.Genreicutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

public String getDataFromProperty(String key) throws IOException {
	FileInputStream fil=new FileInputStream("./src/main/resources/TestData/commandata.properties");
	Properties pro=new Properties();
	pro.load(fil);
	 return pro.getProperty(key);
}
	
}
