import java.util.Scanner;

public abstract class testeIf2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// Entrar no Programa ou sai dele
		int entrar = 1;
		@SuppressWarnings("unused")
		int sair =0;
		System.out.println("Deseja ENTRAR no Programa?\n\nInforme uma opção:\n1 - Entrar.\n2 - Sair ou qualquer outro número para sair do Programa.\n");
		entrar = scan.nextInt();
		if(entrar == 1){
		//até aqui faz a logica e entrar ou sair do programa.
		
		@SuppressWarnings("unused")
		boolean a = false; 
		// Produtos com preços diferentes
		// < 10  Pode comprar.
		// > 10 && < 15 Pedi um desconto
		// > 15 && < 20 Preço ta caro
		// > 20 vá embora
		
		//System.out.println("Deseja continuar");
			//boolean a = scan.nextBoolean();
		//if (a == true) {
			System.out.print("\nEntre com o preço do produto:");		
			double valor = scan.nextDouble();
				
		//}
		if(valor <= 10) {
			System.out.println("Pode comprar.\n");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pode pedir desconto.\n");
		} else if (valor >= 15 && valor <= 20) {
			System.out.println("Preço ta caro.\n");
		} else if (valor > 20) {
			System.out.println("Vá embora rápido.\n");
		}
		
	
			
		}
		// Verifica se você apertou 1 ou outro numero qualquer.
		if(entrar != 1) {
		System.out.println("\nVocê saiu do Programa.");
		} else {
			System.out.println("\nFim do programa.");
		}
	}

}
