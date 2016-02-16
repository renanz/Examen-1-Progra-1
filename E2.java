import java.util.Scanner;

public class E2 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.print ("\nExamen 1 Programacion I. Renan Alberto Zelaya Martinez 21541052\n\n\n\n");

					System.out.println ("Ingrese su nombre");
					String nombre = lea.nextLine();
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
						System.out.println ("\nFactura de electricidad.\nCliente: "+nombre);
						System.out.println ("El subtotal de KV consumidos es: "+subtotal);
						System.out.println ("Su descuento es de: "+desc);
						System.out.println ("El ajuste de Combustible es: "+ajuste);
						System.out.println ("Total a pagar: "+total);
					}

		//Renan Zelaya
	} 
}