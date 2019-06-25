package ejercicio.agenda;

public class MostrarConjunto {
	
	public static void mostrar(Evento [] agenda) {
		for(int i=0; i<agenda.length; i++) {
			System.out.println("Evento["+i+"]= "+agenda[i]);
		}
	}

}
