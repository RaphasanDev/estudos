package br.com.alura;

import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21, 2));
		javaColecoes.adiciona(new Aula("Trabalhando uma Aula", 20, 4));
		javaColecoes.adiciona(new Aula("Modelando Colecoes", 21, 1));
		//javaColecoes.getAulas().add(new Aula("Ensinando o Theo a obedecer", 7, 0));
			
		System.out.println(aulas);
	}
}
