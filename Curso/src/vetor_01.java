import java.util.Scanner;

public class vetor_01 {

	public static void main(String[] args) {
		final int TAM = 3;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] sexo = new String [TAM];
		double[] altura = new double [TAM];
		int j =0;
		int k =0;
		int t =0;
		//-----------------------------------------------------		 
		for(int i=0; i < TAM; i++) {
			System.out.println("Digite o sexo e informe a altura");
			sexo[i] = scan.next();
			altura[i] = scan.nextDouble();
		}
		//-----------------------------------------------------
		for(int count=0; count < TAM; count++) {
			if(sexo[count].equals("masculino") || sexo[count].equals("Masculino") || sexo[count].equals("m") || sexo[count].equals("M") || sexo[count].equals("MASCULINO")) {
				j = j + 1; 
			}else if(sexo[count].equals("feminino") || sexo[count].equals("Feminino") || sexo[count].equals("f") || sexo[count].equals("F") || sexo[count].equals("FEMININO")) {
				k = k + 1;
				if((altura[count] <= 1.6)) {
					t = t + 1;
				}
			}
		}
		System.out.println("\nA) A quantidade de individuos do sexo masculino, foram: "+ j +".");
		System.out.println("\nB) A quantidade de individuos do sexo feminino, foram: "+ k +" e altura menor e igual que 1,6m foram: "+ t);
	}

}