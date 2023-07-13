import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// Instanciando objeto de leitura
		// Necessário import: import java.util.Scanner;
		Scanner sc = new Scanner(System.in);

		// Leitura de String
		// String x;
		// x = sc.next();

		// Leitura de inteiro
		// int x;
		// x = sc.nextInt();

		// Leitura de double
		// double x;
		// x = sc.nextDouble();

		// Leitura de char
		// char x;
		// x = sc.next().charAt(0);

		// Leitura de vários dados na mesma linha
		// String x;
		// int y;
		// double z;
		// x = sc.next();
		// y = sc.nextInt();
		// z = sc.nextDouble();

		// Leitura de texto até a próxima quebra de linha
		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		// Consumindo espaço extra do buffer
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// Sempre fechar o scanner ao final da utilização
		sc.close();

	}

}
