
package com.mycompany.exercicio05_04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
      
       
 if ( email.equals("admin@admin.com") && senha.equals("admin")) {
     
     session.setAttribute("email", email);
      session.setAttribute("senha", senha);
        
        response.sendRedirect("http://localhost:8080/Exercicio05_04//BoasVindas");
    } else {
        request.setAttribute("mensagem", "Insira os dados corretamente");
        request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
    }
     
       
       Object emaiil = session.getAttribute("email");
       Object senhha = session.getAttribute("senha");
    
    }

    


    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
