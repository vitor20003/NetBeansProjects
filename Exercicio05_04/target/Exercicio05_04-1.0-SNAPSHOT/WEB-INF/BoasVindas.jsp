<%-- 
    Document   : BoasVindas
    Created on : 5 de abr. de 2023, 20:00:57
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
   
        <h1>Bem Vindo!</h1>
        <br>
        <br>
        
    <form action="/Exercicio05_04/ServletCadastro" method="post">
    <input type="hidden" name="parametro" id="parametro" value="">
   
    <button type="submit" onclick="enviarParametro()">Cadastro</button>
    

    </form>
        <form action="/Exercicio05_04/Remover" method="get">
            <br>
        <a href="http://localhost:8080/Exercicio05_04//Remover">remover</a>
        </form>
        <br>
        <br>
        <%= session.getAttribute( "email" ) %>
        <br>
         <br>
          <br>
        <%= session.getAttribute( "senha" ) %>
          <% Object emaiil = session.getAttribute("email");
       Object senhha = session.getAttribute("senha");
        if(emaiil.equals("admin@admin.com")&& senhha.equals("admin"))
        {
        %>  
        <script>
        
        function enviarParametro() {
          var parametro = "redirect"; 
          document.getElementById("parametro").value = parametro;
          
         
        }
       
        </script>
        <%}
        else{
         response.sendRedirect("http://localhost:8080/Exercicio05_04/NewServlet");
                }%>

    </body>
</html>
