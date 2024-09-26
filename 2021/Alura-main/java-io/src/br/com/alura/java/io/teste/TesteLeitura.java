package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo		
		InputStream fis = new FileInputStream("lorem.txt");//recebe o arquivo
		Reader isr = new InputStreamReader(fis, "UTF-8");//transforma o arquivo bin�rio em caractere e define o tipo de caracteres.
		BufferedReader br = new BufferedReader(isr);//faz a leitura do arquivo em caractere
		
		String linha = br.readLine();
		
		while(linha != null) {			//condi��o: enquanto LINHA for N�O(SEM CONTEUDO), ou seja, enquanto LINHA tiver CONTEUDO;
			System.out.println(linha);	//imprime a linha;
			linha = br.readLine();		//l� a linha seguinte, e repete o passo acima at� que a linha lida seja vazia.
		}
		br.close();
	}
}
