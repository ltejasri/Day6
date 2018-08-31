package com.capgemini.day6.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;



class studentTest {

	@Test
	void testoutputorder() {
		
		TreeSet<student> names=new TreeSet<>();
		
		assertEquals(true, names.add(new student("Sri",1)));
		assertEquals(true, names.add(new student("Sree",2)));
		assertEquals(true, names.add(new student("S",3)));
		assertEquals(true, names.add(new student("Sr",4)));
		


		
		Iterator<student> itr = names.iterator();
		assertEquals("S",itr.next().toString());

	}

}
