<%-- 
    Document   : calculadora
    Created on : 16 de mai. de 2023, 23:11:53
    Author     : Vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
        <style>
            body {
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }

            .header {
                overflow: hidden;
                background-color: #f1f1f1;
                padding: 20px 10px;
            }
            h1, h2 {
                color: #333;
                margin-bottom: 20px;
            }
            input[type="number"] {
                width: 100px;
            }
            .notas{
                display: block;
                margin-bottom: 10px;
            }
            .header a, .usu {
                float: left;
                color: black;
                text-align: center;
                padding: 12px;
                text-decoration: none;
                font-size: 18px;
                line-height: 25px;
                border-radius: 4px;
            }

            .header a.logo {
                font-size: 25px;
                font-weight: bold;
            }

            .header a:hover {
                background-color: #ddd;
                color: black;
            }
            .header a.active{
                border-bottom: 3px solid red;
            }
            .header-right {
                float: right;
            }
            @media screen and (max-width: 500px) {
                .header a{
                    float: none;
                    display: block;
                    text-align: left;
                }

                .header-right {
                    float: none;
                }
            }
            input[type=submit]{
                padding: 10px 20px;
                background-color:   #f1f1f1;
                color: black;
                border: none;
                cursor: pointer;
            }
            input[type=submit]:hover{
                background-color: #ddd;
                color: black;
            </style>
        </head>
        <body>
            <div class="header">
                <a href="${pageContext.request.contextPath}/pagina1" class="logo">Home</a>
                <div class="header-right">
                    <a href="${pageContext.request.contextPath}/pagina2">Página 2</a>
                    <a class = "active" href="${pageContext.request.contextPath}/calculadora">Cálculadora</a>
                    <a href="${pageContext.request.contextPath}/historico">Histórico</a>
                    <a href="${pageContext.request.contextPath}/sair">Sair</a>
                    <div class = "usu">
                        <%= session.getAttribute("email")%>
                        <%= session.getAttribute("senha")%>
                    </div>
                </div>
            </div>
            <div style="padding-left:20px">
                    <h1>Calculadora</h1>
                    <h2>Insira as notas dos exercicios</h2>
                    <form action="<%=request.getContextPath()%>/calculadora" method="POST">
                        <div class="notas">
                            Nota 1: <input type="number" name="exer1"> <br>
                            Nota 2: <input type="number" name="exer2"> <br>
                            Nota 3: <input type="number" name="exer3"> <br>
                            Nota 4: <input type="number" name="exer4"> <br>

                            <h2>Insira a nota dos trabalhos</h2>
                            Trabalho 1: <input type="number" name="trabalho1"> <br>
                            Trabalho 2: <input type="number" name="trabalho2"> <br>
                        </div>
                        <input type="submit" value="Enviar"> 
                    </form>
                    <%
                        if (request.getAttribute("resultado") != null) {
                            String resultado = (String) request.getAttribute("resultado");
                    %>
                    <h2><%= resultado%></h2>
                    <% }%>
                </div>
        </html>