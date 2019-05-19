package libro.cap02;
import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;

public class TestPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a fec le asigno un objeto FechaDetallada
		Fecha fec=new FechaDetallada("25/02/2009");
		//a obj le asigno un objeto FechaDetalla
		Object obj= new FechaDetallada("3/12/2008");
		//Imprimo los objetos
		System.out.println("fec= " +fec);
		System.out.println("obj= "+obj);
	}

}
