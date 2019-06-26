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
		
		//se utiliza para identificar el elemento a modificar
		String nomId=new String();
		
		do {
			MostrarConjunto.menu();
			int opcion=scanner.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Cargar Datos");
					for(int i=0;i<agenda1.length;i++) {
						
						agenda1[i]=OperacionesAgenda.cargarEvento();
					}
					break;
				case 2:
					System.out.println("Mostrar Datos");
					MostrarConjunto.mostrar(agenda1);
					//System.out.println(evento.toString());
					break;
				case 3:
					System.out.println("Modifica Datos");
					System.out.println("Ingrese el nombre del elemento a modificar");
					nomId=scanner.next();
					agenda1=OperacionesAgenda.modificarEvento(nomId, agenda1);
					
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
