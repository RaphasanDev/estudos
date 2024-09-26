package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Leitura2 {
	
	public static void main(String[] args) throws Exception {
		
	 	
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");	//uma forma de entrada de informa��o no sistema; tamb�m podemos definir qual padr�o de caracteres deve ser usado;
			//Scanner para ler linha por linha, recebe o arquivo.
		while													//faremos um loop para imprimir no console de cada linha existente no arquivo.
			(scanner.hasNextLine()) {							//Scanner tem v�rios m�todos, esse serve para verificar se h� uma pr�xima linha;
			String linha = scanner.nextLine();					//Faz com que o scanner v� lendo linha por linha;
			//System.out.println(linha);						//enquanto houver linha preenchida, esta ser� impressa no console.
			
			Scanner linhaScanner = new Scanner(linha); 	//Scanner recebe como source o primeiro scanner LINHA;
			linhaScanner.useLocale(Locale.US);			//Houve necessidade desse elemento para for�ar o c�digo a utilizar o . como separador entre int e double, que � padr�o americano. Minha m�quina est� em portugu�s, ent�o estava usando a , o que causa uma exce��o.
			linhaScanner.useDelimiter(","); 			//intru��o para o scanner fazer a separa��o de valores baseado na v�rgula;
			
			String tipoConta = linhaScanner.next();
			String agencia = linhaScanner.next();		//faz o parsing de String para um tipo espec�fico diretamente;
			int numeroConta = linhaScanner.nextInt();	//faz o parsing de String para um tipo espec�fico diretamente;
			String titular = linhaScanner.next();		
			double saldo = linhaScanner.nextDouble();	//faz o parsing de String para um tipo espec�fico diretamente;
			
			
			//String valorFormatado = String.format(new Locale("pt", "br"),"%s - %04d-%08d, %20s: %010.2f",	//formata��o onde podemos definir e padronizar como as informa��es ser�o apresentadas no console;
			//										tipoConta, agencia, numeroConta, titular, saldo);
			//System.out.println(valorFormatado);																
			
			System.out.format(new Locale("pt", "br"),"%s - %04d-%08d, %20s: %010.2f %n",//podemos jogar o formato direto no System.out.Format;
								tipoConta, agencia, numeroConta, titular, saldo);
		
			
			linhaScanner.close();
			
//			String[] valores = linha.split(",");				//criamos um array para inserir os valores vindos do nosso arquivo, o split faz a leitura da separa��o dos dados baseado na v�rgula;
//			System.out.println(valores[4]);						//quero imprimir o dado do array na posi��o X;
		
			
		}

		scanner.close();
		
	}
}
