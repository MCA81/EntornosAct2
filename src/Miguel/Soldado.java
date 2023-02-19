package Miguel;


/**
 * El objetivo de ésta clase es saber cuantas balas le quedan al soldado y si ha matado a su objetivo.
 * 
 * @author mca81
 *
 */

public class Soldado {
	
/**
 * atributo booleano si está muerto o no
 */
        private boolean estaMuerto;
/**
 * ponemos el numero de balas que le quedan.
 */
        private int numeroBalas;
       
/**
 * metodo que nos dice si le quedan balas para disparar
 * @return boolean
 */
        public boolean puedeDisparar() {

                      if(this.numeroBalas > 0) {

                                    return true;

                      }                          

                      return false;

        }

      //getter and setter 

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
 * metodo para saber el numero de balas y si está muerto el soldado.
 * @param sol
 */
		public void disparar(Soldado sol) {

                      this.numeroBalas--;

                      sol.estaMuerto = true;

        }

}

