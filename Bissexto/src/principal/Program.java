package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano, resto4, resto100, resto400;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o ano ");
		ano = leia.nextInt();
		
		resto4 = ano%4;
		resto100 = ano%100;
		resto400 = ano%400;
		
		if (resto4 != 0) {
			System.out.printf("%d não é bissexto", ano);
			
		}
		else {
			if (resto100 == 0) {
				if (resto400 == 0) {
					System.out.printf("%d é ano bissexto", ano);
				}
				else {
					System.out.printf("%d não é bissexto", ano);
				}
			}
			else {
				System.out.printf("%d é ano bissexto", ano);
			}
		}
		
	}

}
