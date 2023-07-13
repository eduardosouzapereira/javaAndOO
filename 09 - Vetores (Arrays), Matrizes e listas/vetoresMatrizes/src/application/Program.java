//Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
//Trabalhando com vetores de tipos primitivos

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		// Instanciando vetor
		double[] vect = new double[N];

		// Lendo vetor
		for (int i = 0; i < N; i++) {
			vect[i] = sc.nextDouble();
		}

		// Acessando vetor
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			sum += vect[i];
		}
		double avg = sum / N;

		System.out.printf("AVERAGE HEIGHT: %.2f\n", avg);

		sc.close();
	}
}
