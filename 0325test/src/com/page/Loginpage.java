package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.Loginutil;

public class Loginpage extends Loginutil {
	//����ַ
	/*	public void openurl() {
			driver.get(url);
		}*/
	//�û�������
		public void username() {
		    driver.findElement(By.name("username")).sendKeys("hujianming");
		}
	//��������
		public void password() {
			driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		}
	//ѡ���û�����
		public void leix() {
			WebElement s1=driver.findElement(By.name("usertype"));
			Select s=new Select(s1);
			s.selectByIndex(2);
		}
	//�����¼
		public void clicklogin() {
			driver.findElement(By.className("tm_btn")).click();
		}
}
