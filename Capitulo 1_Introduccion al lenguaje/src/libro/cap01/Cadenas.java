package libro.cap01;

public class Cadenas {
// acceder directamente a los elementos de una cadena
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Esto es una cadena";
		//chatAt() es un metodo que retorna un caracter en una posicion determinada
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(s.length()-1));
		char c;
		//muetra la cadena de carracteres junto con la posicion de cada caracter
		//length es un metodo que retorna la cantidad de caracteres que tiene la cadena
		for(int i=0; i<s.length(); i++) {
			c=s.charAt(i);
			System.out.println(i+"->"+c);
		}
	}

}
