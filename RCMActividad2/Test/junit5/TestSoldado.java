package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.dao.Soldado;

class TestSoldado {

	Soldado soldado1 = new Soldado(); 

	@Test 
	public void siPuedeDispararTest() { 

	System.out.println("Test 1"); 

	soldado1.setNumeroBalas(1); 

	assertTrue(soldado1.puedeDisparar()); 

	}	 

	@Test 
	public void noPuedeDispararTest() { 
	 
	System.out.println("Test 2"); 

	soldado1.setNumeroBalas(0); 

	assertFalse(soldado1.puedeDisparar()); 

	} 

	@Test 
	public void  dispararTest(){ 

	System.out.println("Test 3"); 

	soldado1.setNumeroBalas(2); 

	soldado1.disparar(soldado1); 

	assertEquals(1, soldado1.getNumeroBalas()); 

	} 

	@Test 
	public void siDisparaMuere() { 

	System.out.println("Test 4"); 

	soldado1.setNumeroBalas(1); 

	soldado1.disparar(soldado1); 

	assertTrue(soldado1.isEstaMuerto()); 

	} 

	@Test 
	public void siNoDisparaNoMuere() { 

	System.out.println("Test 5"); 

	soldado1.setNumeroBalas(0); 

	soldado1.disparar(soldado1); 
	 
	assertFalse(soldado1.isEstaMuerto()); 

	} 

}
