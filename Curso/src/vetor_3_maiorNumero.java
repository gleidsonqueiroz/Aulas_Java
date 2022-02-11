// Maior numero

import java.util.Scanner;

public class vetor_3_maiorNumero {

	public static void main(String[] args) {
		final int TAM = 3;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int [] num = new int[TAM];
		int maior = 0;	

		//Entrada de Dados
		for (int i=0; i < TAM; i++){
			System.out.println("informe um numero: ");
			num [i] = scan.nextInt();

			if(num[i] > maior || i == 0) {
				maior = num[i];
			}
		}
		System.out.println("O Maior Número é: "+ maior);
	}

}