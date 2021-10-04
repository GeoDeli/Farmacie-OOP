/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfete;

import Classes.Comanda;
import Classes.Farmacie;
import Conectare.Conectare;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author delim
 */
public class ComandaImp implements ComandaInt {

    @Override
    public ArrayList<Comanda> getComenziFarmacie(String Nume, String Oras) {
        FarmacieImp fimp=new FarmacieImp();
        Farmacie f= fimp.getFarmacieNume(Nume,Oras);
      //      LocalDateTime ldt = LocalDateTime.now();
    //  DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).format(data_livrare);
        ArrayList<Comanda> lista= new ArrayList<Comanda> ();
      try {        Connection con=Conectare.getConnection();
        
       String query="Select * from comanda where Cod_F=\""+f.getCod()+"\""; //querry
         Statement statement;  
                statement = con.createStatement();
         ResultSet resultSet = statement.executeQuery(query); 
         while(resultSet.next())
         {
             
             Comanda c=new Comanda();
            c.setCod_f(resultSet.getString("Cod_F"));
             c.setNume( resultSet.getString("nume")); 
             c.setLivrare(resultSet.getDate("Data_Livrare"));
             c.setMed_cant(resultSet.getString("Med_Cant"));
             c.setPret(resultSet.getDouble("Pret"));
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

    @Override
    public ArrayList<Comanda> getComenziFarmacieLuna(ArrayList<Comanda> lista) {
       
        return null;
       
    }
    

 
    
}
