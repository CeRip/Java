package libro.cap02.interfaces;

public class Util {
//esta clase utilizara un metodo estatico ordenar, que recibira un array de objetos "comparables"
//con esto podemos ordenarlos sin problema aplicando el algoritmo de "la burbuja"
	
	@SuppressWarnings("unchecked")
	//recibimos un Comparable[] por lo que cada elemento del array puede responder si precede o no a otro elemento de su misma especie
	public static void ordenar(Comparable arr[]) {
		boolean ordenado=false;
		while(!ordenado) {
			ordenado=true;
			for (int i=0, j=arr.length-1;i<=j;i++,j--) {
				if (arr[i+1].compareTo(arr[i])<0) {
					Comparable aux=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=aux;
					ordenado=false;
				}
			}
		}
	}
}
