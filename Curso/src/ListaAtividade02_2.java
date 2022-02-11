// Vetor - Exercicios 02
import java.util.Scanner;

public class ListaAtividade02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int TAM = 5;
		int [] a;
		a = new int [TAM];
		@SuppressWarnings("unused")
		int soma = 0;
		
		//ENTRADA DE DADOS
		for (int i=0; i < TAM; i++) {
			System.out.println("informe o "+(i+1)+"º numero:");
			a [i]= ler.nextInt();
		}
		
		//PROCESSAMENTO DE DADOS
		System.out.print("Ordem Contrátia dos Números:");
		for (int i=TAM-1; i >= 0; i--) {
			System.out.print(" "+ a[i]);
		}
		System.out.print("\nOrdem Natural dos Números:");
		for (int i=0; i < TAM; i++) {
			System.out.print(" "+ a[i]);	
		}
		
	}
}