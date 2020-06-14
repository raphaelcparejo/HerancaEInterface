package br.com.bank.model;

public abstract class FuncionarioModel {
	
	private String Nome;
	private String cpf;
	private double salario;
	
	public double getBonificacao() {
		return this.salario *0.1;		
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public FuncionarioModel(String nome, String cpf, double salario) {
		super();
		Nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
}
