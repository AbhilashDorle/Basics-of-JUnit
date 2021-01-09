package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {
	//1,2,3 -> 6
	@Test
	void sum_with3numbers() {
		Math myMath = new Math();
		int result= myMath.sum(new int[] {1,2,3});
		//Check result = 6
		
		assertEquals(6, result);
	}
	
	//Fails
	@Test
	void sum_with1number() {
		Math myMath = new Math();
		int result= myMath.sum(new int[] {3});
		//Check result = 6
		
		assertEquals(6, result);
	}

}
