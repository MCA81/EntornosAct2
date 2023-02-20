package junit5;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import modelo.clase.Jugador;

import org.junit.jupiter.api.Test;

class TestJugador {

	/**
	 * 	Objeto : 		 	jugador1
	 *  DescripcionTest :	Creacion de un Jugador con Dorsal negativo
	 *  TestMetodo: 		ponerDorsal();
	 *  Resultado : 		No Failure;
	 *  ExplicacionR:	 	Se crea un objeto de la clase Jugador con un dorsal numero 100 que nos devolvera -1
	 */
	Jugador jugador1 = new Jugador();
	@Test 
	public void jugadorPonerDorsalExcesivo() {
		int a = -1;
		jugador1.ponerDorsal(100);
		assertEquals(a,jugador1.getDorsal());
	}
	/**
	 * 	Objeto : 		 	jugador1
	 *  DescripcionTest :	Colocacion a un Jugador un Dorsal Correcto
	 *  TestMetodo: 		ponerDorsal();
	 *  Resultado : 		Not Failure;
	 *  ExplicacionR:	 	Se coloca a un Jugador un dorsal numero 1, que nos devolvera 1.
	 */
	@Test 
	public void jugadorPonerDorsalNormal() {
		int a = 1;
		jugador1.ponerDorsal(1);
		assertEquals(a,jugador1.getDorsal());
	}

	/**
	 * 	Objeto : 		 	jugador1
	 *  DescripcionTest :	No expulsion de un jugador con dorsal [Dorsal 0]
	 *  TestMetodo: 		estaExpulsado()
	 *  Resultado : 		Not Failure;
	 *  ExplicacionR:	 	Se comprueba el metodo sin tarjetas amarillas o rojas
	 */
	@Test 
	public void jugadorSinExpulsion() {
		jugador1.setNumeroTarjetasAmarillas(0);
		jugador1.setNumeroTarjetasRojas(0);
		assertFalse(jugador1.estaExpulsado());
	}
	
	/**
	 * 	Objeto : 		 	jugador1
	 *  DescripcionTest :	Expulsion de un jugador por Tarjetas Amarilas con Dorsal [Dorsal 0]
	 *  TestMetodo: 		estaExpulsado()
	 *  Resultado : 		Not Failure;
	 *  ExplicacionR:	 	Se comprueba el metodo estaExpulsado()
	 */
	@Test 
	public void jugadorExpulsadoTarjetasAmarillas() {
		jugador1.setNumeroTarjetasAmarillas(2);
		jugador1.setNumeroTarjetasRojas(0);
		assertTrue(jugador1.estaExpulsado());
	}
	/**
	 * 	Objeto : 		 	jugador1
	 *  DescripcionTest :	Expulsion de un jugador por Tarjetas Rojas con  Dorsal [Dorsal 0]
	 *  TestMetodo: 		estaExpulsado()
	 *  Resultado : 		Not Failure;
	 *  ExplicacionR:	 	Se comprueba el metodo estaExpulsado()
	 */
	@Test 
	public void jugadorExpulsadoTarjetasRojas() {
		jugador1.setNumeroTarjetasAmarillas(0);
		jugador1.setNumeroTarjetasRojas(1);
		assertTrue(jugador1.estaExpulsado());
	}
}
