// LISTA DE ATIVIDADES 01 - EXERCICIO 03
import java.util.Scanner;

public class ListaAtividade01_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String nome = ""; 
		int notaTrab = 0;
		int notaProva = 0;
		int media = 0;
		
		System.out.print("Informe o nome: ");
	 	nome = scan.next(); 
	 	System.out.print("Informe a Nota Trabalho: ");
	 	notaTrab = scan.nextInt(); 
	 	System.out.print("Informe a Nota Prova: ");
	 	notaProva = scan.nextInt(); 
	 	
	 	media = (notaTrab + notaProva ) / 2;
	 	
		
		if(media < 7) System.out.println("O " + nome + " esta Reprovado"); 
		else  System.out.println("O " + nome + " esta Aprovado, com média= "+ media +"."); 
		System.out.println("\nFim do Programa.");
		
	}

}
