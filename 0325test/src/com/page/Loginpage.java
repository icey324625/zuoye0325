package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.Loginutil;

public class Loginpage extends Loginutil {
	//打开网址
	/*	public void openurl() {
			driver.get(url);
		}*/
	//用户名输入
		public void username() {
		    driver.findElement(By.name("username")).sendKeys("hujianming");
		}
	//密码输入
		public void password() {
			driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		}
	//选择用户类型
		public void leix() {
			WebElement s1=driver.findElement(By.name("usertype"));
			Select s=new Select(s1);
			s.selectByIndex(2);
		}
	//点击登录
		public void clicklogin() {
			driver.findElement(By.className("tm_btn")).click();
		}
}
