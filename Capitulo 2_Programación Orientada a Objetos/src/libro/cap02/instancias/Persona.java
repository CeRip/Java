package libro.cap02.instancias;

import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;

public class Persona {
	private String nombre;//atributo
	private String dni;//atributo
	private FechaDetallada fechaNacimiento;//atributo
	private int count=0;//variable de estado
	
	public Persona(String nombre, String dni, FechaDetallada fecNac) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento =fecNac;
	}
	
	public String toString() {
		count++;
		return nombre+", DNI: "+dni+", nacido el: "+fechaNacimiento+" ("+count+")";
	}
}
