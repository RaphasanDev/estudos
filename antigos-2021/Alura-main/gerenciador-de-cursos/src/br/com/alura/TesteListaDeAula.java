package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando as ArrayLists", 12, 3);
		Aula a2 = new Aula("Listar de objetos", 20, 8);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15, 5);

		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
//		for (Aula aula : aulas) {
//			System.out.println(aula);
		//}
	}
}