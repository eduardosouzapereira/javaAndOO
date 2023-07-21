package application;

public class BoxingUnboxingWrapper {

	public static void main(String[] args) {
		// Boxing
		int x = 20;
		Object obj = x;
		System.out.println(obj);

		// Unboxing
		// Necessário realizar casting
		int y = (int) obj;
		System.out.println(y);

		// Classe Wrapper
		// Boxing
		Integer obj2 = x;
		System.out.println(obj2);

		// Unboxing
		// Não é necessário realiar casting
		int z = obj2;
		System.out.println(z);
		
		// É possível realizar operações com classes wrapper
		z = obj2 * 2;
		System.out.println(obj2);
	}
}
