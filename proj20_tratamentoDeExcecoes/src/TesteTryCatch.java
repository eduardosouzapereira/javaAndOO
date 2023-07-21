
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// Leitura com espaço em branco, sem delimitação de tamanho para o vetor
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			// Definição de tamanho para o vetor
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("End of program");
		sc.close();
	}
}