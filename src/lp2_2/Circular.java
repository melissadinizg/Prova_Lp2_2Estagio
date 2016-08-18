package lp2_2;

/**
 * 
 */

/**
 * @author melissadg
 *
 */
public class Circular extends PratoPersonalizado {
	private int raio;
	
	public Circular(double preco, String tipo, int raio) throws Exception {
		super(preco, tipo);
		this.raio = raio;
	}

}
