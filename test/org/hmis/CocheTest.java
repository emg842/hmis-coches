package org.hmis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CocheTest {

	@Test
	void testEqualsObject() {
		Coche c = new Coche ();   // Arrange
		assertTrue(c.equals(c));  // Action // Assert
	}
	
	@Test
	void testEqualsObjectNull() {
		Coche c = new Coche ();   // Arrange
		Coche c2 = null;
		assertFalse(c.equals(c2));  // Action // Assert
	}
	

	@Test
	void testEqualsObjectString() {
		Coche c = new Coche ();   // Arrange
		String c2 = "";
		assertFalse(c.equals(c2));  // Action // Assert
	}

	
	@Test
	void testEqualsObjectMultiple1() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple2() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2023, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple3() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple4() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Auris", 2022, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple5() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2022, 32000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple6() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		assertEquals("Toyota", primero.getMarca());  // Action // Assert
		assertEquals("Nissan", segundo.getMarca());
	}
	
	@Test
	void testEqualsObjectMultiple7() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		assertEquals("Corolla", primero.getModelo());  // Action // Assert
		assertEquals("Corolla", segundo.getModelo());
	}
	
	@Test
	void testEqualsObjectMultiple8() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		assertEquals(2022, primero.getAño());  // Action // Assert
		assertEquals(2022, segundo.getAño());
	}
	
	@Test
	void testEqualsObjectMultiple9() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		assertEquals(22000, primero.getPrecio());  // Action // Assert
		assertEquals(22000, segundo.getPrecio());
	}
	
	@Test
	void testEqualsObjectMultiple10() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		primero.setMarca("Ferrari");
		assertEquals("Ferrari", primero.getMarca());  // Action // Assert
		segundo.setMarca("Renault");
		assertEquals("Renault", segundo.getMarca());  // Action // Assert
		
	}
	
	@Test
	void testEqualsObjectMultiple11() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		primero.setModelo("A201");
		assertEquals("A201", primero.getModelo());  // Action // Assert
		segundo.setModelo("A200");
		assertEquals("A200", segundo.getModelo());  // Action // Assert
		
	}
	
	@Test
	void testEqualsObjectMultiple12() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		primero.setAño(2010);
		assertEquals(2010, primero.getAño());  // Action // Assert
		segundo.setAño(2012);
		assertEquals(2012, segundo.getAño());  // Action // Assert
		
	}
	
	@Test
	void testEqualsObjectMultiple13() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		primero.setPrecio(20000);
		assertEquals(20000, primero.getPrecio());  // Action // Assert
		segundo.setPrecio(30000);
		assertEquals(30000, segundo.getPrecio());  // Action // Assert
		
	}
	
	@Test
	void testEqualsObjectMultiple14() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		Coche tercero = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals("Coche [marca=" + "Toyota" + ", modelo=" + "Corolla" + ", año=" + 2022 + ", precio=" + 22000 + "]", primero.toString());
		assertEquals(false, primero.equals(segundo));
		assertEquals(true, primero.equals(tercero));
	}
}
