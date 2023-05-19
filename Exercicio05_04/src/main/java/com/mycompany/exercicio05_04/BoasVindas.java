
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
@WebServlet(name = "BoasVindas", urlPatterns = {"/BoasVindas"})
public class BoasVindas extends HttpServlet {

    
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("/WEB-INF/BoasVindas.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    HttpSession session = request.getSession();
     Object email = session.getAttribute("email");
     Object senha = session.getAttribute("senha");
     
      
       
    if (email.equals("admin@admin.com") && senha.equals("admin")) {
	request.getRequestDispatcher("/WEB-INF/Cadastro.jsp").forward(request, response);
              
      }else{
         request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request,
response);
    
    }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
