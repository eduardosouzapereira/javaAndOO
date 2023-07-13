
public class ProcessamentoCasting {

	public static void main(String[] args) {
		// Atribuição
		// <variável> = <expressão>;

		// Exemplo 1:
		// int x, y;
		// x = 5;
		// y = 2 * x;
		// System.out.println(x);
		// System.out.println(y);

		// Exemplo 2:
		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		//Exemplo 3: área do trapézio
		//double b, B, h, area;
		//b = 6.0;
		//B = 8.0;
		//h = 5.0;
		//area = (b + B) / 2.0 * h;
		//System.out.println(area);
		
		//Exemplo 3 (com boas práticas:
		//float b, B, h, area;
		//b = 6f;
		//B = 8f;
		//h = 5f;
		//area = (b + B) / 2f * h;
		//System.out.println(area);
		
		//Exemplo 4: Casting
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b;
		//Explicíta-se a cláusula com o tipo da variável para que a divisão seja do tipo double e não int
		System.out.println(resultado);

		//Exemplo 5
		//double a;
		//int b;
		//a = 5.0;
		//b = a; 
		// Nesse caso, a IDE acusará que não dá para fazer a atribuição
		//System.out.println(b);
	}

}
