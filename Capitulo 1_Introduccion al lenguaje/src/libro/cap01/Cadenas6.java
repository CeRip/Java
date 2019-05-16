package libro.cap01;
import java.util.Scanner;

public class Cadenas6 {
//muestra un valor entero en diferentes bases numericas
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entero: ");
		//El usuario ingresa un valor numerico por teclado
		int v= scanner.nextInt();
		System.out.println("Valor Ingresado: "+v);
		//el programa mostrara el valor ingresado en binario, octal y hexadecimal
		System.out.println("Binario: "+Integer.toBinaryString(v));
		System.out.println("Octal: "+Integer.toOctalString(v));
		System.out.println("Hexadecimal: "+Integer.toHexString(v));
		//el usuario ingresa una base numerica
		System.out.println("Ingrese una base numerica: ");
		int b=scanner.nextInt();
		String sBaseN = Integer.toString(v,b);
		//se muestra el numero ingresado en la base numerica
		System.out.println(v+ " en base (" +b+")= "+sBaseN);
		//cierra el recurso
		scanner.close();
	}

}
