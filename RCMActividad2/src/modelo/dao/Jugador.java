package modelo.dao; 

/** 
* La clase Jugador asigna mediante metodos un dorsal al jugador y nos indica 
* si ha sido expulsado en funcion de las tarjetas amarillas y rojas recibidas 
* @author Felix de Pablo 
* @version 1.0 
*/ 
public class Jugador { 

/** 
* @param dorsal. valor numero entero 
*/ 
        private int dorsal; 

/** 
* @param numeroTarjetasAmarillas. valor numero entero 
*/ 
        private int numeroTarjetasAmarillas; 

/** 
* @param numeroTarjetasRojas. valor numero entero  
*/ 
        private int numeroTarjetasRojas;   

// CONSTRUCTORES 

        public Jugador() { 

	super(); 

} 

		public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) { 

			super(); 

			this.dorsal = dorsal; 

			this.numeroTarjetasAmarillas = numeroTarjetasAmarillas; 

			this.numeroTarjetasRojas = numeroTarjetasRojas; 

		} 

// GETTTER AND SETTER 

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
		 * El método asigna un dorsal al jugador. Debe estar comprendido entre el 1 y el 30. 
		 * Si no lo está le asinará -1 
		 * @param dorsal parametro valor entero. es el dorsal que se asigna a un jugador. 
		 */ 
		public void ponerDorsal(int dorsal) { 

                      if(dorsal >= 1 && dorsal <= 30) { 

                                    this.dorsal = dorsal; 

                      }else { 

                                    this.dorsal = -1; 

                      } 

        } 

/** 
* El metodo nos indica si el jugador esta expulsado en funcion de las tarjetas recibidas durante el partido.  
* @param expulsado parametro de entrada booleano. 
* @return devuelve un valor booleano, true si el jugador esta expulsado. 
* false si no lo esta.  
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

 