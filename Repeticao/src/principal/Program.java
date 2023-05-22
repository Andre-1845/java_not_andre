package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// estrutura FOR - para repeti��es que s�o definidas (sabemos quantas vezes vai haver a repeti��o)
		
		for (int i =0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n ********");
		
		// estrutura WHILE - quando n�o se sabe a quantidade de repeti��es
		
		int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Continua ? ");
		char opcao = sc.next().charAt(0);
		int j = 0;
		while (opcao == 's') {
			j++;
			System.out.print("Continua ? ");
			opcao = sc.next().charAt(0);
		}
		System.out.print(" Entrou no while : " + j);
		System.out.println("\ns*******----*******");
		
			
		// DO WHILE - executa o bloco de c�digo ao menos uma vez...
		int k = 0;
		do {
			System.out.print("Continua ? ");
			opcao = sc.next().charAt(0);
			k++;
		}while(opcao == 's');
		System.out.println("Entrou : " + k);
		
		sc.close();
		
	}

}
