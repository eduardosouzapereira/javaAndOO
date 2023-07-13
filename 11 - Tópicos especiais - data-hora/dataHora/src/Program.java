import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// Instanciação de data a partir de "agora"
		// Dia, mês e ano
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);

		// Com hora completa
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);

		// Com fuso-horário
		Instant d03 = Instant.now();
		System.out.println(d03);

		// A partir de um texto
		LocalDate d04 = LocalDate.parse("2023-07-11");
		System.out.println(d04);

		// A partir de um texto com hora
		LocalDateTime d05 = LocalDateTime.parse("2023-07-11T13:19:59");
		System.out.println(d05);

		// A partir de um texto com hora e fuso
		Instant d06 = Instant.parse("2023-07-11T13:19:59Z");
		System.out.println(d06);

		// A partir de um texto com hora e fuso diferente de Londres
		// A partir do horário indicado, ele reverte para o horário de Londres
		// Ao indicar o -03:00 significa que estou nesse fuso
		// O resultado impresso é o fuso de Londres
		Instant d07 = Instant.parse("2023-07-11T13:19:59-03:00");
		System.out.println(d07);

		// Convertendo texto em data
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("25/12/2023", fmt1);
		System.out.println(d08);

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("25/12/2023 13:57", fmt2);
		System.out.println(d09);

		// Também é possível omitir a variável
		// LocalDateTime d09 = LocalDateTime.parse("25/12/2023 13:57",
		// DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		// System.out.println(d09);

		// Parâmetros isolados
		LocalDate d10 = LocalDate.of(2022, 07, 11);
		System.out.println(d10);

		// Parâmetros isolados
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 11, 20, 1, 30);
		System.out.println(d11);
	}

}
