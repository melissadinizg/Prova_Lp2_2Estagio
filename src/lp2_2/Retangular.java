package lp2_2;

/**
 * 
 */

/**
 * @author melissadg
 *
 */
public class Retangular extends PratoPersonalizado{
	private int base, altura;

	public Retangular(double preco, String tipo, int base, int altura) throws Exception {
		super(preco, tipo);
		this.altura = altura;
		this.base = base;
	}

}
