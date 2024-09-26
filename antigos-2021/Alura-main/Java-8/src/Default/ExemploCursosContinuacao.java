package Default;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class CursoContinuacao {
	private String nome;
	private int alunos;
	
	public CursoContinuacao(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	public int getAlunos() {
		return alunos;
	}
	
}

public class ExemploCursosContinuacao {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));	
		
		int soma = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum(); 							
		System.out.println(soma);
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
			
		//no trecho abaixo fazemos um filtro nos elementos e para podermos utilizar
		//em outro momento utilizamos o collect para jogar dentro de uma lista.
		cursos = cursos.stream()
			.filter(c -> c.getAlunos()>=100)
			.collect(Collectors.toList());
		
		//no trecho abaixo reutilizamos o stream que foi alocado na ista	
		cursos.stream()
			.forEach(c -> System.out.println(c.getNome()));
		
		//no trecho abaixo utilizamos o metodo toMap
		//os maps recebem duas functions
		cursos.stream()
			.filter(c -> c.getAlunos() >=100)
			.collect(Collectors.toMap(
					c -> c.getNome(),			//function: dado o curso, qual key
					c-> c.getAlunos()))			//function: dado o curso, qual value
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
		
		//no trecho abaixo tiramos e media de alunos por cusro utilizando stream
		cursos.stream()
			.mapToInt(c -> c.getAlunos())
			.average()
			;
		//preciso entender como imprimir...
	}	
	
	
	
}