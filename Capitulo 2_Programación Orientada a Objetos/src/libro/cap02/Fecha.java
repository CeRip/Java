package libro.cap02;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	//constructor
	public Fecha(int d, int m, int a) {
		dia=d;
		mes=m;
		anio=a;
	}
	
	//setters y getters
	public int getDia() {
		//retorna el valor de una variable dia
		return dia;
	}
	
	public void setDia(int dia) {
		//asigna el valor del parametro a la variable dia
		this.dia=dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes=mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio=anio;
	}
	
	//sobrescribimos el metodo equals
		public boolean equals(Object o) {
			Fecha otra=(Fecha) o;
			return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
		}
		
		//sobrescribimos el metodo toString
		public String toSting() {
			//retorna la cadena tal como queremos que se vea la fecha
			return dia+"/"+mes+"/"+anio;
		}
}
