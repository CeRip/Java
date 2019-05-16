package libro.cap01;

public class Cadenas4 {
//prefijos y sufijos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Un buen libro sobre Java?";
		//startsWith y endsWith se utilizan para verificar si una cadena comienza prefijo o termina con un sufijo 
		boolean b1=s.startsWith("Un buen");
		boolean b2=s.startsWith("A");
		boolean b3=s.endsWith("Java?");
		boolean b4=s.endsWith("Bye!");
		
		//mostrara true o false
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}
