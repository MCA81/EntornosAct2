package clases;

/**
 * Clase que da vida a un Soldado
 * @author Alexis
 * @version  1
 * 
 */
public class Soldado {

	/**
	 * atributo que indica si el soldado esta muerto o no
	 */
	private boolean estaMuerto;

	/**
	 * atributo que informa del numero de bala que tiene el soldado. No deberia ser negativo
	 */
	private int numeroBalas;

	/**
	 * Metodo que indica si el soldado esta muerto
	 * @return boolean que es true si el soldado ha muero, false en caso contrario
	 */
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	/**
	 * Metodo para dar valor al atributo estaMuerto. 
	 * @param estaMuerto boolean que se asigna al atributo estaMuerto. 
	 */
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	
	
	/**
	 * Metodo que devuelve el numero de balas del soldado
	 * @return int que indida el numero de balas
	 */
	public int getNumeroBalas() {
		return numeroBalas;
	}

	/**
	 * Metodo para dar valor al atributo nuemnroBalas. 
	 * @param numeroBalas int que se asigna al atributo numneroBalas. 
	 */
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	/**
	 * Metodo que indica si puedo disparar. 
	 * Se podra disparar si el soldado posee balas.
	 * @return boolean que es true si se puede disparar, false en caso contrario
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Matodo que dispara a otro soldado.
	 * Debe restar el numero de balas
	 * Deja al otro soldado muerto
	 * @param sol Otro objeto de Soldado al que se dispara
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
}
