package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1, n2, n3, n4, media;
		String aluno;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome do aluno :");
		aluno = leia.nextLine();
		
		System.out.println("Qual a nota do 1° bimestre ? ");
		n1 = leia.nextDouble();
		
		System.out.println("Qual a nota do 2° bimestre ? ");
		n2 = leia.nextDouble();
		
		System.out.println("Qual a nota do 3° bimestre ? ");
		n3 = leia.nextDouble();
		
		System.out.println("Qual a nota do 4° bimestre ? ");
		n4 = leia.nextDouble();
		
		leia.close();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("A média do aluno " + aluno + " é : " + media);

	}

}
