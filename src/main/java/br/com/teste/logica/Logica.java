package br.com.teste.logica;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	String executa(HttpServletRequest req, HttpServletResponse res) throws SQLException, ServletException, IOException;
}
