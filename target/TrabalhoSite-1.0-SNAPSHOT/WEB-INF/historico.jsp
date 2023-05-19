<%-- 
    Document   : historico
    Created on : 17 de mai. de 2023, 11:44:35
    Author     : user
--%>

<%@page import="com.mycompany.trabalhosite.historicoo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Histórico</title>
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
        </style>
    </head>
    <body>
        <div class="header">
            <a href="${pageContext.request.contextPath}/pagina1" class="logo">Home</a>
            <div class="header-right">
                <a href="${pageContext.request.contextPath}/pagina2">Página 2</a>
                <a href="${pageContext.request.contextPath}/calculadora">Cálculadora</a>
                <a class = "active" href="${pageContext.request.contextPath}/historico">Histórico</a>
                <a href="${pageContext.request.contextPath}/sair">Sair</a>
                <div class = "usu">
                    <%= session.getAttribute("email")%>
                    <%= session.getAttribute("senha")%>
                </div>
            </div>
        </div>
        <div style="padding-left:20px">
            <h1>Histórico</h1>
            <% historicoo histor = (historicoo) session.getAttribute("historicoo"); %>
            <%for (String h : histor.getHistoricoo()) {%>
            <%=h%><br> <%}%>
        </div>
    </body>
</html>
