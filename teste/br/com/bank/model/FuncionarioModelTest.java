package br.com.bank.model;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FuncionarioModelTest {
	
	@Test
	public void FuncionarioModelDeveRetornarBonificacaoEsperada() {	
		
		//Arrange
		double salario =100;
		double resulatdoEsperado= salario *0.1;
		FuncionarioModel nomeGenerico = new GenrenteModel("coelho", "33366677777", salario);
		
		//Act
		double resultado = nomeGenerico.getBonificacao();
		
		//Assert		
		assertTrue(resulatdoEsperado==resultado);
	}
}
