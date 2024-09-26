package br.com.alura;

public class TesteBuscaAlunoNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando Colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20, 1));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21, 3));
		javaColecoes.adiciona(new Aula("Modelando Com Coleções", 22, 2));

		Aluno a1 = new Aluno("Theo", 1);
		Aluno a2 = new Aluno("Thomas", 2);
		Aluno a3 = new Aluno("Taylinho", 3);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		System.out.println("Quem é o aluno com a matricula 1?");
		Aluno aluno = javaColecoes.buscaMatriculado(3);
		System.out.println(aluno);

	}
}