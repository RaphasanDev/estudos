package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();

		
		Conta cc = new ContaCorrente(11,11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		System.out.println("Primeiro Tamanho: " + lista.size());
		Conta ref = (Conta) lista.get(1);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho Atual: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33,33);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(44,44);
		lista.add(cc4);
		
//		for(int i = 0; i< lista.size(); i++) {
//			System.out.println(lista.get(i));
//			
//		}
		for(Object Conta : lista) {
			System.out.println(Conta);
		}
		
	}

}
