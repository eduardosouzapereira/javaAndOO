//Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI com duas casas decimais.
//Versão 2: dependendo de classe Calculator

package application;

import java.util.Scanner;

import util.Calculator;

public class MembrosEstaticos2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator calc = new Calculator();
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
}
