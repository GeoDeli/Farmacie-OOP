/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfete;

import Classes.Comanda;
import Classes.Farmacie;
import Classes.Stoc;
import Conectare.Conectare;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author delim
 */
public class StocImp implements StocInt{
     public ArrayList<Stoc> listaStocuriMedicament(String Cod_M)
     {
        ArrayList<Stoc> lista= new ArrayList<Stoc> ();
      try {        Connection con=Conectare.getConnection();
        
       String query="Select * from Stoc where Cod_Med=\""+Cod_M+"\""; //querry
         Statement statement;  
                statement = con.createStatement();
         ResultSet resultSet = statement.executeQuery(query); 
         while(resultSet.next())
         {
             Stoc c=new Stoc();
            c.setCod_f(resultSet.getString("Cod_F"));
            c.setCantitate(Integer.parseInt(resultSet.getString("Cantitate")));
            c.setCod_med(resultSet.getString("Cod_Med"));
              lista.add(c);     
         }
        
         resultSet.close();
            statement.close();
            
    }   catch (SQLException ex) {
            Logger.getLogger(FarmacieImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(FarmacieImp.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
         return lista;
     }
    
}
