package estoque;


public class Produto {
	public String nomeProduto;
	public String categoriaProduto;
	public double valorProduto;
	public double desconto;
	
	public double calcularDesconto(double novoDesconto) {
		desconto = novoDesconto;
		return  valorProduto * (1 - desconto);
	}
	
	public Produto(){
		nomeProduto = "Default";
		categoriaProduto = "Default";
		valorProduto = 0.0;
	}
	
	public Produto(String nomeNovo, String categoriaNovo, double valorNovo, double novoDesconto) {
		nomeProduto = nomeNovo;
		categoriaProduto = categoriaNovo;
		valorProduto = valorNovo;
		desconto = novoDesconto;
	}
	
}
