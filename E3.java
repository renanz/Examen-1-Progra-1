import java.util.Scanner;

public class E3 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.print ("\nExamen 1 Programacion I. Renan Alberto Zelaya Martinez 21541052\n\n\n\n");


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


		//Renan Zelaya
	} 
}