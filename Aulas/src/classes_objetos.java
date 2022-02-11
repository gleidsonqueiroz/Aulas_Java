
public class classes_objetos {

	public static void main(String[] args) {
		Cliente cli = new Cliente(123,"fulano");
		System.out.println("nome:"+cli.getNome());
		System.out.println("\n");	
		System.out.println("dado cadastrado:"+cli.toSTring());
		System.out.println("\n");	
		cli.setCodigo(345);
		
		System.out.println("dado cadastrado:"+cli.toSTring());

		//Cliente cli2 = new Cliente(111,"ANA");
		//System.out.println("dado cadastrado 2:"+cli2.toSTring());

	
	
	}

}
