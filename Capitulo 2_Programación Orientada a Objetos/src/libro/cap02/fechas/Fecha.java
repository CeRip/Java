package libro.cap02.fechas;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	//constructor con argumentos
	public Fecha(int d, int m, int a) {
		dia=d;
		mes=m;
		anio=a;
	}
	
	//contructor sobrecargado sin argumentos
	public Fecha() {
		//permite crear fechas sin argumentos y luego utilizar setters y getters
		//ej: Fecha f1= new Fecha();
	}
	
	//constructor que permite ingresar fechas con el formato dd/mm/aaaa
	public Fecha(String s) {
		//busco la primera ocurrencia de '/'
		int pos1= s.indexOf('/');
		//busco la ultima ocurrencia de '/'
		int pos2=s.lastIndexOf('/');
		//proceso el dia
		String sDia=s.substring(0, pos1);
		dia= Integer.parseInt(sDia);
		//proceso el mes
		String sMes=s.substring(pos1+1,pos2);
		mes=Integer.parseInt(sMes);
		//proceso el año
		String sAnio=s.substring(pos2+1);
		anio=Integer.parseInt(sAnio);
		
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
	
	//retorna la fecha expresada en dias si consideramos que cada año tiene 360 dias y los meses 30 dias
	private int fechaToDias() {
		return anio*360+mes*30+dia;
	}
	//asigna la fecha expresada en dias a los atributos
	private void diasToFecha(int i) {
		//dividimos por 360 y obtenemos el año
		anio=(int) i/360;
		//del resto de la division podemos obtener el mes y el dia
		int resto= i%360;
		//el mes es resto dividido en 30
		mes =(int)resto/30;
		//el resto de la division anterior son los dias
		dia= resto%30;
		//ajuste sobre si dia quedo en cero
		if(dia==0) {
			dia=30;
			mes--;
		}
		//ajuste por si el mes quedo en cero
		if(mes==0) {
			mes=12;
			anio--;
		}
	}
	
	//agrega dias a la fecha
	public void addDias(int d) {
		//convierto la fecha a  dias y le sumo d
		int sum=fechaToDias()+d;
		//la fecha resultante (sum) la separa en dia, mes y anio
		diasToFecha(sum);
	}
	
}
