package com.testcase;

import org.testng.annotations.Test;

import com.business.Loginbusiness;
import com.util.Loginutil;

public class Logintestcase extends Loginutil{
	@Test
	public void login() throws InterruptedException {
		//����
		Loginbusiness l=new Loginbusiness();
/*		//�������
		l.openurl();*/
		//��¼
		l.loginb();
	   }
}
