package br.com.bank.model;

public class AutenticavelImpl implements Autenticavel  {
	
	//composi��o para evitar repeti��o de c�digo
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public void autenticarSenha(int senha) {
		// TODO Auto-generated method stub
		
	}
}
