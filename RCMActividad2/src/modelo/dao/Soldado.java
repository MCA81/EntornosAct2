package modelo.dao; 

/**  
* El objetivo de esta clase es ver si un soldado esta muerto o no. Esto sucedera en funcion del numero de balas que haya.  
* ESto lo hace mediante dos metodos.  
* @author Felix De Pablo 
* @version 1.0 
*/ 
public class Soldado { 
	/** 
	 * @param estaMuerto. Es de tipo booleano, por los que puede ser true o false. 
	 */ 
    private boolean estaMuerto; 
/** 
* @param numeroBalas. Es un valor numerico entero (int) e indica el número de balas que tenemos (ej: 0, 1, 2,...) 
*/ 
    private int numeroBalas; 

    // Constructores de la clase. Primero  por defecto (vacio) y despues con todo. 

    public Soldado() { 

		super(); 

	} 

	public Soldado(boolean estaMuerto, int numeroBalas) { 

		super(); 

		this.estaMuerto = estaMuerto; 

		this.numeroBalas = numeroBalas; 

	} 

// Metodos getter and setter de los dos atributos. 

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

	// METODOS 

	/** 
	 * Metodo que nos indíca si podemos dispar en función del numero de balas.  
     * @return se le pasa la variable numeroBalas, si es numero es mayor que 0 
     * devuelve true, si es 0 o numero negativo devuelve false. 
     */ 
	    public boolean puedeDisparar() { 

        if(this.numeroBalas > 0) { 

                      return true; 
        }                           
        return false; 
} 

/** 
* Ejecuta el disparo y resta una bala del numero total que nos han indicado. 
*  Asigna el valor  booleano correspondiente al atributo estaMuerto.  
* @param sol parametro de entrada, objeto de tipo Soldado. Nos pasara el numero de balas que nos han indicado que existen. 
*/ 
    public void disparar(Soldado sol) { 

        this.numeroBalas--; 

        sol.estaMuerto = true; 

	} 
} 