package com.capgemini.day6.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.jupiter.api.Test;

class Question5{

	@Test
	void testNaturalOrder() {
		
		TreeSet<Car> car=new TreeSet<>();
		
		car.add(new Car("Bently","BT123",2014,5_00_000));
		car.add(new Car("Audi","AU768",2012,7_00_000));
		car.add(new Car("Cheverlet","CH257",2016,9_00_000));
		
		Iterator<Car> itr=car.iterator();
		assertEquals("make=Audi model=AU768", itr.next().toString());
		itr.next();
		assertEquals("make=Cheverlet model=CH257", itr.next().toString());
	}

}

