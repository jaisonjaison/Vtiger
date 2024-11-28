package com.crm.Genreicutility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crm.objectrepository.Homepage;
import com.crm.objectrepository.LoginPage;

public class BaseClass {

	public static WebDriver sdriver;
	public WebDriver driver;
	
	public static ExtentReports extreport;
	public static ExtentTest test;
	
	public FileUtility futil=new FileUtility();
	public ExcelUtility eutil=new ExcelUtility();
	public JavaUtility jutil=new JavaUtility();
	public WebdriverUtility wutil=new WebdriverUtility();
	
	
	public  LoginPage lp;
	public Homepage hp;
	
	
	
	@BeforeSuite
	public void reportConfiguration() {
	//	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/ExtentReport_"+jutil.getSystemTime()+.html)
	}
	
}
