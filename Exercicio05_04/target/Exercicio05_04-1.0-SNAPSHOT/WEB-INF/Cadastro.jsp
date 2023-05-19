<%-- 
    Document   : Cadastro
    Created on : 5 de abr. de 2023, 20:01:18
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
          <% if(request.getAttribute("mensagem") !=null){
            out.print("<h2>" + request.getAttribute("mensagem")+"</h2>");
            }%>
       <form action="<%= request.getContextPath() %>/ServletCadastro" method="POST">
Email : <input type="text" name="email"> <br>
Senha: <input type="password" name="senha"> <br>
Nome Completo : <input type="text" name="nome"> <br>
Data de nascimento : <input type="date" name="data"> <br>

<input type="submit" value="Enviar"> 
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
