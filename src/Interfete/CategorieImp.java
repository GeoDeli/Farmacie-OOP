/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfete;

import Classes.Comanda;
import Conectare.Conectare;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author delim
 */
public class CategorieImp implements CategorieInt{

    @Override
    public String getCategorieName(String cod) {
         String nume="";
        try {
            Connection con=Conectare.getConnection();
           
            String query="Select * from categorie where Cod_Cat=\""+cod+"\""; //querry
            Statement statement;
            statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                nume=resultSet.getString("Nume");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(CategorieImp.class.getName()).log(Level.SEVERE, null, ex);
        }
            return nume;
    }
    
}
