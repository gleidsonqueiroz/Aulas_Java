// Criando Menu

import java.util.Scanner;

public class CriandoMenu {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		char opcao;
		final int TAM = 5;
		int vetor[] = new int[TAM];
		
		@SuppressWarnings("unused")
		boolean preenchido = false;
		
		do {
			System.out.println("Escolha uma opcao:\n"
					+ "\n1 - Preencher Vetor."
					+ "\n2 - Consultar Dados do Vetor."
					+ "\n3 - Somar Vetor"
					+ "\n4 - Maior valor no Vetor."
					+ "\n5 - Menor valor no Vetor."
					+ "\n6 - Posição do Vetor"
					+ "\n7 - Pesquisar valor no Vetor."
					+ "\n8 - Sair");
			opcao = ler.next().charAt(0);
			System.out.println("");
			switch (opcao){
			case '1':
				//System.out.println("Entrou na OPCAO 1.\n");
				preencherVetor(vetor);
				preenchido = true;
				break;
			case '2':
				if (preenchido) {
					System.out.println("===============================");
					System.out.println("= Contéudo do Vetor: "+ mostrarVetor(vetor));
					System.out.println("===============================");
				}else {
					System.out.println("Contéudo do Vetor NÃO Cadastrados.");
				}
				break;
			case '3':
				if (preenchido) {
					System.out.println("======================");
					System.out.println("= A Soma do Vetor: " + somarVetor(vetor)+" ");
					System.out.println("======================\n");
				}else{
					System.out.println("Soma do vetor NÃO Cadastrados.");
				}
				break;
			case '4':
				if (preenchido) {
					System.out.println("===========================");
					System.out.println("= Maior valor do Vetor: "+ maiorValor(vetor)+" ");
					System.out.println("===========================\n");
				}else {
					System.out.println("Maior valor NÃO Cadastrados.");
				}
				break;
			case '5':
				if (preenchido) {
					System.out.println("===========================");
					System.out.println("= Menor valor do Vetor: "+ menorValor(vetor)+" ");
					System.out.println("===========================\n");
				}else {
					System.out.println("Menor Valor NÃO Cadastrados.");
				}
				break;				
			case '6':
				if (preenchido) {
					System.out.println("======================================");
					System.out.println("= O Total de Posiçao do Vetor [ "+ tamanhoVetor(vetor)+" ] ");
					System.out.println("=====================================\n");
				}else {
					System.out.println("Posição do Vetor NÃO encontrada.");
				}
				break;
				
			case '7':
				if (preenchido) {
					System.out.println("======================================");
					System.out.println("= Posiçao do valor no Vetor [ "+ posicaoVetor(vetor)+" ] ");
					System.out.println("=====================================\n");
				}else {
					System.out.println("Valor NÃO encontrada no Vetor.");
				}
				break;
				
			case '8':
				System.out.println("Fim do Programa.");				
				break;
			default:
				System.out.println("Opção não localizada\n.Tente Novamente.");
			}
		} while (opcao != '8');
		
	// --------------------------------- FUNÇÕES E PROCEDIMENTOS -----------------------------------
		
	} // Fim do Metódo MAIN - PRINCIPAL
	
	//Procedimento - não retorna NADA. SÓ PREENCHER DADOS
	static void preencherVetor(int [] v) {
		for(int i=0; i < v.length; i++) {
			System.out.println("Digite um numero:");
			v[i] = ler.nextInt();
		}
		System.out.println("=======================");
		System.out.println("= Dados Cadastrados! =");
		System.out.println("=======================\n");
	}
	
	// FUNÇÃO - Retonar um ou mais VALORES - RUTURN.
	static int somarVetor(int v[]) {
		int soma=0;
		for(int i=0; i < v.length; i++) {
			soma += v[i];
		}
		return soma;
	}
	//Função Mostra Valores do Vetor
	static String mostrarVetor(int v[]) {
		String resposta="";
		for(int i=0; i< v.length; i++) {
			resposta += v[i] + " ";
		}
		return resposta;
	}
	//funcao maior valor
	static int maiorValor(int v[]) {
		int maior = 0;	

		for(int i=0; i < v.length; i++) {
			if(v[i] > maior || i == 0) {
				maior = v[i];
			}
		}
		return maior;	
	}
	
	//funcao menor valor
		static int menorValor(int v[]) {
			int menor = 0;	
			for(int i=0; i < v.length; i++) {
				if(v[i] < menor || i == 0) {
					menor = v[i];
				}
			}
			return menor;	
		}
		
		static int tamanhoVetor(int v[]) {
			int count=0;
			@SuppressWarnings("unused")
			boolean achou = false;
			for (int i=0; i < v.length; i++) {
				if (v[i]== v[i]) {
					count++;
					achou = true;

				}
			}	
			return count;
		}
		
		static int posicaoVetor(int v[]) {
			int pesq =0;
			int j=0;
			//processamento
			System.out.println("Digite o número a ser pesquisado:");
			// ira mostrar os numeros do vetor - para ter opcoes
			@SuppressWarnings("unused")
			String resposta="";
			for(int i=0; i< v.length; i++) {
				resposta += v[i] + " ";

			}
			System.out.println("Opções de Valores: "+ resposta);
			pesq = ler.nextInt();
			while ((j < v.length)&&(v[j] != pesq)){
				j++;
			}
			//saída de dados
		//	if (j == pesq){
			//	System.out.println("o valor "+ pesq +" não foi encontrado");
			//}else{
			//	System.out.println("o valor "+ pesq +" está na posição "+j);
		//	}
			return j;
		}
		
		
		
		
}// fim da Class