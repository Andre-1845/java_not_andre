package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		double altura = 0, media = 0, soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (i = 1; i <= 5; i++) {
			System.out.println("Digite a altura " + i);
			altura = sc.nextDouble();
			soma =  soma + altura;
		}
		media = soma / 5;
		sc.close();
		System.out.printf("A media é %.2f", media);
		
	}

}
