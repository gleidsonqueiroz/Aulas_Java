// Vetor - Exercicios 03
import java.util.Scanner;

public class ListaAtividade02_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int entrar = 1;
		@SuppressWarnings("unused")
		int sair =0;
		System.out.println("Deseja entrar no programa ?"
				+ "\nInforme uma opção:"
				+ "\n1 - Entrar."
				+ "\n2 ou qualquer outro número - Sair do Programa.");
		entrar = ler.nextInt();
		if(entrar == 1){
		//Scanner ler = new Scanner(System.in);
		//declarar constante
		final int tam = 5;  
		//declarar e instanciar vetor
		int [] vet = new int [tam];
		int m,j=0;
		int p = 0;
		//preencher o vetor com dados
		System.out.println("=== Entrando no Programa ==="); 
		for (int i=0;i<tam;i++){
			System.out.println("Digite um número: (Posição "+p+" do vetor)");
			vet[i] = ler.nextInt();
			p = p +1;
		}
		//processamento
		System.out.println("Digite o número a ser pesquisado:");
		m = ler.nextInt();
		while ((j<tam)&&(vet[j]!=m)){
			j++;
		}
		//saída de dados
		if (j==tam){
			System.out.println("o valor "+m+" não foi encontrado");
		}else{
			System.out.println("o valor "+m+" está na posição "+j);
		}
		
		}
		System.out.println("Saindo do programa.");
	}
}