package libro.cap01;

public class Cadenas2 {
//ubicar la posicion de un caracter dentro de una cadena
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Esto es una cadena";
		//indexOf retorna la posicion de la primera ocurrencia de un caracter
		int pos1=s.indexOf('c');
		//lastIndexOf retorna la posicion de la ultima ocurrencia del caracter dentro del string
		int pos2=s.lastIndexOf('c');
		int pos3=s.indexOf('x');
		//si el caracter no exite en la cadena, ambos metodos retornaran un valor negativo
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);
	}

}
