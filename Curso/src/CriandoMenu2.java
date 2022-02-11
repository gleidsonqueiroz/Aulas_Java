// Criando Menu

import java.util.Scanner;

public class CriandoMenu2 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource", "unused" })
		//Scanner ler = new Scanner(System.in);
		//char opcao;
		
		Scanner sele = new Scanner (System.in);
        boolean escolhido = true;
        int opcao;
        do
        {
            //SELEÇÃO DOS MÓDULOS
            System.out.println("\nESCOLHA UM SETOR DESEJADO:\n\n"+
            				"1 - Financeiro\n"+
            				"2 - Contas\n"+
            				"3 - RH\n"+
            				"4 - DO\n"+
            				"5 - TI\n"+
            				"6 - Sair.\n");
            opcao = sele.nextInt();
            if (opcao == 6)
            {
                System.out.println("Saindo do programa.");
                break;
            }
        }while(opcao !='6');//FIM DO
     // TODO code application logic here

		
			


	}
}