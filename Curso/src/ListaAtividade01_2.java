// LISTA DE ATIVIDADES 01 - EXERCICIO 02
import java.util.Scanner;

public class ListaAtividade01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int A = 0;
		int B = 0;
		
		System.out.print("Informe 1º Número: ");
	 	A = scan.nextInt(); 
	 	System.out.print("Informe 2º Número: ");
	 	B = scan.nextInt(); 
	 	
	 	
		
		if(A < B) System.out.println("Número A=" + A + " é Menor que B=" + B + "."); 
			
		else if (A > B) System.out.println("Número A=" + A + " é Maior que B=" + B + "."); {
				
		} if(A == B) System.out.println("Os Números A = "+ A +" e B = "+B+" são iguais.A e B"); {
			
		}
		System.out.println("\nFim do Programa.");
		
	}

}
