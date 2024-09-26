package Default;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.of(2014, Month.MAY, 28);
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		System.out.println(olimpiadasRio);
		
		int anos = olimpiadasRio.getYear()-hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);	//o método plusyear não altera o elemento original ele gera  
		System.out.println(proximasOlimpiadas);						//um novo elemento, por isso guardamos numa nova variável
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		String valorFormatadoComHoras =agora.format(formatadorComHoras);
		System.out.println(valorFormatadoComHoras);
		System.out.println(agora.format(formatadorComHoras));
		
	}
}
