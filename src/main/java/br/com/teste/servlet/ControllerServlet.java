package br.com.teste.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.teste.logica.AdicionaContato;
import br.com.teste.logica.ListaContatoLogic;
import br.com.teste.logica.RemoveContatos;

@SuppressWarnings("serial")
@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String acao = req.getParameter("logica");

		if (acao.equals("AdicionaContato")) {
			try {
				new AdicionaContato().executa(req, resp);
				req.getRequestDispatcher("lista-contatos.jsp").forward(req, resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (acao.equals("ListaContatosLogic")) {
			try {
				new ListaContatoLogic().executa(req, resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (acao.equals("RemoveContatos")) {
			try {
				new RemoveContatos().executa(req, resp);
				req.getRequestDispatcher("lista-contatos.jsp").forward(req, resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
