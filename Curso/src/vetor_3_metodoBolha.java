// METODO BOLHA

import java.util.Scanner;

public class vetor_3_metodoBolha {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		final int TAM = 4;
		int [] numeros = new int[TAM];
		int aux;
		int x;

		//Entrada de Dados - 
		for (int i=0; i < numeros.length; i++){
			System.out.println("Digite um número inteiro: ");
			numeros [i] = scan.nextInt();
		}
		// PROCESSAMENTO 
		// ordenação por METODO BOLHA (o PIOR TIPO É O BOLHA ) - O MELHOR É O INSERÇÃO DIRETA, E DEPOIS O SELEÇÃO DIRETA E O PIOR BOLHA.
		for (int i=0; i < numeros.length-1; i++){
			for (int j=0; j < numeros.length-1-i; j++){
				
				if(numeros[j] > numeros[j+1]) {
				
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros [j+1] = aux; 
				}
			}

		}

		System.out.println("\nvetor ordenado:");
		for (int i=0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		// Pesquisa a POSIÇÃO NO VETOR de um certo Valor		
		System.out.println("\nDigite um valor a ser procurado: ");
		x = scan.nextInt();
		aux = 0;
		
		while (aux < numeros.length && numeros[aux] !=x) {
			aux++;
			
		}
		if (aux == numeros.length) {
			System.out.println("O valor não está no Vetor");
				
		}else {
			System.out.println("o valor está no vetor e está na posição do Vetor " +aux);
		}		
		System.exit(0);
	}
}