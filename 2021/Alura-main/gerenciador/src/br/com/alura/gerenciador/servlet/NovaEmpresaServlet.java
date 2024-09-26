package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Cadastrando Nova Empresa"); // mensagem a ser exibida no console

		String nomeEmpresa = request.getParameter("nome"); // variavel para armazenar os parametros recebidos
		String fantasiaEmpresa = request.getParameter("fantasia");
		String paramData = request.getParameter("data");

		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			dataAbertura = sdf.parse(paramData);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setFantasia(fantasiaEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		
		Banco banco = new Banco();
		banco.adiciona(empresa);

		// não precisamos mais do códio abaixo, pois o jsp fará a o trabalho de enviar a
		// resposta html
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Empresa " + nomeEmpresa + " Cadastrada com sucesso.</body></html>");	//mensagem a ser exibida no servidor

		
		
//		Não vamos mais chamar o dispatcher pois ao atualizar a página ele fica reenviando o formulário
//		precisamos enviar uma response pro navegador para que ele faça a chamada do "listaempresa"
//		através de uma nova request. 
		
		response.sendRedirect("listaEmpresas");
		
//		chamando o jsp
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNome());
//		request.setAttribute("fantasia", empresa.getFantasia());
//		rd.forward(request, response);

	}

}
