package com.business;

import com.page.Loginpage;

public class Loginbusiness extends Loginpage{
	/*public void openurl() {
		driver.get(url);
	}*/
	public void loginb() throws InterruptedException {
	//����
	Loginpage page=new Loginpage();
	//����ַ����ѧ������ϵͳ
	//page.openurl();
	//�����û���
	page.username();
	//��������
	page.password();
	//ѡ���û�����
	page.leix();
	//�ȴ�8s
	Thread.sleep(8000);
	//�����¼
	page.clicklogin();
   }
}
