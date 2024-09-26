package br.com.bytebank.banco.teste.util;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
				
		Integer idadeRef = Integer.valueOf(29);//Autoboxing
		System.out.println(idadeRef.intValue());//Unboxing
		
		Double dRef = Double.valueOf(3);//autoboxing
		System.out.println(dRef.doubleValue());//unboxing
		
		Boolean bRef = Boolean.TRUE;//autoboxing
		System.out.println(bRef.booleanValue());//unboxing
	
		Float fRef = Float.valueOf(5.1f);//autoboxing
		System.out.println(fRef);//unboxing
		
		
	}

}
