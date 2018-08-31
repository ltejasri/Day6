package com.capgemini.day6.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Question3Test {

	@Test
	
	public void testorder()
	{
		ArrayList <String> array  = new ArrayList<>();
	
	
		
		array.add("teju");
		array.add("sri");
		array.add("spa");
		array.add("neeraj");
		array.add("shu");
		array.add("vasantha");
		array.add("chunnu");
		array.add("takla");
	assertEquals("sri",array.get(1));

}
}