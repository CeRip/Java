package ejercicio.agenda;

public class TestEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evento evento= new Evento();
		Fecha f= new Fecha(2,10,1970);
		evento.setNombre("Cumpleaños");
		evento.setEstado(false);
		evento.setFecha(f);
		
		System.out.println("Nombre: "+evento.getNombre());
		System.out.println("Estado: "+evento.getEstado());
		System.out.println("Fecha: "+evento.getFecha());
	}

}
