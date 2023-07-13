package application;

public class ForEachParaCada {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		// Laço For
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		// Laço For Each
		// (<tipo> <alias> : vetor)
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
