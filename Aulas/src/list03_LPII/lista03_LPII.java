
package list03_LPII;

import java.util.Scanner;

public class lista03_LPII {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		final int TAM = 2;
		int [] codigo = new int[TAM];
		String [] descricao = new String[TAM];
		double [] preco = new double[TAM];

		char opcao;
		do {

			System.out.println("1 - Cadastrar Produtos.\n"
					+ "2 - Consultar Produtos com Preço acima de R$ 500,00.\n"
					+ "3 - Alterar Preços dos Produtos em 10%.\n"
					+ "4 - Sair");
			opcao = scan.next().charAt(0);
			switch (opcao) {
			case '1':
				preencherProdutos(codigo, descricao, preco);
				break;
			case '2':
				System.out.println("Produtos com Preços Acima de R$ 500,00:\n" + consultarProdutos(descricao, preco));
				break;
			case '3':
				System.out.println("Produtos Reajustados em 10%: \n" + alterarProdutos(codigo, descricao,preco));
				break;
			default:
				System.out.println("Opção Inválida. Tente novamente.");
			}

		}while (opcao !='4');
		System.exit(0);
	}
	static void preencherProdutos(int[] c, String[] d, double[] p) {

		for(int i = 0; i < c.length; i++) {
			System.out.println("Informe o código do Produto:");
			c[i] = scan.nextInt();

			System.out.println("Informe desrição do Produto:");
			d[i] = scan.next();

			System.out.println("Informe o valor do Produto:");
			p[i] = scan.nextDouble();
		}
	}

	static String consultarProdutos(String[]d, double[] p) {
		String relacao =" ";
		for(int i = 0; i < p.length; i++) {
			if(p[i]>500) {
				relacao += "Descrição: " + d[i] + "\n Valor: " + p[i]+"\n";
			}
		}
		return relacao;
	}
	static String alterarProdutos(int [] c,String [] d,double []p) {

		String reajuste = "";
		int i = 0;
		
		while(i < p.length ) {
			p[i] = p[i]+(p[i]*0.1);
			
			reajuste +="Descrição: " + d[i] + "\n Valor: " + p[i]+"\n";
			i++;
		}
		return reajuste;
	}
}