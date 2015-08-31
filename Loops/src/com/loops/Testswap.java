package com.loops;


import org.testng.Assert;
import org.testng.annotations.Test;


public class Testswap {
	
	@Test
	public void testswap(){
		int a,b;
		a=10;b=20;
		int actual = swap.swap1();
		Assert.assertEquals(actual,2);
	}
	

}
