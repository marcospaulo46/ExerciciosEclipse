package br.com.generation.aula08;

public class Loja {
	private String nomeProd;
	private String marcaProd;
	private double valorProd;
	

	public Loja(String nomeProd, String marcaProd, double valorProd) {
		super();
		this.nomeProd = nomeProd;
		this.marcaProd = marcaProd;
		this.valorProd = valorProd;
		
	}

	

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public String getMarcaProd() {
		return marcaProd;
	}

	public void setMarcaProd(String marcaProd) {
		this.marcaProd = marcaProd;
	}

	public double getValorProd() {
		return valorProd;
	}

	public void setValorProd(double valorProd) {
		this.valorProd = valorProd;
	}

	public String toString() {
		return "[Nome do produto: " + this.nomeProd +" "+ this.marcaProd+ " - Valor: R$" + this.valorProd + "]";
	}
}
