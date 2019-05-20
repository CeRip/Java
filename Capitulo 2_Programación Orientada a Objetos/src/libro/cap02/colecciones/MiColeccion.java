package libro.cap02.colecciones;

public class MiColeccion {
	private Object datos[]=null;
	private int len=0;
	
	//en el constructor se especifica la capacidad inicial
	public MiColeccion(int capacidadInicial) {
		datos=new Object[capacidadInicial];
	}
	
	//retorna el i-esimo elemento de la coleccion
	public Object obtener(int i) {
		return datos[i];
	}
	
	//indica cuantos elementos tiene la coleccion
	public int cantidad() {
		return len;
	}
	
	public void insertar(Object elm, int i) {
		//verificamos si la capacidad del array esta colmada
		if(len==datos.length) {
			//creamos un nuevo array con el doble de la capacidad del anterior
			Object aux[]=datos;
			datos=new Object[datos.length*2];
			//copiamos en este los elementos de la coleccion 
			for(int j=0; j<len; j++) {
				datos[j]=aux[j];
			}
			//asignamos null al anterior para que el Garbage Collector libere la memoria
			aux=null;
		}
		
		//desplazamos los elementos del array entre la ultima y la i-enesima posicion
		//para poder asignar en esta el elemento que se presente insertar
		for(int j=len-1; j>=i; j--) {
			datos[j+1]=datos[j];
		}
		datos[i]=elm;
		//incrementamos el valor de la variable len
		len++;
	}
	
	//este metodo recorre el array mientras no se encuente el elemento que busca
	public int buscar (Object elm) {
		int i=0;
		//mientras no nos pasemos del tope y mientra no encuentre...
		for(;i<len && !datos[i].equals(elm);i++);
			//si no nos pasamos entonces encontre, sino ...no encontre
		return i<len ? i:-1;	
	}
	
	//su objetivo es agregar un elemento al final deel array se resuelve invocando al metodo "insertar"
	//para insetar el elemento en la posicion len
	public void agregar(Object elm) {
		insertar(elm,len);
	}
	
	//elimina un elemento desplazando los demas hacia arriba
	public Object eliminar(int i) {
		Object aux=datos[i];
		for(int j=i; j<len-1;j++) {
			datos[j]=datos[j+1];
		}
		len--;
		return aux;
	}
}
