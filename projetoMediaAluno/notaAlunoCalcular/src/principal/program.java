package principal;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner professorDigita = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		
		String nomeAluno = professorDigita.nextLine();
		System.out.println("Digite a primeira nota: ");
		double nota1 = professorDigita.nextDouble();
		System.out.println("\nDigite a segunda nota: ");
		double nota2 = professorDigita.nextDouble();
		System.out.println("\nDigite terceira nota: ");
		double nota3 = professorDigita.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("\nO aluno teve bom comportamento? ");
		boolean comportamentoAluno = professorDigita.nextBoolean();
		
		System.out.printf("Nome do aluno: %s\nnota1: %.2f\nnota2: %.2f\n\nnota3: %.2f\nteve bom comportamento? %b\n", nomeAluno, nota1, nota2, nota3, comportamentoAluno);
		if(comportamentoAluno == !false && media >= 6) {
			System.out.println("\nParabens, Voce foi premiado como melhor aluno !!!");
		}else {
			System.out.println("\nNossa, você deve melhorar melhor a sua conduta na aula hein!!!");
		}
		professorDigita.close();
	}
	

	
}
