package Miguel;

/**
 * clase de la entidad jugador, para saber cuantas tarjetas amarillas o rojas tiene, si está expulsado o no y su número de dorsal. 
 * @author mca81
 *
 */

public class Jugador {
	
	/**
	 * Numero del dorsal del jugador.
	 */
	 private int dorsal;

	 /**
	  * numero de tarjetas amarillas que acumula el jugador.
	  */
     private int numeroTarjetasAmarillas;
     
     
/**
 * numero de tarjetas rojas que acumula el jugador.
 */
     private int numeroTarjetasRojas;

                  



//Getter and Setter

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
 * metodo que nos dice si el dorsal del jugador es correcto o no 
 * @param dorsal
 */

	public void ponerDorsal(int dorsal) {

                   if(dorsal >= 1 && dorsal <= 30) {

                                 this.dorsal = dorsal;

                   }else {

                                 this.dorsal = -1;

                   }

     }

    /**
     * metodo que nos dice si el jugador está expulsado o no
     * @return boolean
     */
	public boolean estaExpulsado() {

                   boolean expulsado = false;                                                  

                   if(numeroTarjetasAmarillas == 2) {

                                 expulsado = true;

                   }                          

                   if(numeroTarjetasRojas == 1) {

                                 expulsado = true;

                   }                          

                   return expulsado;

     }            
}
