package com.hrms.testcases;
import org.testng.annotations.*;

public class AnnotationDemo {

	@BeforeClass
	public void executBeforM() {
		System.out.println("I open the browser and luch url");
	}
	@Test(priority = 1)
	public void methodOne() {
		System.out.println("My first testcase = login");
	}
	@Test(priority = 2)
	public void methodTwo() {
		System.out.println("My second testcase = dasboard");
	}
	@Test(priority = 3 )
	public void methodThree() {
		System.out.println("My third testcase = add employee");
	}
}
