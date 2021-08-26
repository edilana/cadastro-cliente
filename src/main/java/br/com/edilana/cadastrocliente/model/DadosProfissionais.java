package br.com.edilana.cadastrocliente.model;

public class DadosProfissionais {

	private String cargo;
	private String empresa;
	private int tempoempresa;
	private double salario;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getTempoempresa() {
		return tempoempresa;
	}
	public void setTempoempresa(int tempoempresa) {
		this.tempoempresa = tempoempresa;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "DadosProfissionais [cargo=" + cargo + ", empresa=" + empresa + ", tempoempresa=" + tempoempresa
				+ ", salario=" + salario + ", getCargo()=" + getCargo() + ", getEmpresa()=" + getEmpresa()
				+ ", getTempoempresa()=" + getTempoempresa() + ", getSalario()=" + getSalario() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
		
}
