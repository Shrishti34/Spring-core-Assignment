package com.junit;

public class Mymath {
	
	int sum(int[] numbers) {
		int sum =0;
		for(int i: numbers) {
			sum += i;
		}
		
		return sum;
	}

}
