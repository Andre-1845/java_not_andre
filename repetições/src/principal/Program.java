package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * sintaxe do FOR
		 * 1 - variavel que inicia o contador
		 * 2 - condição que deve ser aceita
		 * 3 - incremento
		 */

		for (int contador = 0; contador <= 10; contador+=1) {
			System.out.println("Contador = " + contador);
			if (contador == 5) {
				contador = 8;
			}
		}
	}

}
