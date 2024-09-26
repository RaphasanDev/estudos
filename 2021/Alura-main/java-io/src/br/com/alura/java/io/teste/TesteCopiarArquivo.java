package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo		
		InputStream fis = new FileInputStream("lorem.txt");//recebe o arquivo
		InputStreamReader isr = new InputStreamReader(fis);//transforma o arquivo binário em caractere
		BufferedReader br = new BufferedReader(isr);//faz a leitura do arquivo em caractere
		
		FileOutputStream fos = new FileOutputStream("lorem6.txt");//salva o novo arquivo.
		OutputStreamWriter osw = new OutputStreamWriter(fos); //transforma o texto em binario
		BufferedWriter bw = new BufferedWriter(osw); //escreve o texto em caractere
				
		String linha = br.readLine();
		System.out.println(linha);
		while(linha != null) {
			bw.write(linha);		//escreve, no novo arquivo, o conteúdo que estava no primeiro arquivo;
			bw.newLine();			//usamos para fazer a quebra de linha, caso contrário todas as linhas do primeiro arquivo serão escritas em uma unica linha do novo arquivo;
			linha = br.readLine();	//lê a linha seguinte, se houver conteúdo repete o loop, caso contrário encerra e salva o arquivo.
		//System.out.println(linha);
		}
		br.close();
		bw.close();
	}
}
