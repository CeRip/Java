package libro.cap01;

import java.util.Scanner;

public class ParOImpar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un valor: ");
		int v= scanner.nextInt();
		int resto= v%2;
		
		//utilizando un if inline
		String mssg= (resto==0) ? " es Par" : " es Impar";
		//muestro el resultado
		System.out.println(v+" "+mssg);
		if(scanner != null) {
		    scanner.close();
		}
	}

}
