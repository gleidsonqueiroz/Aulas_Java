package Aulas_lpoo;

public class Vendedor {
	
	private String nome;
	private float salarioBase;
	private int tempoServico;
	private String categoria;
	private float totalVendas;
	
	public Vendedor(String nome, float salarioBase, int tempoServico, String categoria, float totalVendas) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.tempoServico = tempoServico;
		this.categoria = categoria;
		this.totalVendas = totalVendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(float totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", salarioBase=" + salarioBase + ", tempoServico=" + tempoServico
				+ ", categoria=" + categoria + ", totalVendas=" + totalVendas + "]";
	}
	
}
