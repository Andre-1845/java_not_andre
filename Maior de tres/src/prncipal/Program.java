package prncipal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3, max1, max2;
		// Receber n�meros
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o n�mero 1 ");
		num1 = leia.nextDouble();
		System.out.println();
		System.out.print("Digite o n�mero 2 ");
		num2 = leia.nextDouble();
		System.out.println();
		System.out.print("Digite o n�mero 3 ");
		num3 = leia.nextDouble();
		System.out.println();
		
		leia.close();
		// COMPARA��O
		if (num1 >= num2) {
			max1 = num1;
		}
		else {
			max1 = num2;
		}	
		if (max1 >= num3) {
			max2 = max1;
		}
		else {
			max2 = num3;
		}
		
		// RESULTADO		
		System.out.printf("O maior dos 3 n�meros � %.2f", max2);
		
		
	}

}
