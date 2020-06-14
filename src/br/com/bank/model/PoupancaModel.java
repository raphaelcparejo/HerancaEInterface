package br.com.bank.model;

import java.util.Date;

public class PoupancaModel extends ContaModel {

	public PoupancaModel(double saldo, int agencia, int conta, Date dataCriacaoConta) {
		super(saldo, agencia, conta, dataCriacaoConta);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		return super.saca(valor);
	}
}
