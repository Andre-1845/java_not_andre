package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcao;
		int opcao2, limite;
		double numero;
		
		Random rd = new Random();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escolha um numero ");
		limite = sc.nextInt();
		opcao2 = rd.nextInt(limite) + 1;
	
		System.out.println("Opção : " + opcao2);
		
		numero = rd.nextDouble();	
		
		switch (opcao2) {
		case 3:
			System.out.println("Terça-feira");
			break;	
		case 4:
			System.out.println("O dia é Quarta-feira");
			break;
		case 5:
			System.out.println("O dia é Quinta-feira");
			break;
		case 6:
			System.out.println("Sextou !!!");		
			break;	
			
		default:
			System.out.println("nenhum dia escolhido");
			
		}
		System.out.println("Double : " + numero);
		
	}

}
