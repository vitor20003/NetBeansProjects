<%-- 
    Document   : Login
    Created on : 10/05/2023, 20:11:06
    Author     : Vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style>
            body{
                background: url(https://img.r7.com/images/elon-musk-calvo-viral-twitter-compra-25042022173840869?dimensions=960x720);
                background-size: 500px;
                text-align: center;
            }
            form{
                font-size: 25px;
                font-family: Arial, Helvetica, sans-serif;
                background: rgb(95,158,160);
                border: 2px solid #f1f1f1;
            }
            .if2{
                text-align: center;
                font-size: 15px;
                font-family: Arial, Helvetica, sans-serif;
                background: rgb(95,158,160);
                border: 2px solid #f1f1f1;
            }
            input[type=submit], [type=reset]{
                background-color: #04AA6D;
                color: white;
                padding: 12px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;

            }
            input[type=submit]:hover{
                background-color: #45a049;
            }
            input[type=reset]:hover{
                background-color: #45a049;
            }
        </style>
    </head>
    <body>
        <div class ="if2">
            <% if (request.getAttribute("mensagem") != null) {
                    out.print("<h2>" + request.getAttribute("mensagem") + "</h2>");
                }%>
        </div>
        <form action="<%= request.getContextPath()%>/Login" method="POST">
            <br>
            <b>Email :</b> <input type="text" name="email"> <br>
            <br>
            <b>Senha:</b> <input type="password" name="senha"> <br>
            <br>
            <input type="submit" value="Entrar"> <input type="reset">
        </form>
    </body>
</html>