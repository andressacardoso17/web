<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div id="wrapper">
		<jsp:include page="menu.jsp" />
		<!-- cria o DAO -->
		<jsp:useBean id="dao" class="br.com.teste.dao.ContatoDao" />
		<br>
		<table class="table table-striped">
			<tr>
				<th>Nome</th>
				<th>Data de Nascimento</th>
				<th>A��es</th>
			</tr>
			<!-- percorre contatos montando as linhas da tabela -->
			<c:forEach var="contato" items="${dao.lista}">
				<tr>
					<td>${contato.nome}</td>
					<td><fmt:formatDate value="${contato.dataNascimento.time}"
							pattern="dd/MM/yyyy" /></td>
					<td><a class="btn btn-warning btn-xs" href="mvc?logica=AlterarContatos&id=${contato.id}">Editar</a>
					<a class="btn btn-danger btn-xs"  href="mvc?logica=RemoveContatos&id=${contato.id}">Excluir</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>