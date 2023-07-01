package javatestcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test(dataProvider = "add")
	void addition(int a,int b,int c,int d) {
		Assert.assertEquals(a+b+c, d);
	}
	
	@DataProvider(name="add")
	Object[][] add(){
//		Object[][] obj=new Object[3][4];
//		
//		obj[0][0]=1;
//		obj[0][1]=2;
//		obj[0][2]=1;
//		obj[0][3]=4;
//		
//		obj[1][0]=3;
//		obj[1][1]=2;
//		obj[1][2]=0;
//		obj[1][3]=5;
//		
//		obj[2][0]=5;
//		obj[2][1]=4;
//		obj[2][2]=3;
//		obj[2][3]=12;
//		
//		return obj;
		
		return new Object[][] {
			{1,2,1,4},
			{3,2,0,5},
			{5,4,3,12}
		};
	}
}
