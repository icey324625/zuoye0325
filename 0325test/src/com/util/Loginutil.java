package com.util; //基础层

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Loginutil {
public static WebDriver driver;
public static String url;
@BeforeClass
public static void setup() throws MalformedURLException {
	//定义谷歌浏览器的路径
	System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
	driver=new ChromeDriver();
	//被测的网址
	url="http://localhost:8080/examsys/login.thtml";
	//获取网址
	driver.get(url);
	//全局等待
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@AfterClass
public void tearDown() {
	
}
}
