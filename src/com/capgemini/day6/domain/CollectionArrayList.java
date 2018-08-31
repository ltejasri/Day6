package com.capgemini.day6.domain;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class CollectionArrayList {
	void testLaptopProducts() {
		ArrayList<Laptop> laptops = new ArrayList<Laptop>();
		
		 laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5"));
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		
		assertEquals(3, laptops.size());
	}
	void testCarProducts() {
		ArrayList<Car> Cars = new ArrayList<Car>();
		
		Cars.add(new Car("audi", "a2", 18, 30_00_000));
		Cars.add(new Car("rangerover", "h5", 19, 7_00_00_000));
		Cars.add(new Car("ferari", "b2", 20, 6_00_00_000));
		
		assertEquals(3, Cars.size());
	}
	void testTelevisionProducts() {
		ArrayList<Television> Televisions = new ArrayList<Television>();
		
		Televisions.add(new Television("samsung","s4", 70_000, "56"));
		Televisions.add(new Television("lg", "l5", 50_000, "79"));
		Televisions.add(new Television("onida", "o2", 60_000, "220"));
		
		assertEquals(3, Televisions.size());
}
	void testCellphoneProducts() {
		ArrayList<Cellphone> cell = new ArrayList<Cellphone>();
		
		cell.add(new Cellphone("samsung","s4", "56", "hgsfh",70_000));
		cell.add(new Cellphone("lg", "l5", "79", "xd",50_000));
		cell.add(new Cellphone("onida", "o2", "220","dfg", 60_000));
		
		assertEquals(3, cell.size());
}
	void testSchoolProducts() {
		ArrayList<School> Schools = new ArrayList<School>();
		
		Schools.add(new School("samsung","s4", "56", "hgsfh"));
		Schools.add(new School("lg", "l5", "79", "xd"));
		Schools.add(new School("onida", "o2", "220","dfg"));
		
		assertEquals(3, Schools.size());
}
}
