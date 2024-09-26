package Default;
import java.util.ArrayList;
import java.util.List;

public class OrdenarListaClasseAnonima {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Theofilo");
		palavras.add("Thomas");
		palavras.add("Tayler");

//		palavras.sort((s1, s2) -> {											
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); //lambda do trecho de c�digo acima, do Comparator
			//na impress�o acima recebemos os itens j� ordenados e impressos dentro do array
		
		System.out.println(palavras);

//		Consumer<String> consumidor = new Consumer<String>() { 	// classe anonima implementada diretamente no consumer
//		@Override 												// pode ser mais simplificada ainda, sendo passada como argumento diretamente no parametro
//			public void accept(String s) { 						// dentro do foreach no trecho abaixo.
//				System.out.println("kk");
//			}
//		};

		palavras.forEach(s -> System.out.println(s));
			//na impress�o acima temos a ordena��o dos elementos, mas a impress�o � feita individualmente.
	}

}