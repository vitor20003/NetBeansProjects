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
@WebServlet(name = "historico", urlPatterns = {"/historico"})
public class historico extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();
        if (session.getAttribute("email") != null && session.getAttribute("senha") != null) {
            Object hist = session.getAttribute("historicoo");
        historicoo histo;
        if (hist != null) {
            histo = (historicoo) hist;

        } else {
            histo = new historicoo();

        }

        histo.addPage(" http://localhost:8080/TrabalhoSite/historico");

        session.setAttribute("historicoo", histo);
        request.getRequestDispatcher("/WEB-INF/historico.jsp").forward(request, response);
        } else {
            response.sendRedirect("http://localhost:8080/TrabalhoSite/Login");
        }

        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
