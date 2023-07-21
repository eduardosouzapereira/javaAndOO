//Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
//Primeira versão: sem funções

import java.util.Scanner;

public class funcoesV1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Higher = " + a);
		} else if (b > c) {
			System.out.println("Higher = " + b);
		} else {
			System.out.println("Higher = " + c);
		}

		sc.close();

	}
}
