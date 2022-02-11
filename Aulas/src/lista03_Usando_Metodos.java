import java.util.Scanner;

public class lista03_Usando_Metodos {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAM = 3;
		double [] preco = new double [TAM];
		int [] quantidade = new int [TAM];
		String [] nome = new String [TAM];

		char opcao;

		do {
			System.out.println("\n======================\n"
					+ "1. Cadastrar no vetor.\n"
					+ "2. Pesquisar no Vetor.\n"
					+ "3. Teste.\n"
					+ "4. Sair do Vetor."
					+ "\n======================");
			opcao = scan.next().charAt(0);
			switch (opcao) {	
			case '1':
				preencherVetor(nome, preco, quantidade);
				break;
			case '2':
				System.out.println(mostrarDados(nome, preco, quantidade));
				
				break;
			case '3':
				System.out.println(maiorPreco(nome));
				//System.out.println("");
				break;
			case '4':
				System.out.println("Fim do Programa.");
				break;
			default:
				System.out.println("Tente outra opção.\nOpção inválida.\n");
			}
		} while (opcao != '4');

	}
	static void preencherVetor(String []n, double [] p, int [] q) {
		for(int i = 0; i < n.length; i++) {
			System.out.println("Informe um nome: ");
			n[i] = scan.next();
			System.out.println("Informe preco (exemplo:19,88):");
			p[i] = scan.nextDouble();
			System.out.println("Informe a quantidade:");
			q[i] = scan.nextInt();
			//System.out.println(" " + n[i]);
		}
	}

	static String mostrarDados(String []n, double [] p, int [] q) {
		String a = "";
		System.out.println("Lista de Produtos Cadastrados no Vetor:");
		for (int i = 0; i < n.length; i++) {
			a += "\n"+ "nome: " +n[i]+" preço: "+ p[i]+" quantidade: "+q[i];
		}
		return a;
	}
	static String maiorPreco(String []n) {
		String ordenado = "";
		
		for (int i = 0; i < n.length; i++) {
			ordenado += "\n" +n[i];
		}
		return ordenado;
	}
	


}
