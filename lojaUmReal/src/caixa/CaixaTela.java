package caixa;


import estoque.Produto;

public class CaixaTela {
	 public static void main(String[] args) {
		Produto p = new Produto("Tv", "Eletro-domestico", 2400.00, 0.2);
		
		System.out.println("======== Loja Um Real ========");
		System.out.printf("Produto: %s", p.nomeProduto);
		System.out.printf("\nCategoria: %s", p.categoriaProduto);
		System.out.println("\nCodigo de Barras: " + p.gerarCodigoBarras());
		System.out.printf("\nValor: R$ %.2f", p.valorProduto);
		System.out.printf("\nDesconto: %.2f", p.desconto);
		System.out.printf("\nTotal: R$ %.2f", p.calcularDesconto(p.desconto));
	}
}
