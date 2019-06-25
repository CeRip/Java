package libro.cap02.interfaces;
import libro.cap02.interfaces.Alumno;
import libro.cap02.interfaces.criterios.CriterioAlumNombre;

public class TestOrdenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defino un array alumnos
		Alumno arr[]= {new Alumno("Juan",20,8.5), new Alumno("Pedro",18,5.3), new Alumno("Alberto",19,4.6)};
		Util.ordenar(arr);//lo ordeno
		//lo muestro ordenado
		/*for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		muestraArray(arr);
		//defino, ordeno y muestro un array de strings
		String[] arr2= {"Pablo","Andres", "Marcelo"};
		Util.ordenar(arr2);
		muestraArray(arr2);
		
		//defino, ordeno y muestro un array de integers
		Integer [] arr3= {new Integer(5),new Integer(3), new Integer(1)};
		Util.ordenar(arr3);
		muestraArray(arr3);
		
		//utilizo los criterios
		
		System.out.println("Utilizando los criterios");
		
		Util.ordenar(arr,new CriterioAlumNombre());
		Util.imprimir(arr);
		
	}
	@SuppressWarnings("unchecked")
	private static void muestraArray(Comparable arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
