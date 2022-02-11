// Vetor - Exercicios 05 
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class ListaAtividade02_6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		final int tam = 3;
		char letras[]= new char [tam];
		boolean achou = false;
		int count = 0;
		
		for(int i=0; i < tam; i++) {
			System.out.println("Informe uma letra");
			letras[i] = ler.next().charAt(0); 
		}
		
		for (int i=0; i < tam; i++) {
			//System.out.println(" todas as letras "+letras[j]);
			if (letras[i]=='a') {
				count++;
				achou = true;
			}
		}	

		
		if (achou==false){ //ou if(!achou){
			System.out.println("a letra 'a' não foi encontrado no vetor.");
		}else{
			System.out.println("foram encontrados "+count+" letras 'a' no vetor.");
		}
		
		
		//System.out.println("Não foi localizado nenhuma letra 'a' no Vetor.");
							
		//System.out.println("\nTotal de Letras 'a' foram: "+j);
		//System.out.println("achou a letra:"+letras[j]);
		
			// }fim do programa.}	
	}
}