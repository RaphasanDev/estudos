package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Leitura2 {
	
	public static void main(String[] args) throws Exception {
		
	 	
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");	//uma forma de entrada de informação no sistema; também podemos definir qual padrão de caracteres deve ser usado;
			//Scanner para ler linha por linha, recebe o arquivo.
		while													//faremos um loop para imprimir no console de cada linha existente no arquivo.
			(scanner.hasNextLine()) {							//Scanner tem vários métodos, esse serve para verificar se há uma próxima linha;
			String linha = scanner.nextLine();					//Faz com que o scanner vá lendo linha por linha;
			//System.out.println(linha);						//enquanto houver linha preenchida, esta será impressa no console.
			
			Scanner linhaScanner = new Scanner(linha); 	//Scanner recebe como source o primeiro scanner LINHA;
			linhaScanner.useLocale(Locale.US);			//Houve necessidade desse elemento para forçar o código a utilizar o . como separador entre int e double, que é padrão americano. Minha máquina está em português, então estava usando a , o que causa uma exceção.
			linhaScanner.useDelimiter(","); 			//intrução para o scanner fazer a separação de valores baseado na vírgula;
			
			String tipoConta = linhaScanner.next();
			String agencia = linhaScanner.next();		//faz o parsing de String para um tipo específico diretamente;
			int numeroConta = linhaScanner.nextInt();	//faz o parsing de String para um tipo específico diretamente;
			String titular = linhaScanner.next();		
			double saldo = linhaScanner.nextDouble();	//faz o parsing de String para um tipo específico diretamente;
			
			
			//String valorFormatado = String.format(new Locale("pt", "br"),"%s - %04d-%08d, %20s: %010.2f",	//formatação onde podemos definir e padronizar como as informações serão apresentadas no console;
			//										tipoConta, agencia, numeroConta, titular, saldo);
			//System.out.println(valorFormatado);																
			
			System.out.format(new Locale("pt", "br"),"%s - %04d-%08d, %20s: %010.2f %n",//podemos jogar o formato direto no System.out.Format;
								tipoConta, agencia, numeroConta, titular, saldo);
		
			
			linhaScanner.close();
			
//			String[] valores = linha.split(",");				//criamos um array para inserir os valores vindos do nosso arquivo, o split faz a leitura da separação dos dados baseado na vírgula;
//			System.out.println(valores[4]);						//quero imprimir o dado do array na posição X;
		
			
		}

		scanner.close();
		
	}
}
