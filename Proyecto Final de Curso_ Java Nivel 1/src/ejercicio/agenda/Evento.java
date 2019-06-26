package ejercicio.agenda;
 //Nombre, dni, mail, telefono
public class Evento {
	//private int id;
	private String nombre;
	private boolean estado;
	private Fecha fecha;
	/*
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}*/
	
	//setters y getters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEstado(boolean estado) {
		this.estado=estado;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setFecha(Fecha fecha) {
		this.fecha=fecha;
	}
	
	public String getFecha() {
		return fecha.toSting();
	}
	
	//constructor
	public Evento(String nom, boolean e, Fecha f) {
		nombre=nom;
		estado=e;
		fecha=f;
	}
	
	public Evento() {
		
	}
	
	//sobrescribimos el metodo toString
	public String toString() {
		return "Nombre: "+nombre+"\nEstado: "+estado+"\nFecha: "+fecha.toSting()+"\n";
	}
	
}
