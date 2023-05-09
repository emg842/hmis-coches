package org.hmis;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MainTest {

	@Test
	void testObjectNull() {
		
		Main main = new Main();
		
		assertNotEquals(main, null);
	}

	@Test
	void testMain() {
    	String ruta = "data/coches.json";
    	Coche[] coches = JsonReader.leerCochesJSON(ruta);

    	String cadena = "";

    	for (Coche coche : coches) {
            cadena = cadena + coche + "\r\n";
        }

    	Main.main(null);		
	}
}
