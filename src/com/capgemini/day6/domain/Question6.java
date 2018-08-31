package com.capgemini.day6.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.junit.jupiter.api.Test;

//import com.capgemini.day6.domain;

class Question6 {

	@Test
	void testStudentFavouriteFruits() {
		HashMap<String,ArrayList<String>> students=new HashMap<>() ;
		students.put("Neeraj", (ArrayList<String>) Arrays.asList("Mango","Apple","Guava")) ;
		students.put("Spandhana", (ArrayList<String>) Arrays.asList("Grapes","Watermelon","Guava")) ;
		assertEquals((ArrayList<String>)Arrays.asList("Mango","Apple","Guava"),(ArrayList<String>) students.get("Neeraj"));
		
		
			}

}