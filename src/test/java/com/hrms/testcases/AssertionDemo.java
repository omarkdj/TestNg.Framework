package com.hrms.testcases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {


	@Test(priority = 1)
	public void methodOne() {
	String expectTitle="HRMS";
	String actulTitle="HRMSS";
	
	SoftAssert as = new SoftAssert();
	
	
//	ArrayList list1 = new ArrayList<>();
//	list1.add("a");
//	list1.add("b");
//	
//	ArrayList list2 = new ArrayList<>();
//	list2.add("a");
//	list2.add("1");
	
	//Assert.assertEquals(list1, list2,"List are not equale");
	
	
	
	//Assert.assertEquals(actulTitle, expectTitle);
//	if(!expectTitle.equals(actulTitle)){
//		Assert.assertTrue(false);
//	}else {
//		Assert.assertTrue(true);
//	}
	
	}
//	@Test(priority = 2)
//	public void methodTwo() {
//		System.out.println("My second testcase = dasboard");
//	}
//	@Test(priority = 3 )
//	public void methodThree() {
//		System.out.println("My third testcase = add employee");
//	}
}
