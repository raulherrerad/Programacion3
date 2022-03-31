package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import tema4.Calculadora;

class CalculadoraTest {

	static Calculadora cal = null;
	
	//Se ejecuta una vez, antes de ejecutar los test
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cal = new Calculadora();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	//Se ejecuta una vez para cada repeticion de los repeatedtest
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSumaSimple() {
		
		assertEquals(8,cal.suma(4,5));
		
	}
	
	@DisplayName("Test multiple de la suma")
	@RepeatedTest(100)
	void testSumaRepetida()
	{
		int x = Calculadora.generarAleatorio();
		int y = Calculadora.generarAleatorio();

		//Vamos a generar un numero 
		
		assertEquals((x+y),cal.suma(x,y),"Se espera que coincida la suma");

		assertTrue((x+y)==cal.suma(x, y));
		
	}

}
