package libro.cap02.colecciones;

public class TestCola {
//utiliza una cola de numeros enteros
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiCola<Integer> c=new MiCola<Integer>();
		c.encolar(1);
		c.encolar(2);
		c.encolar(3);
		System.out.println(c.desencolar());//saca el 1
		System.out.println(c.desencolar());//saca el 2
		c.encolar(4);
		System.out.println(c.desencolar());//saca el 3
		System.out.println(c.desencolar());//saca el 4
	}

}
