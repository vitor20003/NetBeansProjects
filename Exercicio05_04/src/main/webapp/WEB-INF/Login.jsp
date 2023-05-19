<%-- 
    Document   : Login
    Created on : 5 de abr. de 2023, 20:00:41
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
        <form action="<%= request.getContextPath() %>/NewServlet" method="POST">
            Email : <input type="text" name="email">    <br>
Senha: <input type="password" name="senha">  <br>

<input type="submit" value="Enviar"> 
<br>
<br>
 <%= session.getAttribute( "email" ) %>
 <br>
 <br>
 <br>
 
  <%= session.getAttribute( "senha" ) %>
</form>
    </body>
</html>
