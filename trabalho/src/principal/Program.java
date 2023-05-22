package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leia = new Scanner (System.in);
	
	double valorHora, horasMes, salario;
	
	System.out.println("Qual o valor da hora de trabalho? ");
	valorHora = leia.nextDouble();
	
	System.out.println("Quantas horas trabalhadas no mês ? ");
	horasMes = leia.nextDouble();
	
	leia.close();
	
	salario = valorHora * horasMes;
	
	System.out.println("Salario mensal = " + salario);
	
	

	}

}
