
//public class Cliente {

//}
//package classes_objetvos;

public class Cliente {
	private int codigo;
	private String nome;
	
	public Cliente (int c, String n) {
		this.codigo = c;
		this.nome = n;
	}
	
	public Cliente () {
		this.codigo = 0;
		this.nome= "";
	}
	
	public Cliente(int c) {
		this.codigo = c;
		this.nome = "";
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCodigo(int novo) {
		this.codigo = novo;
	}
	
	public void setNome(String novo) {
		this.nome = novo;
	}
	
	public String toSTring() {
		return this.codigo+ " "+ this.nome;
	}

}
