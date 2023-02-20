package clases;

/**
 * Clase que da vida a un Jugador
 * @author Alexis
 * @version 1
 */
public class Jugador {
	
/**
 * atributo que indica si el dorsal esta entre los parametros
 */
	private int dorsal;
	
	/**
	 * atributo que informa del numero de tarjetas 
	 */
	private int numeroTarjetasAmarillas;
	
	/**
	 * atributo que infroma del numero de tarjetas
	 */

	private int numeroTarjetasRojas;
	
	/**
	 * Metodo para consultar valor al atributo Dorsal
	 * @return Devuelve el Dorsal del jugador
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * Metodo para dar valor al atributo Dorsal
	 * @param dorsal int que asigna el atributo Dorsal
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	/**
	 * Metodo que consulta el atributo TarjetasAmarillas
	 * @return indica el numero de tarjetas amarillas
	 */

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	/**
	 * Metodo para dar valor al atributo TarjetasAmarillas
	 * @param numeroTarjetasAmarillas int que asigna el atributo TarjetasAmarillas
	 */

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	
	/**
	 * Metodo que consulta el atributo TarjetasRojas
	 * @return numeroTarjetasRojas numero de tarjetas rojas
	 */

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	
	/**
	 * Metodo para dar valor al atributo TarjetasRojas
	 * @param numeroTarjetasRojas int que asigna el atributo TrajetasRojas
	 */

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * Metodo que da al atributo Dorsal si este se encuentra entre 1 y 30
	 * @param dorsal entero del Dorsal que se asigna
	 */

	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}
	
	/**
	 * Metodo que consulta si un jugador esta expulsado
	 * @return Devuelve True o False dependiendo de las tarjetas que tenga el jugador
	 */

	public boolean estaExpulsado() {

		boolean expulsado = false;

		if (numeroTarjetasAmarillas == 2) {

			expulsado = true;

		}

		if (numeroTarjetasRojas == 1) {

			expulsado = true;

		}

		return expulsado;

	}

}