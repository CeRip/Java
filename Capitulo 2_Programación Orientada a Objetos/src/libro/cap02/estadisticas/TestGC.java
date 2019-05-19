package libro.cap02.estadisticas;

public class TestGC {
	//definimos la variable estatica cont
	private static int cont=0;
	
	//su valor aumenta cuando se crean objetos
	public TestGC() {
		cont++;
		System.out.println(cont);
	}
	
	//su valor decrese cuando se destruyen
	public void finalize() {
		cont--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			new TestGC();
		}
	}

}
