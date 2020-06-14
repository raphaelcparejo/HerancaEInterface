package br.com.bank.model;

import java.util.Date;

public abstract class ContaModel {
	
	private double saldo;
	
	private int agencia;
	
	private int conta;	

	
	private Date dataCriacaoConta;
	
	public Date getDataCriacaoConta() {
		return dataCriacaoConta;
	}

	public void setDataCriacaoConta(Date dataCriacaoConta) {
		this.dataCriacaoConta = dataCriacaoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public ContaModel(double saldo, int agencia, int conta, Date dataCriacaoConta) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
		this.conta = conta;	
		this.dataCriacaoConta = dataCriacaoConta;
	}
	public boolean saca(double valor) {
		return false;	
	}	
}
