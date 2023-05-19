<%-- 
    Document   : Dados
    Created on : 5 de abr. de 2023, 20:01:26
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
              Nome: <%= request.getParameter("nome") %><br>
      Email: <%= request.getParameter("email") %><br>
      Senha: <%= request.getParameter("senha") %><br>
      Data de Nascimento: <%= request.getParameter("data") %><br>
      <a href="http://localhost:8080/Exercicio05_04//Remover">remover</a>
      <br>
<br>
 <%= session.getAttribute( "email" ) %>
 <br>
 <br>
 <br>
  <%= session.getAttribute( "senha" ) %>
    </body>
</html>
