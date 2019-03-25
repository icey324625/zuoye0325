package com.testcase;

import org.testng.annotations.Test;

import com.business.Loginbusiness;
import com.util.Loginutil;

public class Logintestcase extends Loginutil{
	@Test
	public void login() throws InterruptedException {
		//ÉùÃ÷
		Loginbusiness l=new Loginbusiness();
/*		//´ò¿ªä¯ÀÀÆ÷
		l.openurl();*/
		//µÇÂ¼
		l.loginb();
	   }
}
