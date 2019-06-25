package ejercicio.agenda;
 
public class Evento {
	//private int id;
	private String nombre;
	private boolean estado;
	private Fecha f;
	/*
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}*/
	
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
	
	public void setFecha(Fecha f) {
		this.f=f;
	}
	
	public String getFecha() {
		return f.toSting();
	}
	
}
