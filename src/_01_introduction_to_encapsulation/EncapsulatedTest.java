package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulatedTest {
EncapsulateTheData data = new EncapsulateTheData();
	@Test
	void ItemsRecievedIsEncapsulated() {
		int num = 0;
		try {
			
			assertEquals(0, data.getItemsRecieved(num), 0);
		
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertEquals(0, data.getItemsRecieved(num), 0);
		}

	}
	@Test
	void degreesTurnedIsEncapsulated() {
	float degrees = 30;
	try {
		assertEquals(degrees, data.getDegreesTurned(degrees),30);
	}
		catch(IndexOutOfBoundsException e ) {
			e.printStackTrace();
			assertEquals(degrees, data.getDegreesTurned(degrees),30);
		}
	}
	@Test
	void nomenclatureIsEncapsulated() {
		String nom = "Hello";
	}
	@Test 
	void memberObjIsEncapsulated() {
		Object o = 0.0;
	}
}