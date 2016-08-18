package lp2_2;

import testeExcecao.*;

/**
 * @author melissadg
 *
 */
public class PratoPersonalizado {
	private double precoBase;
	private String tipo;
	private excecaoPrato teste;
	
	public PratoPersonalizado(double preco, String tipo)throws Exception {
		teste.testaPreco(preco);
		teste.testaTipo(tipo);
		
		this.precoBase = preco;
		this.tipo = tipo;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	@Override
	public String toString() {
		return "Prato com "+ this.tipo + " custa R$ " + this.getPrecoBase() + ".";
	}
	
	
	
}
