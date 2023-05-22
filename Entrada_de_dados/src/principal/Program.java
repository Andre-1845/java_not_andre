package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int idade;
		double precoDaCamisa;
		String nome;
		char sexo;
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
				
		System.out.println("Digite o preço: ");
		precoDaCamisa = leia.nextDouble();
			
		leia.close();
				
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Preço: " + precoDaCamisa);
	}

}
