package libro.cap02;
/*clase con un metodo para imprimir un conjunto de objetos. Este metodo recibira un Object[]
 * para recorrerlo e imprimir cada uno de sus elementos en pantalla
 * */
public class MuestraConjunto {
	public static void mostrar(Object[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]= "+arr[i].toString());
		}
	} 
}
