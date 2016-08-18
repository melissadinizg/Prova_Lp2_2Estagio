package testeExcecao;

import lp2_2.TiposDePratos;

public class excecaoPrato {

	public void testaPreco(double preco)throws Exception{
		if (preco < 0) {
			throw new Exception("Preco do prato nao pode ser negativo.");
		}
	}
	
	public void testaTipo(String tipo)throws Exception{
		if (tipo != "Estampa" || tipo != "Foto" || tipo != "Pintura") {
			throw new Exception("Tipo do prato nao existe.");
		}
	}
	
	
	
	
	
}
