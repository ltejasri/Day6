package com.capgemini.day6.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.jupiter.api.Test;

class Question5 {

	@Test
	void testNaturalorder() {
		
		TreeSet<Car> Cars=new TreeSet<>();
		
		Cars.add(new Car("Bently","BT123",2014,5_00_000));
		Cars.add(new Car("Audi","AU768",2012,7_00_000));
		Cars.add(new Car("Cheverlet","CH257",2016,9_00_000));
		
		Iterator<Car> itr=Cars.iterator();
		 assertEquals("make=Audi model=AU768", itr.next().toString());
	}



	}


