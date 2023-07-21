package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// Criação da lista
		// List<tipo wrapper> <nome> = new ArrayList<>();
		List<String> minhaLista = new ArrayList<>();

		// Adicionar elementos
		minhaLista.add("Maria");
		minhaLista.add("Alex");
		minhaLista.add("Bob");
		minhaLista.add("Anna");

		// Adiciona em posição específica
		minhaLista.add(2, "Marco");

		// Acha tamanho da lista e imprime
		System.out.println(minhaLista.size());

		for (String x : minhaLista) {
			System.out.println(x);
		}

		// Remove por nome
		minhaLista.remove("Anna");
		// Remove por posição
		minhaLista.remove(1);

		// Remoção por critério
		minhaLista.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("Index of Bob" + minhaLista.indexOf("Bob"));

		// Filtrando elementos da lista
		// Cria-se uma nova lista
		// Converte-se a lista antiga para stream
		// Utiliza-se a função filter, passando um predicado por parâmetro
		// Utiliza-se a função collect
		// Passa-se por parâmetro a função toList para converter os Collectors
		List<String> result = minhaLista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		// Encontrando primeira ocorrência de elemento específico
		String name = minhaLista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElseGet(null);
		System.out.println(name);
		
	}

}
