package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hello") //configura e informa o endereço para acessar o servlet
public class OiMundoServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	PrintWriter out = resp.getWriter();	
	out.println("<html>");
	out.println("<body>");
	out.println("<h1>hello, testando agora foi porra ^^!!!</h1>");
	out.println("</body>");
	out.println("</html>");
	
	System.out.println("O teste foi enviado");
	}
}
