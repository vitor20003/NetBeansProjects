
package com.mycompany.estoque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vitor
 */
public class buscarID {
    ResultSet result;
    PreparedStatement stmt;
    public Produto Buscaid(String id, Connection con){
        try{
        Produto prod = new Produto();
        stmt= con.prepareStatement("Select * FROM produtos where id =?");
        stmt.setString(1, id);
        result= stmt.executeQuery();
        if(result.next()){
            prod.setId(result.getInt("id"));
           prod.setNome(result.getString("nome"));
           prod.setPreco(result.getDouble("preco"));
           prod.setTipo(result.getString("tipo"));
        
           return prod;
        } else{
            return null;
        
        }
        
        }catch (SQLException ex){
        
        return null;
        }
    
    }
}
