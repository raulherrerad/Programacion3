package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tema4.GestionFicheros;

class TestCaseGestionFicheros {
	
	static GestionFicheros gesFich;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
			gesFich = new GestionFicheros();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEliminarFichero() {
		
		//assertEquals(GestionFicheros.OK,gesFich.eliminarFichero("c:\\logs\\fichero.txt"));
		
		//assertEquals(GestionFicheros.OK,gesFich.eliminarFichero("c:\\logs\\salidas.log"));
		
		
		
	}
	
	
	
	@Test
	void testDirectorioVacio()
	{
		
		assertNotNull(gesFich.directorioVacio("c:\\logs\\vacia"));
		
		
	}

}
