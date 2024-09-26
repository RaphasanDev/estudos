package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		Object[] referencias = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22,11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22,22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
	//	System.out.println((Conta) referencias[1].getSaldo());
		
		
	}

}
