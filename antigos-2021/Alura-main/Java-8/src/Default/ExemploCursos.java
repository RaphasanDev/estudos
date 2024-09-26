package Default;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
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

public class ExemploCursos {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(c -> c.getAlunos()));	//lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos));	//reference method (tem limitações)
		
		
		
		cursos.stream()											//quando utilizamos o stream ele não altera a coleção original, por isso
			.filter(c -> c.getAlunos() >= 100)					//para imprimir os elementos processados com o código é preciso fazer dentro
				.forEach(c -> System.out.println(c.getNome()));	//dentro do proprio stream com um metodo foreach. Se imprimir fora dessa laço
																//o retorno será o mesmo antes de processar o stream
		
		
		cursos.stream()											//
			.filter(c -> c.getAlunos() >= 100)					//aqui tem dois elementos, por isso é utilizado o lambda
			.map(c -> c.getAlunos())							//aqui so tem um elemento, é possivel usar o reference method, exemplo abaixo
				.forEach(total -> System.out.println(total));	//aqui so tem um elemento, é possivel usar o reference method, exemplo abaixo
			

		cursos.stream()										 //
			.filter(c -> c.getAlunos() >= 50)				//aqui tem dois elementos, por isso é utilizado o lambda
			.map(Curso::getAlunos)							//exemplo do model acima
			.forEach(System.out::println);					//exemplo do model acima
		
		int soma = cursos.stream()				//criando uma variavel
			.filter(c -> c.getAlunos() >= 50)	//que filtra os valores maior que 100
			.mapToInt(Curso::getAlunos)			//transforma em integer
			.sum(); 							//e soma eles. Tudo numa unica linha(está quebrada em 4 linhas, mas é um unico comando)
			System.out.println(soma);
	}
	
	
	
}
