package libro.cap01;

public class EchoJava {
//ejecutar por linea de comandos, mostrara los argumentos que pasamos por la linea de comandos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
		System.out.println("Total: "+args.length+" argumentos");
	}

}
