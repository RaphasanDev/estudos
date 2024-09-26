package br.com.alura;

public class Aluno {
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
		
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {			//metodo para comparar dois alunos, se são iguais
		Aluno outro = (Aluno) obj;				//aqui definimos qual a regra que determinará se dois objetos serão iguais ou não.
		return this.nome.equals(outro.nome);	//nesse caso o critério é ter o nome igual.
	}
	
	@Override
	public int hashCode() {					//sempre que reescrever o equals, é preciso reescreer o hashCode
		return this.nome.hashCode();		//ele faz com o que o objeto seja identificado com um numero unico
	}										//usando o espalhamento.
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.numeroMatricula + "]";
	}
	
	
	
}
