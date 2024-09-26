package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TesteCusroComAlunos {
	
	public static void main(String[] args) {
	
		Curso javaColecoes = new Curso("Dominando Colecoes do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20, 1));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21, 3));
		javaColecoes.adiciona(new Aula("Modelando Com Coleções", 22, 2));
		
		Aluno a1 = new Aluno ("Theo", 0001);
		Aluno a2 = new Aluno("Thomas", 0002);
		Aluno a3 = new Aluno ("Taylinho", 0003);
		Aluno a4 = new Aluno ("Tayler", 0004);
		Aluno a5 = new Aluno ("Brian", 0005);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		javaColecoes.matricular(a5);
		
//		System.out.println("Todos os alunos matriculados: ");
//		javaColecoes.getAlunos().forEach(aluno -> {
//			System.out.println(aluno);
//		});
//		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
				
//		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(a1));
//		
//		Aluno turini = new Aluno("Theo", 34672);
//		System.out.println("E esse Turini, está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(turini));
//		
//		System.out.println("O a1 é equals ao Turini?");
//		System.out.println(a1.equals(turini));
//		
//		// obrigatoriamente  o seguinte é true
//		
//		System.out.println(a1.hashCode() == turini.hashCode());
		
	}
}
