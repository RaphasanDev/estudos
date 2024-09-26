package br.com.bytebank.banco.teste.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		
		Conta cc5 = new ContaPoupanca(22, 22);
		Cliente clienteCC5 = new Cliente();
		clienteCC5.setNome("Raphael");
		cc5.setTitular(clienteCC5);
		cc5.deposita(222.0);
		
         List<Conta> lista = new ArrayList<>();
         lista.add(cc1);
         lista.add(cc2);
         lista.add(cc3);
         lista.add(cc4);
         lista.add(cc5);
         
         for (Conta conta : lista) {
			System.out.println(conta);
		}
         
         //NumeroDaContaComparator comparator = new NumeroDaContaComparator();
         //TitularDaContaComparator titularComparator = new TitularDaContaComparator();
         //lista.sort(new TitularDaContaComparator()); //o comparador � utilizado uma �nica vez, por tanto escrevemos menos fazendo sua instancia��o diretamente dentro do m�todo sort.
         //Collections.sort(lista, new TitularDaContaComparator());
         
         Collections.sort(lista); //para esse m�todo funcionar � necess�rio ter implementado l� na classe o Comparable, para poder utilizar a ordem natural, sem precisar instanciar uma.
         System.out.println("-------------------");
        
         for (Conta conta : lista) {
        	 System.out.println(conta + ", " + conta.getTitular().getNome());
			
		} 
	}
}
class TitularDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomec1 = c1.getTitular().getNome();
		String nomec2 = c2.getTitular().getNome();
		return nomec1.compareTo(nomec2);
	}
	
}
class NumeroDaContaComparator implements Comparator	<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
		 //acima fazemos a compara��o usando a classe Integer.
		
		//return c1.getNumero() - c2.getNumero();
		
		// o trecho acima � exatamente a mesma coisa que o trecho abaixo
		//por�m em uma �nica linha.
		
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
	}

}
