package libro.cap02;
import java.util.Scanner;
public class TestFecha3 {
//sumar dias a una fecha
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//el usuario ingresa los datos de la fecha
		System.out.print("Ingrese la fecha (dd/mm/aaaa): ");
		//leo la fecha (cadena de caracteres) ingresada
		String sFecha= scanner.next();
		//creo un nuevo objeto de la clase Fecha
		Fecha f= new Fecha(sFecha);
		//lo muestro
		System.out.println("La fecha ingresada es: "+f.toSting());
		
		//el usuario ingresa una cantidad de dias a sumar
		System.out.println("Ingrese los dias a sumar (puede ser negativo): ");
		int diasSum=scanner.nextInt();
		//le sumo esos dias a la fecha
		f.addDias(diasSum);
		//muestro la nueva fecha (con los dias sumados)
		System.out.println("Sumando "+diasSum+" dias, queda: "+f.toSting());
		
		scanner.close();
	}

}
