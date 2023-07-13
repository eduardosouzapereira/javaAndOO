import java.util.Locale;

public class Saida {

	public static void main(String[] args) {
		// Sem quebra de linha
		System.out.print("Bom dia!");

		// Com quebra de linha no final
		System.out.println("Bom dia!");

		// Escrevendo conteúdo de variável
		int y = 32;
		System.out.println(y);

		// Usando ponto flutuante
		double x = 10.35784;
		System.out.println(x);
		// Duas casas decimais
		System.out.printf("%.2f%n", x);
		// Quatro casas decimais
		System.out.printf("%.4f%n", x);

		// Mudando localização
		Locale.setDefault(Locale.US);

		// Concatenando elementos
		System.out.println("RESULTADO = " + x + " METROS");

		// Print formatado
		System.out.printf("RESULTADO = %.2f metros%n", x);

		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
