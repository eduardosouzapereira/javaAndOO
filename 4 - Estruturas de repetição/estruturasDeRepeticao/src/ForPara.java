//Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos N números lidos

import java.util.Scanner;

public class ForPara {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
