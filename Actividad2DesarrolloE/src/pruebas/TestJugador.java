package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Jugador;

class TestJugador {


	static Jugador jugador1;

	// metodo que se ejecuta antes de todos los test, aprovechamos para crear una
	// única vez un objeto de Jugador
	@BeforeAll
	static void antesdenada() {
		jugador1 = new Jugador();
	}

	@Test
	void testDelMetodoPonerDorsal1() {
		jugador1.ponerDorsal(1);
		assertEquals(jugador1.getDorsal(), 1);

		jugador1.ponerDorsal(30);
		assertEquals(jugador1.getDorsal(), 30);

		jugador1.ponerDorsal(12);
		assertEquals(jugador1.getDorsal(), 12);

		jugador1.ponerDorsal(-121);
		assertEquals(jugador1.getDorsal(), -1);

		jugador1.ponerDorsal(41);
		assertEquals(jugador1.getDorsal(), -1);

	}

	@Test
	void testDelMetodoEstaExpulsado1() {
		jugador1.setNumeroTarjetasAmarillas(0);
		jugador1.setNumeroTarjetasRojas(0);
		boolean respuesta = jugador1.estaExpulsado();
		assertFalse(respuesta);

		jugador1.setNumeroTarjetasAmarillas(1);
		jugador1.setNumeroTarjetasRojas(0);
		respuesta = jugador1.estaExpulsado();
		assertFalse(respuesta);

		jugador1.setNumeroTarjetasAmarillas(2);
		jugador1.setNumeroTarjetasRojas(0);
		respuesta = jugador1.estaExpulsado();
		assertTrue(respuesta);

		jugador1.setNumeroTarjetasAmarillas(0);
		jugador1.setNumeroTarjetasRojas(1);
		respuesta = jugador1.estaExpulsado();
		assertTrue(respuesta);

		jugador1.setNumeroTarjetasAmarillas(2);
		jugador1.setNumeroTarjetasRojas(1);
		respuesta = jugador1.estaExpulsado();
		assertTrue(respuesta);

	}
}
