package junit5;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.junit.jupiter.api.Test;
import modelo.clase.Soldado;

class TestSoldado {
	/**
	 * 	Objeto : 		 	soldado1
	 *  DescripcionTest :	Creacion de un Soldado sin municion
	 *  TestMetodo: 		puedeDisparar();
	 *  Resultado : 		false;
	 *  ExplicacionR:	 	Se crea un objeto de la clase Soldado sin municion
	 */
	Soldado soldado1 = new Soldado(false,0);
	@Test 
	public void puedeDispararFalse() {
		assertFalse(soldado1.puedeDisparar());
	}

	/**
	 * 	Objeto : 		 	soldado1
	 *  DescripcionTest :	soldado1 con municion puede usar metodo puedeDisparar()
	 *  TestMetodo: 		puedeDisparar();
	 *  Resultado : 		true;
	 *  ExplicacionR:	 	Se crea un objeto de la clase Soldado con municion
	 */
	@Test 
	public void puedeDispararTrue() {
		soldado1.setNumeroBalas(1);
		assertTrue(soldado1.puedeDisparar());
	}
	
	/**
	 * 	Objeto : 		 	soldado2
	 *  DescripcionTest :	Creacion de soldado2 muerto para comprobar si puede disparar
	 *  TestMetodo: 		puedeDisparar();
	 *  Resultado : 		true;
	 *  ResultadoEsperado:  false;
	 *  ExplicacionRE:	 	Un soldado no deberia poder disparar muerto
	 */
	
	Soldado soldado2 = new Soldado(true,1);
	@Test 
	public void soldadoMuertoNoPuedeDispararFalse() {
		assertFalse(soldado2.puedeDisparar());
	}
	/**
	 * 	Objeto : 		 	soldado1 y soldado2
	 *  DescripcionTest :	soldado1 sin municion intenta matar a soldado2
	 *  TestMetodo: 		disparar(Soldado sol)
	 *  Resultado : 		true;
	 *  ExplicacionR:	 	Se crea un objeto de la clase Soldado con municion
	 */
	@Test 
	public void soldadoSinMunicionpuedeMatarFalse() {
		soldado2.setEstaMuerto(false);
		soldado1.setNumeroBalas(0);
		soldado1.disparar(soldado2);
		assertFalse(soldado2.isEstaMuerto());
	}
	
	/**
	 * 	Objeto : 		 	soldado3
	 *  DescripcionTest :	Creacion de soldado3 ni vivo ni muerto parar comprobar si puede disparar
	 *  TestMetodo: 		puedeDisparar();
	 *  Resultado : 		true;
	 *  ResultadoEsperado:  false;
	 *  ExplicacionRE:	 	Un soldado no deberia poder disparar si no esta ni vivo ni muerto.
	 */
	Soldado soldado3 = new Soldado();
	@Test 
	public void soldadoInexistenteNoPuedeDispararFalse() {
		soldado3.setNumeroBalas(1);
		assertFalse(soldado3.puedeDisparar());
	}
	/**
	 * 	Objeto : 		 	soldado3
	 *  DescripcionTest :	Soldado que en el constructor no esta ni vivo ni muerto
	 *  TestMetodo: 		isEstaMuerto();
	 *  Resultado : 		false;
	 *  ResultadoEsperado:  true;
	 *  ExplicacionRE:	 	La creacion de un objeto de la clase soldado3 por defecto, es decir,sin un estado de vida 
	 *  					definido en el constructor, el estado de vida vendra como true, es decir estara vivo. 
	 * 						Al usar el metodo isEstarMuerto nos indicara que esta VIVO, pero realmente, nunca se definio
	 * 						su estado de vida.
	 */
	@Test 
	public void soldadoInexistenteisEstaMuertoTrue() {
		assertTrue(soldado3.isEstaMuerto());
	}	      

	
	
	
}
