package libro.cap01;
import java.util.Scanner;
public class DemoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dias[]= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		Scanner scanner= new Scanner(System.in);
		System.out.print("Ingese un dia de la semana (número): ");
		int v= scanner.nextInt();
		if(v<=dias.length) {
			System.out.println(dias[v-1]);
		}
		else {
			System.out.println("Dia Incorrecto...");
		}
		if(scanner != null) {
		    scanner.close();
		}
		
	}

}
