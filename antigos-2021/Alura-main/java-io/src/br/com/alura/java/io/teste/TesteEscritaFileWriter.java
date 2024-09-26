package br.com.alura.java.io.teste;

//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("lorem2.txt");//salva o arquivo.
//		OutputStreamWriter osw = new OutputStreamWriter(fos); //transforma o texto em binario
//		BufferedWriter bw = new BufferedWriter(osw); //escreve o texto em caractere
		
		
		//FileWriter fw = new FileWriter("lorem2.txt");	//classe de alto nível que salva o arquivo e pode ser inicializada diretamente dentro do BufferedWriter;
		 
//		BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem5.txt"));
//		bw.write("Theo, Thomas e Tayler, lindos demais");
//		bw.newLine();
//		bw.newLine();
//		bw.write("Amores da minha vida!");
//		bw.close();
		
		//PrintStream ps = new PrintWriter(new File("lorem5.txt"));
		 
		PrintWriter ps = new PrintWriter("lorem5.txt");
		 
		 ps.println("Teste PrintWriter");
		 ps.println();
		 ps.println();
		 ps.println();
		 ps.println("Funcionou");
		 
		 ps.close();
		 	
	}

}
