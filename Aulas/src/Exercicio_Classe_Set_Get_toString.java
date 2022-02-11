import java.util.Scanner;

public class Exercicio_Classe_Set_Get_toString {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		final int TAM = 3;
		char [] sexo = new char [TAM];
		double [] altura = new double [TAM];
		byte [] idade = new byte [TAM];
		char opcao;
		
		do {
			System.out.println("\nEscolha uma opção:\n"
					+ "1. Cadastrar dados\n"
					+ "2. Mostrar dados\n"
					+ "3. Mostrar a quantidade de indivíduos do sexo feminino cuja idade"
					+ " esteja entre 20 a 45 anos e altura inferior a 1,70m\n"
					+ "4. Sair");
			opcao = scan.next().charAt(0);
			switch (opcao) {
			case '1':
				preencherDados(sexo,altura,idade);
				break;
			case '2':
				System.out.println(mostrarDados(sexo,altura,idade));
				break;
			case '3':
				System.out.println(mostrarQuantidade(sexo,altura,idade));
				break;
			case '4':
				System.out.println("fim do programa");
				break;
			default	:
				System.out.println("opção inválida.Tente novamente.");
			}	
		} while (opcao != '4');
		System.exit(0);
	}
	static void preencherDados(char [] s, double [] a, byte [] id) {
		for (int i = 0; i < s.length; i++) {
			System.out.println("Digite o Sexo: ");
			s[i] = scan.next().charAt(0);
			System.out.println("Digite a Altura: ");
			a[i] = scan.nextDouble();
			System.out.println("Digite o idade: ");
			id[i] = scan.nextByte();
		}
	}
	static String mostrarDados(char [] s, double [] a, byte [] id) {
		String resposta = "";
		for (int i = 0; i < s.length; i++) {
			resposta += s[i] + " " + a[i] + " " + id[i]+"\n";
		}
		return resposta;
	}
	static String mostrarQuantidade(char [] s, double [] a, byte [] id) {
		int contador=0;
		for (int i=0; i< s.length; i++) {
			if (s[i]=='f' && (id[i]>=20 && id[i]<=45) && a[i]<1.7) {
				contador++;
			}
		}
		if (contador == 0 ) {
			return "não tem ninguem com essas características.";
		}else {		
			return "tem "+ contador+ " com as características desejadas.";
		}
	}






}