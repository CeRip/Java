package libro.cap02.estadisticas;

public final class TestEstatico {
	private int a=0;
	
	public void unMetodo() {
		System.out.println("este es unMetodo()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEstatico t=new TestEstatico();
		//no tengo acceso a la variable a
		System.out.println("a vale "+t.a);//accedo a la variable a
		//no tengo acceso a unMetodo
		t.unMetodo();
	}

}
