package trabalho_C3;

public class Clientes {
	private int cod_cli;
	private String nome;
	private String end;
	private String tel;
		
	public Clientes (int c, String n,String e, String t) {
		this.cod_cli = c;
		this.nome = n;
		this.end = e;
		this.tel = t;
	}
	
	//String texto = Integer.toString(cod_cli)
	//Integer.parseInt()

	public int getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(int cod_cli) {
		this.cod_cli = cod_cli;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return this.cod_cli + "\t" + this.nome +"\t" + this.end + "\t" + this.tel + "\n";
		//return this.nome +"\t" + this.end + "\t" + this.tel + "\n";
	}
	
}
