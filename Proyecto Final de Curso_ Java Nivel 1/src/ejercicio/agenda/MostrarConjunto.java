package ejercicio.agenda;

public class MostrarConjunto {
	
	public static void mostrar(Evento [] agenda) {
		for(int i=0; i<agenda.length; i++) {
			System.out.println("Evento["+i+"]= "+agenda[i]);
		}
	
	}
	public static void menu() {
		//menu
		System.out.println("Seleccione una opcion");
		System.out.println("1_ Cargar Datos");
		System.out.println("2_ Mostrar Datos");
		System.out.println("3_ Modifica Datos");
		System.out.println("4_ Buscar Datos");
		System.out.println("5_ Elimina Datos");
		System.out.println("6_ Salir");
	}

}
