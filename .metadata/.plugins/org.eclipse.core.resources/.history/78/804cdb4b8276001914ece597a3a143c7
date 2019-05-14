package libro.cap01;
import java.util.Scanner;
public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defino un array de 10 elementos enteros
		int[] arr= new int[10];
		//scanner para leer el teclado
		Scanner scanner =new Scanner(System.in);
		//leo el primer valor
		System.out.print("Ingrese un valor (0=>fin): ");
		int v= scanner.nextInt();
		int i=0;
		//Mientras v sea distinto de cero e i menor que 10
		while (v!=0 && i<10) {
			//asigna v en un arr[i] y luego incrementa el valor de i
			arr[i++]=v;
			//leo el siguiente valor
			System.out.print("Ingrese el siguiente valor de (0>=fin): ");
			v=scanner.nextInt();
		}
		//retorno el array mostrando su contenido
		for(int j=0; j<i; j++) {
			System.out.println(arr[j]);
		}
	}

}
