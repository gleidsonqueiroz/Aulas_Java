// LISTA DE ATIVIDADES 01 - EXERCICIO 01
import java.util.Scanner;

public class ListaAtividade01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Informe um Número: ");
		num = scan.nextInt(); 
		
		if(num > 0) System.out.println("O Número " + num + " é Positivo."); 
			
		else if (num < 0) System.out.println("O Número " + num + " é Negativo."); {
				
		} if(num == 0) System.out.println("O Número " + num + " é Neutro."); {
			
		}
		System.out.println("\nFim do Programa.");
		
	}

}
