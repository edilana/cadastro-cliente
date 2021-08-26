package br.com.edilana.cadastrocliente.model;

public class Endereco {
	
	private String rua;	
	private String quadra;
	private int numero;
	private String bairro;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", quadra=" + quadra + ", numero=" + numero + ", bairro=" + bairro
				+ ", getRua()=" + getRua() + ", getQuadra()=" + getQuadra() + ", getNumero()=" + getNumero()
				+ ", getBairro()=" + getBairro() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
}
