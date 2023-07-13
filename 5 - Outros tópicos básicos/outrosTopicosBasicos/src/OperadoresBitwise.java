//Operadores Bitwise

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaração de máscara para comparar
		int mask = 0b100000;
		int n = sc.nextInt();

		// Compara bit a bit
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}

		sc.close();
	}
}
