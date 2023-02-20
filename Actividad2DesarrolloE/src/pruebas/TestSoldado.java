package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Soldado;

class TestSoldado {


		
		static Soldado soldado1;
		static Soldado soldado2;
		
		// metodo que se ejecuta antes de todos los test, aprovechamos para crear una única vez los dos objetos de Soldado que se usan en casi todas las pruebas
	
		@BeforeAll
		static void antesdenada() {
			 soldado1 = new Soldado();
			 soldado2 = new Soldado();
		}
	
		@Test
		void testPuedoDisparar() {
				
			soldado1.setNumeroBalas(10);
			boolean respuesta1  = soldado1.puedeDisparar();
			assertTrue(respuesta1);
			
			soldado1.setNumeroBalas(0);
			boolean respuesta2  = soldado1.puedeDisparar();
			assertFalse(respuesta2);
		}
	
		@Test
		void testDisparar1() {
			soldado1.setNumeroBalas(2);
			soldado1.disparar(soldado2);
			assertTrue(soldado2.isEstaMuerto()==true);
		}
		
		@Test
		void testDisparar2() {
			soldado1.setNumeroBalas(2);
			soldado1.disparar(soldado2);
			assertEquals(soldado1.getNumeroBalas() , 1);
		}
	
		// no se ejecuta esta prueba por que no esta contemplada en el código, aunque creemos que se deberia realizar en el código los cambios para que esta prueba funcione
	//	@Test
	//	void testDisparar3() {		
	//		soldado1.setNumeroBalas(0);
	//		soldado1.disparar(soldado2);	
	//		assertTrue(soldado2.isEstaMuerto()==false);
	//	}

}
