package org.hmis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

class CocheTest {

	/*
	@Test
	void testEqualsObject() {

		Coche c = new Coche();

		assertTrue(c.equals(c));
	}

	@Test
	void testEqualsObjectNull() {

		Coche c1 = new Coche();
		Coche c2 = null;

		assertFalse(c1.equals(c2));
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	void testEqualsObjectString() {

		Coche c1 = new Coche();
		String c2 = "";

		assertFalse(c1.equals(c2));
	}

	@Test
	void testEqualsObjectMultiple1() {

		Coche c1 = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche c2 = new Coche("Toyota", "Corolla", 2022, 22000);

		assertEquals(true, c1.equals(c2));
	}

	@Test
	void testEqualsObjectMultiple2() {

		Coche c1 = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche c2 = new Coche("Toyota", "Corolla", 2023, 22000);

		assertEquals(false, c1.equals(c2));
	}

	@Test
	void testEqualsObjectMultiple3() {

		Coche c1 = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche c2 = new Coche("Nissan", "Corolla", 2022, 22000);

		assertEquals(false, c1.equals(c2));
	}

	@Test
	void testEqualsObjectMultiple4() {

		Coche c1 = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche c2 = new Coche("Toyota", "Auris", 2022, 22000);

		assertEquals(false, c1.equals(c2));
	}

	@Test
	void testEqualsObjectMultiple5() {

		Coche c1 = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche c2 = new Coche("Toyota", "Corolla", 2022, 32000);

		assertEquals(false, c1.equals(c2));
	}
	*/
	
	@SuppressWarnings("unlikely-arg-type")
	@ParameterizedTest
	@CsvFileSource(files = "test/org/hmis/cochesEquals.csv")
	void testEqualsObject(String cochesCSV) {

		Coche c1 = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche c2_c = null;
		String c2_s = null;
		Boolean resultado;

		if (cochesCSV.split(", ")[0].equals("sameObject")) {
			c2_c = c1;
			resultado = Boolean.parseBoolean(cochesCSV.split(", ")[1]);
		} else if (cochesCSV.split(", ")[0].equals("nullObject")) {
			resultado = Boolean.parseBoolean(cochesCSV.split(", ")[1]);
		} else if (cochesCSV.split(", ")[0].equals("")) {
			c2_s = "";
			resultado = Boolean.parseBoolean(cochesCSV.split(", ")[1]);
		} else {
			String[] coche = cochesCSV.split(", ");

			String marca = coche[0];
			String modelo = coche[1];
			int anio = Integer.parseInt(coche[2]);
			int precio = Integer.parseInt(coche[3]);

			resultado = Boolean.parseBoolean(cochesCSV.split(", ")[4]);
			
			c2_c = new Coche(marca, modelo, anio, precio);
		}
		
		if (c2_c == null) {
			assertEquals(resultado, c1.equals(c2_s));
		} else {
			assertEquals(resultado, c1.equals(c2_c));
		}
	}

	@Test
	void testHashCode() {

		Coche c = new Coche();

		assertEquals((Object)c.hashCode(), c.hashCode());
	}

	/*
	@Test
	void testGetMarca() {

		String marca = "Toyota";
		Coche c = new Coche(marca, "", 0, 0);

		assertEquals(marca, c.getMarca());
	}
	*/
	
	@ParameterizedTest
	@ValueSource(strings = {"Toyota", "Ford", "Chevrolet", "Honda"})
	void testGetMarca(String marca) {

		Coche c = new Coche(marca, "", 0, 0);
		
		assertEquals(marca, c.getMarca());
	}

	/*
	@Test
	void testGetModelo() {

		String modelo = "Corolla";
		Coche c = new Coche("", modelo, 0, 0);

		assertEquals(modelo, c.getModelo());
	}
	*/

