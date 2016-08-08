package org.yi.spider.utils;

import org.junit.Test;

public class BCConvertTest {
	
	private static String s = "nihaoｈｋ　｜　　　ｎｉｈｅｈｅ　，。　７８　　７　";  

	@Test
	public void testBj2qj() {
		System.out.println(BCConvert.bj2qj(s));
	}

	@Test
	public void testQj2bj() {
		System.out.println(BCConvert.qj2bj(s));
	}

}
