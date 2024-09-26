package br.com.alura;

public class Aula implements Comparable<Aula>{

	private String titulo;
	private int tempo;
	private int id;
	
	public Aula(String titulo, int tempo, int id) {
		this.titulo = titulo;
		this.tempo = tempo;
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getTempo() {
		return tempo;
	} 
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos, " + "ID: " + this.id + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
}
