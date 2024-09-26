package Default;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {
		// Jeito antes do java 8
		List<String> palavras = new ArrayList<String>();
		palavras.add("Theofilo");
		palavras.add("Thomas");
		palavras.add("Tayler");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
				//criou uma classe comparator, definiu o critério de classificação e implementa esse critério
				//dentro do método sort. ANTES DO JAVA 8
		//Collections.sort(palavras, comparador);
		
				//utilizamos a classe comparator direto no método da list
				//Com java 8
		palavras.sort(comparador);
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
		//System.out.println(palavras);
	}
}
	
class ImprimeNaLinha implements Consumer<String>{	//esse tipo de classe, curta, que não será reaproveita em outros 
													// pode ser transformada em uma classe anomina inicializada diretamente na interface.
    @Override
    public void accept(String s) {
        System.out.println("kk");
    }
}
class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}