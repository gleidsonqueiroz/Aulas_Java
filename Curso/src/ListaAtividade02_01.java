// Vetor - Exercicios 01 

import java.util.Scanner;

public class ListaAtividade02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int TAM = 3;
		int [] a;
		a = new int [TAM];
		int soma = 0;
		
		//ENTRADA DE DADOS
		for (int i=0; i < TAM; i++) {
			System.out.println("informe um numero:");
			a [i]= ler.nextInt();
		}
		
		//PROCESSAMENTO DE DADOS
		for (int i=0; i < TAM; i++) {
			soma += a [i];
		}
		//SAIDA DE DADOS
		System.out.println("o somatario é :"+soma);

	}
}