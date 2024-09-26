package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(11,11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		guardador.adiciona(cc2);
//		
		Conta cc3 = new ContaCorrente(33,33);
		guardador.adiciona(cc3);
		
		int tamanho = guardador.getContasCriadas();
		System.out.println(tamanho);
		
		
//		System.out.println(ref.getNumero());
	}

}
