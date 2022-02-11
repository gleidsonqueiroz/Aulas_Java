package trabalho_C3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;

public class TelaPrincipal {

	static StringBuffer memoria = new StringBuffer();
	static StringBuffer memoria2 = new StringBuffer();

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException{

		char opcao;
		do {
			opcao = menu();
			switch(opcao) {
			case '1':
				incluirDados();
				break;
			case '2':
				mostrarDados();
				break;
			case '3':
				iniciarDados();
				break;
			case '4':
				//outrosDados();
				break;
			case '5':
				System.out.println("Fim do Programa.");
				break;
			default:
				System.out.println("Opção Inválida. Tente novamente.");
				break;				
			}
		}while(opcao !='5');
	}

	private static char menu() {
		System.out.println("Menu Principal\n" +
				"1 - Incluir Cliente\n" +
				"2 - Mostrar Dados\n" +
				"3 - Excluir Cliente - NÃO ESTA ATIVO\n" +
				"4 - Alterar dados por pessoa - NÃO ESTA ATIVO\n"+
				"5 - Sair");
		return scan.next().charAt(0);
	}

	private static void incluirDados() {

		int cod_cli;
		String nome, end, tel;

		try {
			BufferedWriter saida;
			saida = new BufferedWriter (new FileWriter ("DadosClientes.txt", true));
			//PrintWriter saida = new PrintWriter (new BufferedWriter (new FileWriter ("DadosClientes.txt", true)));
			System.out.println("Digite Código para o Cliente:");
			cod_cli = scan.nextInt();
			System.out.println("Digite Nome:");
			nome = scan.next();
			System.out.println("Digite o Endereço:");
			end = scan.next();
			System.out.println("Digite telefone:");
			tel = scan.next();

			Clientes cli = new Clientes(cod_cli, nome, end, tel);
			saida.write (cli.toString());
			saida.flush();
			saida.close();			
			System.out.println("Operação realizada com sucesso.");
		}catch (Exception e){
			System.out.println("Erro de gravação.");
		}
	}
	private static void mostrarDados() {

		iniciarDados(); // Função para iniciar arquivo

		String msg = "\nDadosClientes:\n";
		//msg += memoria.toString();  // Tirar o Comentario e Comentar o If ABAIXO! 

		if (memoria.length() != 0) { ///*    INICIO
			String[] linhas = memoria.toString().split("\n");

			for (String linha : linhas) {
				//for (int i = 0; i < linhas.length; i++) { //USO - pode usar esse 
				//String linha = linhas[i];				// e esse
				String[] atributos = linha.split("\t");

				int cod_cli = Integer.parseInt(atributos[0]);
				String nome = atributos[1];
				String end = atributos[2];
				String tel = atributos[3];

				Clientes cli = new Clientes(cod_cli,nome, end,tel);
				msg += cli.toString();
			} // */  
			System.out.println(msg);
		}else {
			System.out.println("Arquivo vazio.");
		}

	}

	static void iniciarDados(){
		String linha;
		try{
			BufferedReader arqEntrada;
			arqEntrada = new BufferedReader (new FileReader ("DadosClientes.txt"));
			linha = "";
			memoria.delete(0,memoria.length());
			while ( (linha = arqEntrada.readLine()) != null ) {
				memoria.append (linha + "\n");
			}
			arqEntrada.close();
		} catch (FileNotFoundException erro){
			System.out.println("Arquivo nao encontrado");
		} catch (Exception e){
			System.out.println("Erro de Leitura !");
		}
	}
	public static String ler (int primeiro, int ultimo){
		String dados = "";
		dados = memoria.substring(primeiro, ultimo);
		return dados;
	}

	public static void gravar (){
		try{
			BufferedWriter arqSaida;
			arqSaida = new BufferedWriter (new FileWriter ("DadosClientes.txt"));
			arqSaida.write (memoria.toString ());
			arqSaida.flush ();
			arqSaida.close ();
		} catch (Exception erro){
			System.out.println("Erro de gravacao!");
		}

	}
}