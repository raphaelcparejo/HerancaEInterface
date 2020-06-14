package br.com.bank.model;

public abstract interface Autenticavel {
	
	public void setSenha(int senha);
	public void autenticarSenha(int senha);

}
