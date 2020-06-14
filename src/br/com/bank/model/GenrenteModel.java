package br.com.bank.model;

public class GenrenteModel extends FuncionarioModel{

	public GenrenteModel(String nome, String cpf, double salario) {
		super(nome, cpf, salario);		
	}
	
	//reescrita que aponta pra classe pai(super)
	//serve para parametros e metodos
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();		
	}
}
