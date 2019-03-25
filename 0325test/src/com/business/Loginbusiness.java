package com.business;

import com.page.Loginpage;

public class Loginbusiness extends Loginpage{
	/*public void openurl() {
		driver.get(url);
	}*/
	public void loginb() throws InterruptedException {
	//声明
	Loginpage page=new Loginpage();
	//打开网址进入学生考试系统
	//page.openurl();
	//输入用户名
	page.username();
	//输入密码
	page.password();
	//选择用户类型
	page.leix();
	//等待8s
	Thread.sleep(8000);
	//点击登录
	page.clicklogin();
   }
}
