//Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
//Trabalhando com vetores de classes

package application;

import java.util.Scanner;

import entities.Product;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// Declaração de vetor de classe
		Product[] vect = new Product[n];

		// Leitura do vetor de classe
		// vect.lenth = tamanho do vetor
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			// Cada índice recebe uma classe
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		//Acesso ao vetor
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/n;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);

		sc.close();
	}
}
