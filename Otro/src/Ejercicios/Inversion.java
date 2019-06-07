package Ejercicios;
import java.util.Scanner;
public class Inversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el monto: ");
		float monto=sc.nextFloat();
		float resultado;
		if(monto<=500000) {
			resultado=(15*monto)/100;
			System.out.println("La ganancia del 15% es: "+resultado);
		}
		else {
			resultado=(20*monto)/100;
			System.out.println("La ganancia del 20% es: "+resultado);
		}
	}

}
