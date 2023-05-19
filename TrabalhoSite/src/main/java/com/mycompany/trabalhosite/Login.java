package com.mycompany.trabalhosite;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Vitor
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String mensagem;

        if (email.equals("admin@admin.com") && senha.equals("admin")) {
            session.setAttribute("email", email);
            session.setAttribute("senha", senha);
            response.sendRedirect("/TrabalhoSite//pagina1");
        } else {
            request.setAttribute("mensagem", "E-mail ou senha incorreto.");
            request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
        }
        if (email == null || senha == null) {
            response.sendRedirect("Login.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}