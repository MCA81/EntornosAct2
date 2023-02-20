package testing;
import modelo.clase.Jugador;
import modelo.clase.Soldado;
public class Testing1 {

	public static void main(String[] args) {
		
		Soldado soldado1 = new Soldado(false,0);
		Soldado soldado2 = new Soldado(false,0);
		
		System.out.println(soldado2.isEstaMuerto());
		soldado1.disparar(soldado2);
		System.out.println(soldado2.isEstaMuerto());
		
	}

}
