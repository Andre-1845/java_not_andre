package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double c;
		double f;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em °F: ");
		f = leia.nextDouble();
		
		c = 5*(f-32)/9;
		
		leia.close();
		
		System.out.println("Temperatura em °C = " + c);
		
		

	}

}
