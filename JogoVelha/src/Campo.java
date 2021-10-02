
public class Campo {
	private char simb;
	public Campo() {
		this.simb = ' ';
	}
	
	public char getSimbolo() {
		return this.simb;
	}
	
	public void setSimbolo(char simbolo) {
		if(this.simb == ' ') {
			this.simb = simbolo;
		}else {
			System.out.printf("Jogada não permitida, o %c esta neste campo.", simb);
		}
	}
}
