package com.junit;

import org.junit.Test;


public class MyMathTest {
	
	@Test
	public void sum_with3numbers() {
		Mymath myMath = new Mymath();
		System.out.println(myMath.sum(new int[] {1,2,3}));

	}

}
