package libro.cap01;

public class DemoCaracteres {
//conjunto de ejercicios que muestran la diferencia entre el uso de caracteres y cadenas de caracteres
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 13");
		System.out.println("Objeto \t Char");
		for(int i=0; i<5; i++) {
			System.out.print(i+"A\t");
			System.out.println(i+'A');
		}
		
		System.out.println();
		System.out.println("Ejercicio 14");
		for(int i='A'; i<'Z'; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Ejercicio 15");
		char c;
		for(int i='A'; i<'Z'; i++) {
			//para asignar un int a un char debemos "castear"
			c=(char)i;
			System.out.println(c);
		}
	}

}
