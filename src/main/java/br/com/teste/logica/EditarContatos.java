package br.com.teste.logica;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.teste.dao.ContatoDao;
import br.com.teste.modelo.Contato;

public class EditarContatos implements Logica{

	public String executa(HttpServletRequest req, HttpServletResponse res) throws SQLException, ServletException, IOException {
		 
		long id = Long.parseLong(req.getParameter("id"));

	    Contato contato = new Contato();
	    contato.setId(id);

	    ContatoDao dao = new ContatoDao();
	    dao.altera(contato);
	    
	    return "mvc?logica=AlterarContatos";
	}
	
}
