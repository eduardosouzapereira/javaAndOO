package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClasseFile {
	public static void main(String[] args) {
		// Objeto do tipo file
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
