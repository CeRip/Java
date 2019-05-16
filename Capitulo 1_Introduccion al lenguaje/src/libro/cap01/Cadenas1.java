package libro.cap01;

public class Cadenas1 {
//pasar una cadena a mayuscula y minuscula
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Esto es una cadena";
		//toUpperCase modifica la cadena colocando los caracteres a Mayuscula
		String sMayus= s.toUpperCase();
		//toLowerCase modifica la cadena colocando los caracteres a Miniscula
		String sMinus=s.toLowerCase();
		System.out.println("Original: "+s);
		System.out.println("Mayuscula: "+sMayus);
		System.out.println("Minuscula: "+sMinus);
		
	}

}