	@ParameterizedTest
	@ValueSource(strings = {"Corolla", "Mustang", "Camaro", "Civic"})
	void testGetModelo(String modelo){

		Coche c = new Coche("", modelo, 0, 0);

		assertEquals(modelo, c.getModelo());
	}

	/*
	@Test
	void testGetAnio() {

		int anio = 2022;
		Coche c = new Coche("", "", anio, 0);

		assertEquals(anio, c.getAnio());
	}
	*/
	
	@ParameterizedTest
	@ValueSource(ints = {2022, 2021, 2023, 2022})
	void testGetAnio(int anio) {

		Coche c = new Coche("", "", anio, 0);

		assertEquals(anio, c.getAnio());
	}

	/*
	@Test
	void testGetPrecio() {

		int precio = 22000;
		Coche c = new Coche("", "", 0, precio);

		assertEquals(precio, c.getPrecio());
	}
	*/
	
	@ParameterizedTest
	@ValueSource(ints = {22000, 45000, 52000, 25000})
	void testGetPrecio(int precio) {

		Coche c = new Coche("", "", 0, precio);

		assertEquals(precio, c.getPrecio());
	}

	/*
	@Test
	void testSetMarca() {

		String marca = "Toyota";
		Coche c = new Coche();

		c.setMarca(marca);

		assertEquals(marca, c.getMarca());
	}
	*/
	
	@ParameterizedTest
	@ValueSource(strings = {"Toyota", "Ford", "Chevrolet", "Honda"})
	void testSetMarca(String marca) {

		Coche c = new Coche();

		c.setMarca(marca);

		assertEquals(marca, c.getMarca());
	}

	/*
	@Test
	void testSetModelo() {

		String modelo = "Corolla";
		Coche c = new Coche();

		c.setModelo(modelo);

		assertEquals(modelo, c.getModelo());
	}
	*/

	@ParameterizedTest
	@ValueSource(strings = {"Corolla", "Mustang", "Camaro", "Civic"})
	void testSetModelo(String modelo) {

		Coche c = new Coche();

		c.setModelo(modelo);

		assertEquals(modelo, c.getModelo());
	}

	/*
	@Test
	void testSetAnio() {

		int anio = 2022;
		Coche c = new Coche();

		c.setAnio(anio);

		assertEquals(anio, c.getAnio());
	}
	*/
	
	@ParameterizedTest
	@ValueSource(ints = {2022, 2021, 2023, 2022})
	void testSetAnio(int anio) {

		Coche c = new Coche();

		c.setAnio(anio);

		assertEquals(anio, c.getAnio());
	}

	/*
	@Test
	void testSetPrecio() {

		int precio = 2022;
		Coche c = new Coche();

		c.setPrecio(precio);

		assertEquals(precio, c.getPrecio());
	}
	*/

	@ParameterizedTest
	@ValueSource(ints = {22000, 45000, 52000, 25000})
	void testSetPrecio(int precio) {

		Coche c = new Coche();

		c.setPrecio(precio);

		assertEquals(precio, c.getPrecio());
	}

	/*
	@Test
	void testToString() {

		String marca = "Toyota";
		String modelo = "Corolla";
		int anio = 2022;
		int precio = 22000;

		String cadena = "Coche [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + "]";

		Coche c = new Coche(marca, modelo, anio, precio);

		assertEquals(cadena, c.toString());
	}
	*/
	
	@ParameterizedTest
	@CsvFileSource(files = "test/org/hmis/cochesToString.csv")
	void testToString(String cochesCSV) {

		String[] cocheCadena = cochesCSV.split("; ");
		String[] coche = cocheCadena[0].split(", ");
		
		String marca = coche[0];
		String modelo = coche[1];
		int anio = Integer.parseInt(coche[2]);
		int precio = Integer.parseInt(coche[3]);
		
		String resultado = cocheCadena[1];
		
		Coche c = new Coche(marca, modelo, anio, precio);
		
		assertNotEquals(resultado, c.toString());
	}
}