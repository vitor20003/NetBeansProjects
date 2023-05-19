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
@WebServlet(name = "calculadora", urlPatterns = {"/calculadora"})
public class calculadora extends HttpServlet {

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

        histo.addPage(" http://localhost:8080/TrabalhoSite/calculadora");

        session.setAttribute("historicoo", histo);
        request.getRequestDispatcher("/WEB-INF/calculadora.jsp").forward(request, response);
           
        } else {
            response.sendRedirect("http://localhost:8080/TrabalhoSite/Login");
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String exer1 = request.getParameter("exer1");
        String exer2 = request.getParameter("exer2");
        String exer3 = request.getParameter("exer3");
        String exer4 = request.getParameter("exer4");
        String trb1 = request.getParameter("trabalho1");
        String trb2 = request.getParameter("trabalho2");

        String resultado;
        if (exer1 != null && exer2 != null && exer3 != null && exer4 != null && trb1 != null && trb2 != null) {

            int soma = (Integer.parseInt(exer1) + Integer.parseInt(exer2) + Integer.parseInt(exer3)
                    + Integer.parseInt(exer4) + Integer.parseInt(trb1) + Integer.parseInt(trb2)) / 6;
            request.setAttribute("resultado", "Sua média é: " + soma);
            request.getRequestDispatcher("/WEB-INF/calculadora.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
