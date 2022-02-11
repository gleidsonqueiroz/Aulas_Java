// Vetor - Exercicios 03 - REFAZENDO !!!!FALTA TERMINAR !!

import java.util.Scanner;

public class ListaAtividade02_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		final int tam = 5;
		int j = 0;
		int m = 0;
		int vetor [] = new int [tam];	

		// Entrada de Dados
		for(int i=0; i < tam; i++) {
			System.out.println("Informe o numero:");
			vetor [i] = ler.nextInt();
		}
		System.out.println("informe o numero para pesquisar:");
		m = ler.nextInt();
		while((j < tam)&&(vetor[j]!=m)) {
			j++ ;
		}
		//	System.out.println("o vetor na posição "+vetor[j]);// ERRO SE ESTIVER NESSA LINHA !!!!
		if(j==tam) {
			System.out.println("Chegou no fim do vetor e não foi localizado.");
		} else {
			System.out.println("Foi localizado o vetor na Posição: "+ vetor[j]);
		}

		// }fim do programa.}	
	}
}