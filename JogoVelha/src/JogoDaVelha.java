import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		Campo[][] jogo = new Campo[3][3];
		char simboloAtual= 'X';
		boolean game = true;
		String vitoria = " ";
		
		Scanner scan = new Scanner(System.in);
		
		while(game) {
			desenhaJogo(jogo);
			vitoria = verificaVitoria(jogo);
			if(!vitoria.equals("")) {
				System.out.printf("Jogador %s Venceu.\n", vitoria);
				break;
			}
			
			try {
				
			} catch (Exception e) {
				System.out.println("Erro");
			}
			
			System.out.println("Erro");
		}
		
	}
	
	public static void desenhaJogo(Campo[][] velha) {
		limparTela();
		System.out.println(" 0    1    2");
		System.out.printf("0 %c | %c | %c\n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
		System.out.println(" -------------");
		System.out.printf("1 %c | %c | %c\n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
		System.out.println(" -------------");
		System.out.printf("2 %c | %c | %c\n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
		
	}
	
	public static void limparTela() {
		for(int cont=0;cont<200;cont++) {
			System.out.println(" ");
		}
	}
	
	public boolean verificaJogada(Campo[][] velha, int p[], char simbAtual) {
		
	}
	
	public static String verificaVitoria(Campo[][] velha) {
		return"";
	}
}
