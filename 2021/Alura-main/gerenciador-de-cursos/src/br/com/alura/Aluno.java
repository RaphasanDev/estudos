package br.com.alura;

public class Aluno {
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome n�o pode ser nulo");
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
	public boolean equals(Object obj) {			//metodo para comparar dois alunos, se s�o iguais
		Aluno outro = (Aluno) obj;				//aqui definimos qual a regra que determinar� se dois objetos ser�o iguais ou n�o.
		return this.nome.equals(outro.nome);	//nesse caso o crit�rio � ter o nome igual.
	}
	
	@Override
	public int hashCode() {					//sempre que reescrever o equals, � preciso reescreer o hashCode
		return this.nome.hashCode();		//ele faz com o que o objeto seja identificado com um numero unico
	}										//usando o espalhamento.
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.numeroMatricula + "]";
	}
	
	
	
}
