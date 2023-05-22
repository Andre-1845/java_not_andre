package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número :");
		numero = leia.nextDouble();
		
		leia.close();
		
		System.out.println("O número digitado foi : " + numero);
		

	}

}
