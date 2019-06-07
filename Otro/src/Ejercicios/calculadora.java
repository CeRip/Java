package Ejercicios;
import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int f1=0,f2=0;
		float resultado, n1, n2;
		int opcion;
		
		do {
			System.out.println("Bienvenido a la Calculadora");
			System.out.println("Seleccione la opcion correcta: ");
			System.out.println("1_Sumar \t 2_Restar \n3_Multiplicar \t 4_Dividir");
			opcion = sc.nextInt();
				
			switch(opcion) {
			case 1:
				System.out.println("	Suma	");
				System.out.println("\nIngrese el primer numero: ");
				n1=sc.nextFloat();
				System.out.println("\nIngrese el segundo numero: ");
				n2=sc.nextFloat();
				resultado=n1+n2;
				System.out.println("\nEl Resultado es: "+resultado);
				break;
			case 2:
				System.out.println("	Resta	");
				System.out.println("\nIngrese el primer numero: ");
				n1=sc.nextFloat();
				System.out.println("\nIngrese el segundo numero: ");
				n2=sc.nextFloat();
				resultado=n1-n2;
				System.out.println("\nEl Resultado es: "+resultado);
				break;
			case 3:
				System.out.println("	Multiplicacion	");
				System.out.println("\nIngrese el primer numero: ");
				n1=sc.nextFloat();
				System.out.println("\nIngrese el segundo numero: ");
				n2=sc.nextFloat();
				resultado=n1*n2;
				System.out.println("\nEl Resultado es: "+resultado);
				break;
			case 4:
				System.out.println("	Division	");
				System.out.println("\nIngrese el primer numero: ");
				n1=sc.nextFloat();
				do {
					System.out.println("\nIngrese el segundo numero diferente de cero: ");
					n2=sc.nextFloat();
					if (n2!=0) {
						resultado=n1/n2;
						System.out.println("\nEl Resultado es: "+resultado);
						f1=0;
					}
					else {
						System.out.println("Debe ingresar un numero distinto de cero");
						f1=1;
					}
				}while(f1==1);
				break;
			default:
				System.out.println("Opcion Invalida");
			}
			System.out.println("Desea continuar?");
			System.out.println("1_Continuar\t\t 2_Salir");
			f2=sc.nextInt();
		}while(f2==1);
		
		sc.close();
		
	}
}
