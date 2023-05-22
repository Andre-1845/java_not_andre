package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em °C: ");
		c = leia.nextDouble();
		
		leia.close();
		
		f = (9*c+160)/5;
		
		System.out.println("A temperatura é " + f + "°F");
		

	}

}
