package libro.cap01;
import java.util.StringTokenizer;
public class Cadenas7 {
//separar cadenas en segmentos 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringTokenizer permite separar una cadena en tokens delimitados por un separador
		String s="Juan|Marcos|Carlos|Matias";
		//Instanciamos el objeto st pasandole como argumentos la cadena s y el separador en este caso "|"
		StringTokenizer st= new StringTokenizer(s,"|");
		String tok;
		
		//verificamos si hay mas tokens
		while(st.hasMoreTokens()) {
			//si hay mas tokens se asigna a tok y se avanza al siguiente
			tok=st.nextToken();
			//se imprime en pantalla
			System.out.println(tok);
		}//continua hasta que se finaliza la cadena
		
		//utilizando el metodo split
		System.out.println("\nUtilizamos el m�todo Split");
		String [] tokens= s.split("[|]");
		for(int i=0; i<tokens.length;i++) {
			System.out.println(tokens[i]);
		}
	}

}
