package libro.cap02.fechas;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no funciona porque sobreescribimos el constructor
		//Fecha f=new Fecha();
		//reemplaza a la linea anterior
		Fecha f= new Fecha(2,10,1970);
		
		//las variables son privadas, no tenemos acceso
		/*f.dia=2;
		f.mes=10;
		f.anio=1970;*/
		
		//permite asignar valores a los elementos de la clase
		f.setDia(2);
		f.setMes(10);
		f.setAnio(1970);
		//imprimo los valores almacenados
		System.out.println("Dia= "+f.getDia());
		System.out.println("Mes= "+f.getMes());
		System.out.println("Año= "+f.getAnio());
		//imprimo la fecha, utilizando el metodo sobrescrito toString()
		System.out.println(f.toSting());
	}

}
