package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21, 2));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20, 4));
		javaColecoes.adiciona(new Aula("Modelando Colecoes", 21, 1));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		//Collections.sort(aulasImutaveis); //não é possível ordenar os elementos pois estamos usando o 'unmodifiable'
		//System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis); //pegamos a lista que não pode ser alterada, criamos uma nova e essa sim podemos fazer alterações, inclusive ordenar.
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		//System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
	}
}
