package modelo.clase;
/**
 * El objetivo de esta clase es la de crear una clase Soldado, la cual mediante metodos
 * podremos saber si puede disparar y poder matar otros Soldados.
 *  
 * Entidad Soldado con comprobador de estado(estaMuerto) y Numero de Balas.
 * 	
 * @author Daniel orquera
 * @version 1.0
 *
 */
public class Soldado {
	// Atributos
	/**
	 *  Atributo para comprobar si un soldado esta muerto o no.
	 */
	private boolean estaMuerto;
	/**
	 *  Valor numerico entero del numero de balas de un Soldado.
	 */
	private int numeroBalas;
	
	// Constructor
	public Soldado() {
	}
	/**
	 * Constructor  con parametros
	 * 
	 * @param estaMuerto , false si el esta vivo, true si esta muerto.
	 * @param numeroBalas , Introdcuir el numero de balas del objeto Soldado.
	 */
	public Soldado(boolean estaMuerto,int numeroBalas) {
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
	
	/**
	 * Este metodo nos permite conocer si un objeto de la clase Soldado puedeDisparar.
	 * 
	 * @return false, si el atributo numeroBalas del Objeto es menor a 1.
	 */
	
	// Get and set
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	public int getNumeroBalas() {
		return numeroBalas;
	}
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}	
	/**
	 *  Este metodo nos informa si objeto de la clase Soldado, puede disparar cumpliendo la condicion de tener mas de 0 balas
	 *  
	 * @return false si Soldado no tiene balas.
	 * @return true si Soldado tiene balas.
	 */
	//Metodos Propios
	public boolean puedeDisparar() {
		if(this.numeroBalas > 0) {
			return true;
		}
		return false;
	}
	/**
	 * Este metodo permite a un objeto de la clase Soldado, disparar a otro objeto de la clase Soldado,restarle municion y 
	 * establecer la muerte del Soldado de entrada con el metodo sol.estaMuerto a true.
	 * 
	 * @param sol Se introduce un objeto de la clase Soldado 
	 */

	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
}
