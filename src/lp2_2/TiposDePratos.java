package lp2_2;

public enum TiposDePratos {
	
	ESTAMPADO("Estampado"), FOTO("Foto"), FEITO_MAO("Pintura");
	private String tipo;
	
	TiposDePratos(String tipo){
		this.tipo = tipo;
	}
	
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
