package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 25;
		boolean boo1 = false;
		
		if(num1 >= num2) {
			System.out.println("Numero 1 é o maior");
		}
		else {
			System.out.println("Numero 2 é o maior");
		}
		if(boo1 == true) {
			System.out.println("Verdadeiro");
		}
		else {
			System.out.println("Falso");
		}
		
		// Resto da divisão
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		System.out.println("Digite um número");
		numero = leia.nextInt();
			
		leia.close();
			
		if((numero % 2) == 0)	{
			System.out.println("O número é PAR");
		}
		else {
			System.out.println("O número é ímpar");
		}
		
	}

}
