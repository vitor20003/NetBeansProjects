

package com.mycompany.estoque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitor
 */
public class Estoque {

    public static void main(String[] args) {
       {
            try {
                String user = "root";
                String password = "";
                String url = "jdbc:mysql://localhost:3306/estoque2";
                Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                buscarID busca = new buscarID();
                Produto produto = new Produto();
                Scanner scann= new Scanner (System.in);
        System.out.println("Se deseja verificar todos os produtos do estoque digite: 1");
        System.out.println("Se deseja inserir dados digite: 2");
        System.out.println("Se deseja verificar um produto por id digite: 3");
        System.out.println("Se deseja remover algum produto digite: 4");
        System.out.println("Se deseja sair da operação digite: 0");  
        System.out.println("Se deseja aLterar algum produto digite: 5"); 
                int valor= 1;
                
                ResultSet contagem=  stmt.executeQuery("SELECT * FROM produtos ;");
               
           
            while(valor!= 0){ 
                valor= scann.nextInt();
            switch (valor){
               
            case 1:
                String veri =("SELECT * FROM produtos where 1");
                PreparedStatement pstmp = con.prepareStatement(veri);
                ResultSet veriprod = pstmp.executeQuery();
                while(veriprod.next()){
                
                    System.out.println("nome: " + veriprod.getString("nome"));
                System.out.println("preço: " + veriprod.getString("preco"));
                System.out.println("tipo: " + veriprod.getString("tipo"));
                    System.out.println();
                        
                }
                     
                  
                break;
                    
                
               
            case 2:
                String ins =("INSERT INTO produtos(nome,preco,tipo) values (?,?,?)");
                PreparedStatement stmp = con.prepareStatement(ins);
                stmp.setString(1, scann.next());
                stmp.setDouble(2, scann.nextDouble());
                stmp.setString(3, scann.next());
                
                stmp.execute();
                
                    
                break;   
                
            case 3:
                System.out.println("Digite o ID ");
                String id = scann.next();
                Produto prod = busca.Buscaid(id, con);
                System.out.println("nome : " + prod.getNome() );
                System.out.println("preco : " + prod.getPreco());
                System.out.println("Tipo : " + prod.getTipo());
             
                
             
            
                
                break;
            case 4:
                String delete =("Delete from produtos where id = ?");
                PreparedStatement deletestmp = con.prepareStatement(delete);
                deletestmp.setInt(1, scann.nextInt());
                
                deletestmp.executeUpdate();
               break; 
                
            case 5:
                
                String update =("UPDATE produtos set nome = ?, preco= ?, tipo= ? WHERE id = ? ");
                PreparedStatement stmpup = con.prepareStatement(update);
               stmpup.setString(1, scann.next());
               stmpup.setDouble(2, scann.nextDouble());
               stmpup.setString(3, scann.next());
                System.out.println("Digite o ID do produto que deseja alterar");
               stmpup.setInt(4, scann.nextInt());
           
                stmpup.executeUpdate();
                break;
            }     
            }   
                 
            } catch (SQLException ex) {
                Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
                
            }
       
       }
    
      
                   
} 

}
