package ejercicio.agenda;

public class TestEvento {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evento evento= new Evento();
		Fecha f= new Fecha(2,10,1970);
		evento.setNombre("Cumpleaños");
		evento.setEstado(false);
		evento.setFecha(f);
		
		System.out.println(evento.toString());
		System.out.println("Nombre: "+evento.getNombre());
		System.out.println("Estado: "+evento.getEstado());
		System.out.println("Fecha: "+evento.getFecha());
		
		
		Object[] agenda= {new Evento("Curso", true, new Fecha(2,5,2000)),
						  new Evento("Reunion", false, new Fecha(24,06,2005)),
						  new Evento("Bautiso", true, new Fecha(30,12,2014))};
		
		for(int i=0; i<agenda.length; i++) {
			System.out.println("Evento["+i+"]= "+agenda[i]);
		}
	}

}
