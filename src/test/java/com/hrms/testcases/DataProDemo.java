package com.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProDemo {

	
	@Test(dataProvider = "getData")
	public void addEmp(String fName, String mName, String lName) {
		System.out.println(fName+" "+mName+" "+lName);
	}
	
	
	@DataProvider // example (name = "test")   the right way -->(name = "getData")
	public Object[][] getData() {
		Object[][] data = { { "Karim","H" ,"bnzima"}, 
							{ "Fadwa", "A", "Fatty" },
							{ "Adil", "K", "kasim" }
		};
		return data;
	}

//	 the longer way
//	public Object[][] getData{
//	Object[][] data= new Object data[2]2]
//		data [0][0] = "John";
//		data[0][1] = " S";
//		data [0][2] = "Smith";
//	          data[1][0] = "Fadwa";
//	         data [1][1] = "A";
//	 	data  [1][2] ="Fadwa;
//	 	data [2][0] = "Adile";
//		data[2][1] = "K";
//	 	data[2][2] = "Karadeniz";
//	return data;
//}
}