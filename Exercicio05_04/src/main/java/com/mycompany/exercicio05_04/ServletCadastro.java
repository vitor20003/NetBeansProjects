/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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
@WebServlet(name = "ServletCadastro", urlPatterns = {"/ServletCadastro"})
public class ServletCadastro extends HttpServlet {

  

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
    
    
     
        
    
        request.getRequestDispatcher("/WEB-INF/Cadastro.jsp").forward(request, response);
    
       
    }
    
    
    
    

    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
       HttpSession session = request.getSession();
       String email = request.getParameter("email");
       String senha = request.getParameter("senha");
       String nome = request.getParameter("nome");
       String data = request.getParameter("data");
       String cadastro = request.getParameter("parametro");
       Object emaill = session.getAttribute("email");
       Object senhaa = session.getAttribute("senha");
       
     
       
    if (cadastro != null && cadastro.equals("redirect")) {
        request.getRequestDispatcher("/WEB-INF/Cadastro.jsp").forward(request, response);
        return; 
    }
   
 
    if (email != null && !email.trim().isEmpty() && 
        senha != null && !senha.trim().isEmpty() && 
        nome != null && !nome.trim().isEmpty() &&
        data != null && !data.trim().isEmpty() 
         ) {
        request.getRequestDispatcher("/WEB-INF/Dados.jsp").forward(request, response);
    } else {
       
        request.setAttribute("mensagem", "Todos os campos são obrigatórios.");
        request.getRequestDispatcher("/WEB-INF/Cadastro.jsp").forward(request,
response);
        
    }
    
    
     
       
    }   
    
    
    

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
