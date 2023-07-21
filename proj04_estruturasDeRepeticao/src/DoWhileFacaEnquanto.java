//Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
//Fórmula: F = (9C/5) + 32

import java.util.Scanner;

public class DoWhileFacaEnquanto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}
}
