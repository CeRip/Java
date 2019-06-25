package libro.cap02.interfaces;

public class Alumno implements Comparable<Alumno> {

	private String nombre;
	private int edad;
	private double notaPromedio;
	
	//constructor
	public Alumno(String nom, int e, double np) {
		this.nombre=nom;
		this.edad=e;
		this.notaPromedio=np;
	}
	
	//metodo heredado de la interfaz comparable
	//este metodo retornara la diferencia entre las edades de los alumnos
	//si el resultado es positivo significa que el primer alumno es mayor, si es negativo el segundo es mayor
	//si es igual a cero ambos tienen la misma edad
	public int compareTo (Alumno otroAlumno) {
		return this.edad-otroAlumno.edad;
	}
	
	public String toString() {
		return nombre+", "+edad+", "+notaPromedio;
	}
	//setters y getters...

	public Alumno getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNotaPromedio() {
		// TODO Auto-generated method stub
		return 0;
	}
}
