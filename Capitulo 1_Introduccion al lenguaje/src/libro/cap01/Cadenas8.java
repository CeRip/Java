package libro.cap01;
import java.util.Scanner;
public class Cadenas8 {
//comparacion de cadenas 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ingrese una cadena: ");
		String s1=scanner.next();
		System.out.print("Ingrese otra cadena");
		String s2=scanner.next();
		//muestro las cadenas para verificar lo que contienen
		System.out.println("s1= ["+s1+"]");
		System.out.println("s2= ["+s2+"]");
		//esto esta mal ya que comaparamos direcciones y no contenido
		//if(s1==s2) 
		//equals compara los contenidos
		if(s1.contentEquals(s2)) {	
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son distintas");
		}
	scanner.close();
	}

}
