package ejercicio.agenda;
import java.util.Scanner;

public class TestEvento {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evento evento= new Evento();
		Fecha f= new Fecha(2,10,1970);
		evento.setNombre("Cumpleaños");
		evento.setEstado(false);
		evento.setFecha(f);
				
		Scanner scanner=new Scanner(System.in);
		
		//System.out.println(evento.toString());
		/*System.out.println("Nombre: "+evento.getNombre());
		System.out.println("Estado: "+evento.getEstado());
		System.out.println("Fecha: "+evento.getFecha());
		*/
		
		Evento[] agenda= {new Evento("Curso", true, new Fecha(2,5,2000)),
						  new Evento("Reunion", false, new Fecha(24,06,2005)),
						  new Evento("Bautiso", true, new Fecha(30,12,2014))};
		
		Evento agenda1[]=new Evento[3];
	
		int f1=1;
		String nombrePorCargar=new String();
		boolean estadoPorCargar;
		String sfecha=new String();
		Fecha fechaPorCargar=new Fecha();
		
		do {
			MostrarConjunto.menu();
			int opcion=scanner.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Cargar Datos");
					for(int i=0;i<agenda1.length;i++) {
						System.out.println("\nIngrese los datos");
						System.out.println("Nombre: ");
						nombrePorCargar=scanner.next();
						System.out.println("Estado: ");
						estadoPorCargar=scanner.nextBoolean();
						System.out.println("Fecha(dd/mm/aaaa): ");
						sfecha=scanner.next();
						fechaPorCargar=new Fecha(sfecha);
						agenda1[i]=OperacionesAgenda.cargarEvento(nombrePorCargar,estadoPorCargar,fechaPorCargar);
					}
					break;
				case 2:
					System.out.println("Mostrar Datos");
					MostrarConjunto.mostrar(agenda1);
					//System.out.println(evento.toString());
					break;
				case 3:
					System.out.println("Modifica Datos");
					
					break;
				case 4:
					System.out.println("Buscar Datos");
					
					break;
				case 5:
					System.out.println("Eliminar Datos");
					
					break;
				case 6:
					System.out.println("Salida");
					System.out.println("Desea continuar?");
					System.out.println("1_Si\t2_No");
					f1=scanner.nextInt();
					break;
				default:
					System.out.println("Elija la opcion correcta");
					break;
			}
			if(f1!=2) {
				System.out.println("Desea continuar?");
				System.out.println("1_Si\t2_No");
				f1=scanner.nextInt();
			}
		}while(f1==1);
		
	scanner.close();	
	}

}
