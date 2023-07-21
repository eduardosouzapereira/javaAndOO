import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TextoParaDataHora {

	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// A partir de um texto
		LocalDate d04 = LocalDate.parse("2023-07-11");
		System.out.println(d04);

		// A partir de um texto com hora
		LocalDateTime d05 = LocalDateTime.parse("2023-07-11T13:19:59");
		System.out.println(d05);

		// A partir de um texto com hora e fuso
		Instant d06 = Instant.parse("2023-07-11T13:19:59Z");
		System.out.println(d06);
		
		// Imprime no formato definido
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(d04.format(fmt1));
		// O inverso também é possível
		System.out.println(fmt1.format(d04));

		// Com Instant é diferente
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// Instant não tem método format
		System.out.println(fmt3.format(d06));
	}

}
