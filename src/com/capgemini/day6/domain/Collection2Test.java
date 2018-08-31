package com.capgemini.day6.domain;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class Collection2Test {
	
	@Test
	public void testLaptop() {
		HashSet<Laptop> laptop = new HashSet<Laptop>();
		assertEquals(true, laptop.add(new Laptop("Dell","Inspiron15","Windows","I7")));
		assertEquals(false, laptop.add(new Laptop("Dell","Inspiron15","Windows","I7")));
		assertEquals(true, laptop.add(new Laptop("HP","Inspiron15","Linux","I5")));
		assertEquals(true, laptop.add(new Laptop("Lenevo","Inspiron17","Windows","I3")));
		
		
			assertEquals(3, laptop.size());
			
			for (Laptop laptop2 : laptop) {
				System.out.println(laptop2);
			}
	}
			
		@Test
			public void testCar() {
				HashSet<Car> Car = new HashSet<Car>();
				assertEquals(true, Car.add(new Car("maruthi","d2", 89, 50_000)));
				assertEquals(true, Car.add(new Car("audi", "a2", 18, 30_00_000)));
				assertEquals(true, Car.add(new Car("rangerover", "h5", 19, 7_00_00_000)));
				assertEquals(true, Car.add(new Car("ferari", "b2", 20, 6_00_00_000)));
				assertEquals(false, Car.add(new Car("ferari", "b2", 21, 5_00_00_000)));
				
				assertEquals(4, Car.size());
				
				for(Car Car2 : Car) {
					System.out.println("Car2");
				}
			}
		
		@Test
		public void testTelevision() {
			HashSet<Television> Television = new HashSet<Television>();
			assertEquals(true, Television.add(new Television("samsung","s4", 70_000, "56")));
			assertEquals(false, Television.add(new Television("samsung","s4", 70_000, "76")));
			assertEquals(true, Television.add(new Television("lg", "l5", 50_000, "79")));
			assertEquals(true, Television.add(new Television("onida", "o2", 60_000, "220")));
			
			assertEquals(3, Television.size());
			
			for(Television Television2 : Television) {
				System.out.println("Television2");
			}
			
		}
		@Test
		public void testCellphone() {
			HashSet<Cellphone> Cellphone = new HashSet<Cellphone>();
			assertEquals(true, Cellphone.add(new Cellphone("samsung","s4", "56", "hgsfh",70_000)));
			assertEquals(true, Cellphone.add(new Cellphone("lg", "l5", "79", "xd",50_000)));
			assertEquals(true, Cellphone.add(new Cellphone("onida", "o2", "220","dfg", 60_000)));
			
			
			assertEquals(3, Cellphone.size());
			
			for(Cellphone Cellphone2 : Cellphone) {
				System.out.println("Cellphone2");
			}
			
		}
		@Test
		public void testSchool() {
			HashSet<School> School = new HashSet<School>();
			assertEquals(true, School.add(new School("samsung","s4", "56", "hgsfh")));
			assertEquals(true, School.add(new School("lg", "l5", "79", "xd")));
			assertEquals(true, School.add(new School("onida", "o2", "220","dfg")));
			assertEquals(false, School.add(new School("onida", "o2", "220","dfg")));
			
			assertEquals(3, School.size());
			
			for(School School2 : School) {
				System.out.println("School2");
			}
			
		}
	}
	


