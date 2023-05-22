package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double max, num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o num 1 ");
		num1 = sc.nextDouble();
		max = num1;
		System.out.println("Digite o num 2 ");
		num2 = sc.nextDouble();
		System.out.println("Digite o num 3 ");
		num3 = sc.nextDouble();
		
		sc.close();
		 /*
		if (num1 > num2 && num1 > num3) {
			max = num1;
		}
		if (num2 > num1 && num2 > num3) {
			max = num2;
		}
		if (num3 > num1 && num3 > num2) {
			max = num3;
		}
		System.out.println("O maior número é : " + max );
		*/
		
		if(num1 > num2 && num1 >num3) {
			System.out.println("O maior é :" + num1);
		}
		else if (num2 > num3) {
			System.out.println("O maior é " + num2);
		}
		else {
			System.out.println("o maior é " + num3);
		}
		while (num3 > 0) {
			System.out.println("Num3 = " + num3);
			num3 --;
						}
		}
	}

