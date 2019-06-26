package ejercicio.agenda;
//import java.util.Scanner;
public class OperacionesAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Evento cargarEvento(String nom,boolean est, Fecha f) {
		
		Evento evento1=new Evento();
		evento1.setNombre(nom);
		evento1.setEstado(est);
		evento1.setFecha(f);
		return evento1;
	}
	
	

}
