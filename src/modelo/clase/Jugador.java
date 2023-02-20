package modelo.clase;

/**
 *  El objetivo de esta clase es la de crear una clase Jugador que nos permita
 *  darle un numero al jugador, que llamaremos dorsal, ademas el Jugador podra o no seguir jugando
 *  dependiendo del numero de TarjetasAmarillas o TarjetasRojas.
 *  
 * @author Daniel Orquera
 * @version 1.0
 * 
 *
 */
public class Jugador {
	
	// Atributos
	/**
	 *  Atributo para asignar al jugador un numero(dorsal)
	 */
	private int dorsal;
	/**
	 *  Atributo para asignar al jugador un numero de Tarjetas Amarillas.
	 */
	private int numeroTarjetasAmarillas;
	/**
	 *  Atributo para asignar al jugador un numero de Tarjetas Rojas
	 */
	private int numeroTarjetasRojas;
	
	//Constructor
	public Jugador() {
	}
	/**
	 * Construcor con parametros
	 * @param dorsal, se introduce un numero de tipo int para asignar un jugador .
	 * @param numeroTarjetasAmarillas, numero de tarjetas amarillas
	 * @param numeroTarjetasRojas, numero de tarjetas rojas
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	// Get and set
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	/**
	 *  Este metodo nos permite establecer el numero del Dorsal a un objeto de la clase Jugador´
	 *  
	 * @param dorsal, numero del dorsal del jugador
	 */
	// Metodos Privados
	public void ponerDorsal(int dorsal) {
		if (dorsal >=1 && dorsal <=30) {
			this.dorsal = dorsal;
		}
		else {
			this.dorsal = -1;
		}
	}
	/**
	 *  Este metodo nos permite saber si un jugador esta expulsado debido al numero de tarjetas amarillas o rojas.
	 *  
	 *  @return true si el jugador estaExpulsado
	 *  @return false si el jugador no esta esta expulsdao.
	 */
	public boolean estaExpulsado() {
		boolean expulsado = false;
		if((numeroTarjetasAmarillas == 2)||(numeroTarjetasRojas == 1)) {
			expulsado = true;
		}
		return expulsado; 
	}
}
