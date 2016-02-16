import java.util.Scanner;

public class Examen1Progra1 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.print ("\nExamen 1 Programacion I. Renan Alberto Zelaya Martinez 21541052\n\n\n\n");

		System.out.print ("Ingrese el numero del inciso a revisar (1-3)");
		int inciso = lea.nextInt();
		boolean seguir = true;
		
		do {
			switch	(inciso){
				case 1: 
					System.out.print ("\nIngrese cuantos juegos tiene. ");
					int cantidad = lea.nextInt();
					int consola = 0;
					char r = ' ';
					int xbox=0, ps3=0, wii=0;
					for (int cont=1;cont<=cantidad ;cont++ ) {
						System.out.println ("\nEl "+cont+" juego de que consola es:\n1. XBOX\n2. PS3\n3. WII");
						consola = lea.nextInt();
						if (consola==1) {
							xbox++;
						}
						else if (consola==2) {
							ps3++;
						}
						else if (consola==3) {
							wii++;	
						} 
					}
					System.out.println ("Usted tiene: "+xbox+" juegos de XBOX");
					System.out.println ("Usted tiene: "+ps3+" juegos de PS3");
					System.out.println ("Usted tiene: "+wii+" juegos de WII");
					
					System.out.println ("\n\nDesea continuar revisando? y or n");
					r = lea.next().charAt(0);

					if (r=='n') {
						seguir = false;
					}
					System.out.print ("Ingrese el numero del inciso a revisar (1-3)");
					inciso = lea.nextInt();
				break;
				case 2:
					System.out.println ("Ingrese su nombre");
					String nom = lea.nextLine();
					System.out.println ("Ingrese la zona residencial donde vive. A, B o C");
					char residencial = lea.next().charAt(0);
					System.out.println ("Ingrese tipo de cliente. DIPLOMATICO o CIUDADANO");
					String cliente = lea.next();
					System.out.println ("Ingrese cantidad de Kilovatios consumidos de energia");
					double kv = lea.nextDouble();
					double subtotal = 0, desc=0, ajuste=0, total=0;
					if (kv>0) {
						if (kv<=100) {
							if (residencial=='a'||residencial == 'A') {
								subtotal=50;
							}
							else if (residencial=='b'||residencial == 'B') {
								subtotal = 30;
							}
							else subtotal=20;
						}
						else if (kv>100 && kv<=1000) {
							if (residencial=='a'||residencial == 'A') {
								subtotal=100;
							}
							else if (residencial=='b'||residencial == 'B') {
								subtotal = 60;
							}
							else subtotal=40;
						}
						else {
							if (residencial=='a'||residencial == 'A') {
								subtotal=200;
							}
							else if (residencial=='b'||residencial == 'B') {
								subtotal = 120;
							}
							else subtotal=80;
						}
						if (cliente.equals("DIPLOMATICO")||cliente.equals("Diplomatico")||cliente.equals("diplomatico")) {
							desc = subtotal*.5;
						}
						ajuste = subtotal*.3;
						total = subtotal-desc+ajuste;
					}
					else {
						System.out.println ("\nFactura de electricidad.\nCliente: "+nom);
						System.out.println ("El subtotal de KV consumidos es: "+subtotal);
						System.out.println ("Su descuento es de: "+desc);
						System.out.println ("El ajuste de Combustible es: "+ajuste);
						System.out.println ("Total a pagar: "+total);
					}

					System.out.println ("\n\nDesea continuar revisando? y or n");
					r = lea.next().charAt(0);

					if (r=='n') {
						seguir = false;
					}
					System.out.print ("Ingrese el numero del inciso a revisar (1-3)");
					inciso = lea.nextInt();
				break;
				case 3:
					for (int cont=1;cont<=12 ;cont++ ) {
					int dias=0;
					int residuo = cont%2;
					if (residuo==1) {
						dias=31;
					}
					else if (cont==2) {
						dias=28;
					}
					else {
						dias=30;
					}

					switch (cont){
						case 1: System.out.println ("Mes "+cont+" tiene "+dias+" dias");
						break;
						case 2: System.out.println ("Mes "+cont+" tiene "+dias+" dias");
						break;
						case 3: System.out.println ("Mes "+cont+" tiene "+dias+" dias");
						break;
						case 4: System.out.println ("Mes "+cont+" tiene "+dias+" dias");
						break;
						case 5: System.out.println ("Mes "+cont+" tiene "+dias+" dias");
						break;
						case 6: System.out.println ("Mes "+cont+" tiene "+dias+" dias");
						break;
						case 7: System.out.println ("Mes "+cont+" tiene 31 dias");
						break;
						case 8: System.out.println ("Mes "+cont+" tiene 31 dias");
						break;	
						case 9: System.out.println ("Mes "+cont+" tiene 30 dias");
						break;
						case 10: System.out.println ("Mes "+cont+" tiene 31 dias");
						break;
						case 11: System.out.println ("Mes "+cont+" tiene 30 dias");
						break;
						case 12: System.out.println ("Mes "+cont+" tiene 31 dias");
					break;				
				}
			}
					System.out.println ("\n\nDesea continuar revisando? y or n");
					r = lea.next().charAt(0);

					if (r=='n') {
						seguir = false;
					}
					System.out.print ("Ingrese el numero del inciso a revisar (1-3)");
					inciso = lea.nextInt();
				break;
				default: 
					System.out.println ("Ingrese numeros entre 1 y 3 ");
					inciso = lea.nextInt();

			}
		}
		while (seguir);
		
	




		//Renan Zelaya
	} 
}