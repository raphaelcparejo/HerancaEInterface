package br.com.bank.model;

public class ClientModel implements Autenticavel {	

	private AutenticavelImpl autenticavel;
	
	public ClientModel() {
		this.autenticavel = new AutenticavelImpl();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticavel.setSenha(senha); 
	}

	@Override
	public void autenticarSenha(int senha) {
		// TODO Auto-generated method stub
		
	}
}
