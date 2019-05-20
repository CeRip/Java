package libro.cap02.colecciones;
import java.util.Scanner;

public class TestMiColeccion {
//muestra una lista de nombres en orden inverso
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//creo una coleccion con capacidad inicial=5
		MiColeccion mc=new MiColeccion(5);
		//leo el primer nombre
		System.out.println("Ingrese Nombre: ");
		String nom=scanner.next();
		while(!nom.equals("FIN")) {
			//inserto siempre en la posicion cero
			mc.insertar(nom, 0);
			//leo el siguiente nombre
			nom=scanner.next();
		}
		String aux;
		//recorro la coleccion y tomo cada uno de sus elementos
		for(int i=0; i<mc.cantidad(); i++) {
			//el metodo obtener retorna un Object entonces tenemos
			//que castear a String
			aux=(String) mc.obtener(i);
			System.out.println(aux+"-"+aux.length()+" caracteres");
		}
		scanner.close();
	}

}
