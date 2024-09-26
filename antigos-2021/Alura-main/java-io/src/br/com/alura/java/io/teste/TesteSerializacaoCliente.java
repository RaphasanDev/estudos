package br.com.alura.java.io.teste;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente  cliente = new Cliente();															//criando o objeto.
//		cliente.setNome("Raphael");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("418.548.198-52");
//		Cliente cliente1 = new Cliente();
//		cliente1.setCpf("123");
//		cliente1.setNome("Theo");
//		
//				
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente1.bin"));		//criação do objeto que salva um arquivo.
//		oos.writeObject(cliente);																	//serilizando o objeto cliente e colocando dentro do arquivo.
//		oos.writeObject(cliente1);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente1.bin"));			//criando o objeto que trará o arquivo
		Cliente cliente = (Cliente) ois.readObject();												//desserializando o arquivo para leitura dos dados.
		//Cliente cliente1 = (Cliente) ois.readObject();	
		System.out.println(cliente.getNome() + cliente.getCpf() + cliente.getProfissao());
		ois.close();
	}
	
}
