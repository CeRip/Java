package ejercicio.agenda;
import java.util.Scanner;
public class OperacionesAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Evento cargarEvento() {
		
		Evento evento1=new Evento();
		String nombrePorCargar=new String();
		boolean estadoPorCargar;
		String sfecha=new String();
		Fecha fechaPorCargar=new Fecha();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("\nIngrese los datos");
		System.out.println("Nombre: ");
		nombrePorCargar=scanner.next();
		System.out.println("Estado: ");
		estadoPorCargar=scanner.nextBoolean();
		System.out.println("Fecha(dd/mm/aaaa): ");
		sfecha=scanner.next();
		fechaPorCargar=new Fecha(sfecha);
		evento1.setNombre(nombrePorCargar);
		evento1.setEstado(estadoPorCargar);
		evento1.setFecha(fechaPorCargar);
		return evento1;
	}
	
	public static Evento[] modificarEvento(String nomId, Evento [] agenda) {
		int posicion=0;
		for(int i=0; i<agenda.length; i++) {
			if(nomId.equals(agenda[i].getNombre())) {
				agenda[i]=cargarEvento();
				posicion=i+1;
				}	
		}
		if(posicion!=0) {
			System.out.println("Se Modifico el Evento["+posicion+"]");
			MostrarConjunto.mostrar(agenda);
		}
		else {
			System.out.println("Ningun elemento coincide");
		}
		return agenda;
	}
	
	
}
