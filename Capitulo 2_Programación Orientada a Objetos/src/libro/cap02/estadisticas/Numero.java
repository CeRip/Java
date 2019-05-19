package libro.cap02.estadisticas;

public class Numero {
	private double valor;
	
	public Numero(double v) {
		valor=v;
	}
	
	public String toString() {
		return Double.toString(valor);
	}
	
	public Numero sumar(double a) {
		valor +=a;
		//permite aplicar invocaciones sucesivas sobre el metodo sumar 
		return this;
	}
		
	public static double sumar(double a, double b) {
		return a+b;
	}
}
