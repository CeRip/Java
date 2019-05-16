package libro.cap01;

public class Cadenas5 {
//posicion de un substring dentro de la cadena
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Un buen libro de Java, buen material";
		int pos1=s.indexOf("buen");
		int pos2=s.lastIndexOf("buen");
		
		System.out.println(pos1);
		System.out.println(pos2);
		
	}

}
