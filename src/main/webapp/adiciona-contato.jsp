<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li class="sidebar-brand"><a href="#"> Website </a></li>
				<li><a href="#">In�cio</a></li>
				<li><a href="#">Sobre</a></li>
				<li><a href="#">Contato</a></li>
			</ul>
		</div>
		<br>
		<h3>Adiciona contatos</h3>
		<br><br>
		<form action="adicionaContato">
			<div class="form-group">
				Nome: <input type="text" class="form-control" name="nome" autocomplete="off" /><br /> 
				Data Nascimento: <input type="text"	class="form-control" name="dataNascimento" autocomplete="off" /><br />
				<input type="submit" class="btn btn-default" value="Gravar" />
			</div>
		</form>
	</div>
</body>
</html>