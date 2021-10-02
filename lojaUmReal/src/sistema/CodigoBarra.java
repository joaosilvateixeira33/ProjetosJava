package sistema;

public abstract class CodigoBarra {
	protected final String codigoBarra;
	private final boolean valido;
	
	protected  CodigoBarra(String codigoBarra) {
		if(codigoBarra == null) throw new IllegalArgumentException("O campo de codigo de barras não pode ser vazio");
		this.codigoBarra = codigoBarra;
		this.valido = validar(codigoBarra);
	}
	
	public String getCodigoBarra() {
		return codigoBarra;
	}
	
	public boolean valido() {
		return valido;
	}
	
	protected abstract boolean validar(String codigoBarra);

}
