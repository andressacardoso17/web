package br.com.teste.logica;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.teste.dao.ContatoDao;
import br.com.teste.modelo.Contato;

public class AdicionaContato implements Logica{

	public String executa(HttpServletRequest req, HttpServletResponse res) throws SQLException, ServletException, IOException {
		
				// busca o writer
				PrintWriter out = res.getWriter();

				// buscando os parâmetros no request
				String nome = req.getParameter("nome");
				String dataEmTexto = req.getParameter("dataNascimento");
				Calendar dataNascimento = null;

				// fazendo a conversão da data
				try {
					Date date = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
					dataNascimento = Calendar.getInstance();
					dataNascimento.setTime(date);
				} catch (ParseException e) {
					out.println("Erro de conversão da data");
					// para a execução do método
				}

				// monta um objeto contato
				Contato contato = new Contato();
				contato.setNome(nome);
				contato.setDataNascimento(dataNascimento);

				// salva o contato
				ContatoDao dao = null;
				try {
					dao = new ContatoDao();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dao.adiciona(contato);
				return "mvc?logica=ListaContatosLogic";
	}
	
}
