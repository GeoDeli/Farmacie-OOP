/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfete;

import Classes.Farmacie;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Conectare.Conectare;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author delim
 */
public class FarmacieImp implements FarmacieInt {

    @Override
    public ArrayList<Farmacie> cautaInOras(String oras) {
        
        ArrayList<Farmacie> lista= new ArrayList<Farmacie> ();
      try {        Connection con=Conectare.getConnection();
        
       String query="Select * from `farmacie-tab` where oras=\""+oras+"\""; //querry
         Statement statement;  
           
                statement = con.createStatement();
         ResultSet resultSet = statement.executeQuery(query); 
        
         while(resultSet.next())
         {
             Farmacie f=new Farmacie();
             f.setCod(resultSet.getString("Cod_F"));
             f.setNume( resultSet.getString("nume")); 
             f.setAdresa(resultSet.getString("Adresa"));
             f.setTelefon(resultSet.getString("Telefon"));
             f.setOras(resultSet.getString("Oras"));
              lista.add(f);     
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
    public Farmacie getFarmacie(String cod) {
             Farmacie f=new Farmacie();
        try {      
         Connection    con=Conectare.getConnection();
       
       String query="Select * from `farmacie-tab` where Cod_F=\""+cod+"\""; //querry
         Statement statement;  
                statement = con.createStatement();
         ResultSet resultSet = statement.executeQuery(query); 
         while(resultSet.next())
         {
             f.setCod(resultSet.getString("Cod_F"));
             f.setNume( resultSet.getString("nume")); 
             f.setAdresa(resultSet.getString("Adresa"));
             f.setTelefon(resultSet.getString("Telefon"));
             f.setOras(resultSet.getString("Oras"));
         }
        
         resultSet.close();
            statement.close();
          
             } catch (Exception ex) {
            Logger.getLogger(FarmacieImp.class.getName()).log(Level.SEVERE, null, ex);
        }
          return f;
    }

    @Override
    public Farmacie getFarmacieNume(String nume, String Oras) {
          Farmacie f=new Farmacie();
        try {      
         Connection    con=Conectare.getConnection();
       
       String query="Select * from `farmacie-tab` where Nume=\""+nume+"\" and Oras=\""+Oras+"\""; //querry
         Statement statement;  
                statement = con.createStatement();
         ResultSet resultSet = statement.executeQuery(query); 
         while(resultSet.next())
         {
             f.setCod(resultSet.getString("Cod_F"));
             f.setNume( resultSet.getString("nume")); 
             f.setAdresa(resultSet.getString("Adresa"));
             f.setTelefon(resultSet.getString("Telefon"));
             f.setOras(resultSet.getString("Oras"));
         }
        
         resultSet.close();
            statement.close();
          
             } catch (Exception ex) {
            Logger.getLogger(FarmacieImp.class.getName()).log(Level.SEVERE, null, ex);
        }
          return f;
    }
    
}
