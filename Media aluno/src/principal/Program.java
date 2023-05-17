package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.print("Digite a nota 1 ");
			nota1 = leia.nextDouble();
			if (nota1 < 0) {
				nota1 = 11;
			}
			
		}while (nota1 >10);
		
		do {
			System.out.print("Digite a nota 2 ");
			nota2 = leia.nextDouble();
			if (nota2 < 0) {
				nota2 = 11;
			}
			
		}while (nota2 >10);
		
		do {
			System.out.print("Digite a nota 3 ");
			nota3 = leia.nextDouble();
			if (nota3 < 0) {
				nota3 = 11;
			}
			
		}while (nota3 >10);
		
		do {
			System.out.print("Digite a nota 4 ");
			nota4 = leia.nextDouble();
			if (nota4 < 0) {
				nota4 = 11;
			}
			
		}while (nota4 >10);
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Média : %.2f", media);
		System.out.println(" ");
		
		if (media == 10) {
			System.out.println("Aluno aprovado com honras");
		}
		else {
			if (media > 7) {
				System.out.println("Aluno aprovado");
			}
			else {
				if (media >=6) {
					System.out.println("Aluno em recuperação");
				}
				else {
					System.out.println("ALUNO REPROVADO !!");
				}
			}
		}
		
	
	}

}
