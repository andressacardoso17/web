package br.com.teste.logica;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.teste.dao.ContatoDao;
import br.com.teste.modelo.Contato;

public class ListaContatoLogic implements Logica{

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		List<Contato> contatos = new ContatoDao().getLista();
		
		req.setAttribute("contatos", contatos);
		
		return "/lista-contatos.jsp";
	}
}
