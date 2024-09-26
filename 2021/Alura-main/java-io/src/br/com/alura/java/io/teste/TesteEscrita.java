package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.OutputStream;
import java.io.OutputStreamWriter;
//import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//fluxo de saida com arquivo		
		FileOutputStream fos = new FileOutputStream("lorem2.txt");//salva o arquivo.
		OutputStreamWriter osw = new OutputStreamWriter(fos); //transforma o texto em binario
		BufferedWriter bw = new BufferedWriter(osw); //escreve o texto em caractere
		
		bw.write("Theo, Thomas e Tayler, lindos demais");
		bw.newLine();
		bw.newLine();
		bw.write("Amores da minha vida!");
		
		
		bw.close();
	}
}
