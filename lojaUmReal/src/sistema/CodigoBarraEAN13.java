package sistema;

import java.util.Random;
import java.util.Scanner;

public class CodigoBarraEAN13 extends CodigoBarra{
	protected CodigoBarraEAN13(String codigoBarra) {
		super(codigoBarra);
	}

	@Override
	protected boolean validar(String codigoBarra) {
			if(!codigoBarra.matches("^[0-9] {13}$")) {
				return false;
			}
			int [] numeros = codigoBarra.chars().map(Character::getNumericValue).toArray();
			int somaPares = numeros[1] + numeros[3] + numeros[5] + numeros[7]+ numeros[9]+numeros[11];
			int somaImpares = numeros[0] + numeros[2] + numeros[4] + numeros[6] + numeros[8] + numeros[10];
			int resultado = somaImpares + somaPares * 3;
			int digVerificador = 10 - resultado % 10;
			return digVerificador == numeros[12];
		
	}
	
	public static int gerarCodigoBarras() {
		 Random gerar = new Random();
			for(int i = 0; i < 20; i++) {
				
			}
		
		return gerar.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Digite o codigo de barras: ");
		String codigo = user.next();
		user.close();
		
//		String codigo = Integer.toString(gerarCodigoBarras());
		
		CodigoBarra codBarra1 = new CodigoBarraEAN13(codigo);
		System.out.println("Numero codigo de barras: "+ codBarra1.getCodigoBarra());
		System.out.println("Codigo Barras é " + (codBarra1.valido() ? "Válido" : "Invalido"));
	}
}
