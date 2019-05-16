package libro.cap01;

public class Cadenas3 {
//obtener diferentes porciones de la cadena original
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Esto es una cadena";
		//substring puede invocarse con:
		//un argumento:substring(a) en donde la cadena a extraer comienza especificada(a) y se extiende hasta el final del string 
		//o dos argumentos: substring(a,b) se indica desde(a) y hasta(b). Que delimita la subcadena que debemos extraer
		//incluye 0 y no 7
		String s1= s.substring(0,7);
		String s2=s.substring(8,11);
		String s3=s.substring(8);
		
		//imprimimos las variables
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
