package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		double a, b, soma;
		
		System.out.println("Digite o primeiro número :");
		a = leia.nextDouble();
		
		System.out.println("Digite o segundo numero :");
		b = leia.nextDouble();
		
		leia.close();
		
		soma = a + b;
		
		System.out.println("Resultado : " + soma);

	}

}
