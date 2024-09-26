package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteEntradaTeclado {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo		
		InputStream fis = System.in;//recebe o texto do console
		InputStreamReader isr = new InputStreamReader(fis);//transforma o arquivo bin�rio em caractere
		BufferedReader br = new BufferedReader(isr);//faz a leitura do arquivo em caractere
		
		FileOutputStream fos = new FileOutputStream("lorem4.txt");//salva o arquivo.
		OutputStreamWriter osw = new OutputStreamWriter(fos); //transforma o texto em binario
		BufferedWriter bw = new BufferedWriter(osw); //escreve o texto em caractere
		
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {	//condi��o: enquanto LINHA for N�O(sem conte�do) E N�O VAZIA, ou seja, enquanto LINHA tiver CONTEUDO e N�O FOR VAZIA;
			bw.write(linha);						//Escreva o texto para inserir no arquivo;
			bw.newLine();							//cria uma linha;
			linha = br.readLine();					//l� a linha atual, se tiver conte�do e n�o for vazia repete o ciclo, se for vazia encerra o loop.
		}
		br.close();
		bw.close();
	}
}