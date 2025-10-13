package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	static Cuenta cuenta12345;
	static Cuenta cuenta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta12345 = new Cuenta(0);
		cuenta67890 = new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta12345.setSaldo(50.0);
		cuenta67890.setSaldo(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*@Test
	void testIngresar() {
		cuenta.ingresar(500.0);
		assertEquals(500, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(500.0);
		assertEquals(-500, cuenta.getSaldo());
	}*/
	
	@Test
	void test0014() {	
		cuenta12345.retirar(200.0);
		assertEquals(-150, cuenta12345.getSaldo());
		
		
		cuenta12345.ingresar(100.0);
		assertEquals(-50, cuenta12345.getSaldo());
		
		
		cuenta12345.retirar(200.0);
		assertEquals(-250, cuenta12345.getSaldo());
		
		//cuenta67890
		
		cuenta67890.retirar(350.0);
		assertEquals(-350, cuenta67890.getSaldo());
		
		
		cuenta67890.retirar(200.0);
		assertEquals(-350, cuenta67890.getSaldo());
		
		
		cuenta67890.retirar(150.0);
		assertEquals(-500, cuenta67890.getSaldo());
		
		cuenta67890.ingresar(50.0);
		assertEquals(-450, cuenta67890.getSaldo());
		
		cuenta67890.retirar(100.0);
		assertEquals(-450, cuenta67890.getSaldo());
	}
	
	
}
