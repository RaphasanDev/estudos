package br.com.alura.java.io.teste;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//String nome = "Raphael Santos";
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));	
//		oos.writeObject(nome);																	//transformar um objeto em fluxo binário é chamado Serialização.
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject();												//transformar um fluxo binário em objeto é chamado desserialização
		System.out.println(nome);
		ois.close();
	}
	
}
