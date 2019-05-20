package libro.cap02.colecciones;

public class MiColeccion {
	private Object datos[]=null;
	private int len=0;
	
	//en el constructor se especifica la capacidad inicial
	public MiColeccion(int capacidadInicial) {
		datos=new Object[capacidadInicial];
	}
	
	
}
