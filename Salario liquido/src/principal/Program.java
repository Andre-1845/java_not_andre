package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario;
		double ir, inss;
		double salarioLiq;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio bruto :");
		salario = leia.nextDouble();
		
		ir = salario * 0.05;
		inss = salario * 0.11;
		salarioLiq = salario - inss - ir;
		
		leia.close();
		
		System.out.println("O INSS � " + inss);
		System.out.println("O IR � " + ir);
		System.out.println("O salario l�quido � " + salarioLiq);

	}

}