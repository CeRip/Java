package libro.cap01;

public class Cadenas {
// acceder directamente a los elementos de una cadena
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Esto es una cadena";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(s.length()-1));
		char c;
		//muetra la cadena de carracteres junto con la posicion de cada caracter
		for(int i=0; i<s.length(); i++) {
			c=s.charAt(i);
			System.out.println(i+"->"+c);
		}
	}

}
