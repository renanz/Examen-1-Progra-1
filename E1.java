import java.util.Scanner;

public class E1 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.print ("\nExamen 1 Programacion I. Renan Alberto Zelaya Martinez 21541052\n\n\n\n");

		//1
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
					




		//Renan Zelaya
	} 
}