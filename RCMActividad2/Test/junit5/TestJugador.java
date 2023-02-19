package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.dao.Jugador;

class TestJugador {

		Jugador jugador1 = new Jugador(); 

		@Test 
		public void siPoneDorsal() { 

			System.out.println("Test 1"); 

			jugador1.ponerDorsal(1); 

			assertEquals(1, jugador1.getDorsal()); 

			jugador1.ponerDorsal(30); 

			assertEquals(30, jugador1.getDorsal()); 

		}
		
		@Test 
		public void noPoneDorsal() { 

			System.out.println("Test 2"); 

			jugador1.ponerDorsal(0); 

			assertEquals(-1, jugador1.getDorsal()); 
			 
			jugador1.ponerDorsal(31); 

			assertEquals(-1, jugador1.getDorsal()); 

		} 

		@Test 
		public void siEstaExpulsado() { 

			System.out.println("Test 3"); 

			jugador1.setNumeroTarjetasAmarillas(2); 

			assertTrue(jugador1.estaExpulsado()); 

			jugador1.setNumeroTarjetasRojas(1); 

			assertTrue(jugador1.estaExpulsado()); 

		} 

		@Test 
		public void noEstaExpulsado() { 

			System.out.println("Test 4"); 

			jugador1.setNumeroTarjetasAmarillas(1); 

			assertFalse(jugador1.estaExpulsado()); 

			jugador1.setNumeroTarjetasRojas(0); 

			assertFalse(jugador1.estaExpulsado()); 

		} 

}
