package com.util; //������

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
	//����ȸ��������·��
	System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
	driver=new ChromeDriver();
	//�������ַ
	url="http://localhost:8080/examsys/login.thtml";
	//��ȡ��ַ
	driver.get(url);
	//ȫ�ֵȴ�
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@AfterClass
public void tearDown() {
	
}
}
