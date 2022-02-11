// Maior numero

import java.util.Scanner;

public class vetor_3_menorNumero {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		final int TAM = 3;
		Scanner scan = new Scanner(System.in);
		int [] num = new int[TAM];
		int menor = 0;	
		int posicao = 0;
		//Entrada de Dados
		for (int i=0; i < TAM; i++){
			System.out.println("informe um numero: ");
			num [i] = scan.nextInt();

			if(num[i] < menor || i == 0) { // verifica o menor valor do vetor
				menor = num[i];
				posicao = i;
			}
		}
		System.out.print("o Menor Número é: "+ menor);
		System.out.print(" e posição do Vetor é num["+posicao+"].");
	}

}