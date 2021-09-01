package br.com.edilana.cadastrocliente.model;

import java.util.Date;

public class Cliente {

	private String nome;
	private String sexo;
	private int idade;
	private Date dataNascimento;
	private Endereco endereco;
	private DadosProfissionais dadosProfissionais;
	
	/** 
	 * Retorna o nome
	 * @return String
	 * @author edilana
	 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
	public DadosProfissionais getDadosProfissionais() {
		return dadosProfissionais;
	}
	public void setDadosProfissionais(DadosProfissionais dadosProfissionais) {
		this.dadosProfissionais = dadosProfissionais;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", endereco=" + endereco + ", dadosProfissionais=" + dadosProfissionais + ", getNome()=" + getNome()
				+ ", getSexo()=" + getSexo() + ", getIdade()=" + getIdade() + ", getDataNascimento()="
				+ getDataNascimento() + ", getEndereco()=" + getEndereco() + ", getDadosProfissionais()="
				+ getDadosProfissionais() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}	
	
}
