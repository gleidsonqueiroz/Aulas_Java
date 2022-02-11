// LISTA DE ATIVIDADES 01 - EXERCICIO 04
import java.util.Scanner;

public class ListaAtividade01_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		String nome = ""; 
		double sal = 0;
		@SuppressWarnings("unused")
		int salNovo = 0;
				
		System.out.print("Informe o salário Atual: ");
	 	sal = scan.nextDouble();
	 	
	 	if(sal < 500) 
			System.out.println("O reajuste foi de 15%, salario atualizado => R$" + ((sal*0.15)+sal)); 
		else if(sal >= 500 && sal <= 1000) 
			System.out.println("O reajuste foi de 10%, salario atualizado para => R$" + ((sal*0.10)+sal));
		else if(sal > 1000 ) 
			System.out.println("O reajuste foi de 5%, salario atualizado => R$" + ((sal*0.05)+sal));
		 
		System.out.println("\nFim do Programa.");
	}
}
