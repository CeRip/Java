package libro.cap02.fechas;
import java.util.Scanner;
public class TestFecha2 {
//comparar dos fechas 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//el usuario ingresa los datos de una fecha
		System.out.print("Ingrese Fecha1 (dia, mes y anio): ");
		int dia=scanner.nextInt();
		int mes=scanner.nextInt();
		int anio=scanner.nextInt();
		//crea un objeto de la clase Fecha
		Fecha f1= new Fecha(dia, mes, anio);
		
		//el usuario ingresa los datos de la segunda fecha
		System.out.print("Ingrese Fecha2 (dia, mes y anio): ");
		dia=scanner.nextInt();
		mes=scanner.nextInt();
		anio=scanner.nextInt();
		//crea un objeto de la clase Fecha
		Fecha f2=new Fecha(dia, mes, anio);
		
		//imprime las fechas
		System.out.println("Fecha1= "+f1.toSting());
		System.out.println("Fecha2= "+f2.toSting());
		
		if (f1.equals(f2)) {
			System.out.println("Son Iguales");
		}
		else {
			System.out.println("Son distintas");
		}
		
		//utilizamos el nuevo constructor
		Fecha f3=new Fecha("25/10/2004");
		System.out.println(f3.toSting());
		scanner.close();
	}

}
