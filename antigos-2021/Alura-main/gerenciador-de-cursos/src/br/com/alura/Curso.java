package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String intrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String intrutor) {
		this.nome = nome;
		this.intrutor = intrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getIntrutor() {
		return intrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // trava o objeto e não possível alterar por aqui, nem adicionar,
													// nem mudar a ordem de classificação.
	} // programação defensiva.

	public void adiciona(Aula aula) { // o método para adicionar aulas dentro do curso
		this.aulas.add(aula);
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", Tempo total: " + this.getTempoTotal() + this.aulas + "]";
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if	(!matriculaParaAluno.containsKey(numero)) { 
			throw new NoSuchElementException();
		}return matriculaParaAluno.get(numero);
	}
}
