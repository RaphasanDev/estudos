package br.com.bytebank.banco.teste.util;

public class TesteWrapperInteger {
	public static void main(String[] args) {
		//c�digo curso
		
		//int idade = 29;
		Integer idadeRef = Integer.valueOf(29);//Autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		
		
		//c�digo teste meu
//		Integer idadeRef = Integer.valueOf(29); //autoboxing
//		System.out.println("Autoboxing: " + idadeRef);
//		int valor = idadeRef.intValue();
//		System.out.println("Unboxing: " + valor);
//		
//		String s = args[1];// parametros foram inseridos nas configura��es do Run
//		
//		
//		//Integer numero = Integer.valueOf(s); // uma forma de parsing.
//		
//			//Utilizando o m�todo parse
//		//Float numero = Float.parseFloat(s);
//		//Integer numero = Integer.parseInt(s)
//		Double numero = Double.parseDouble(s);
//		System.out.println("Parsing: " + numero);
	}
}
