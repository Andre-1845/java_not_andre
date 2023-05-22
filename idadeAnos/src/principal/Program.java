package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anoNascimento;
		int anoAtual;
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o ano de nascimento : ");
		anoNascimento = leia.nextInt();
		System.out.println("Digite o ano atual ;");
		anoAtual = leia.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		System.out.println("A idade é : " + idade);
		
		leia.close();
		
		

	}

}
