package com.testcases;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.LoginPage;

public class MainTest extends Base{

	@Test
	public void test() throws InterruptedException {
		LoginPage lp = new LoginPage();
		Thread.sleep(3000);
		lp.testlogin();
	}
	
}
