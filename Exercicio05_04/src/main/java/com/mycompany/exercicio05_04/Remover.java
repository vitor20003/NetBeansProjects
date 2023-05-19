
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
@WebServlet(name = "Remover", urlPatterns = {"/Remover"})
public class Remover extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
        
         
          HttpSession session = request.getSession();
    
           session.removeAttribute("email");
        session.removeAttribute("senha");
          response.sendRedirect("http://localhost:8080/Exercicio05_04/NewServlet");
         
    
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      
       
    }
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
