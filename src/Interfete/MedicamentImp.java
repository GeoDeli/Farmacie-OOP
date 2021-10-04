/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfete;

import Classes.Medicament;
import Conectare.Conectare;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author delim
 */
public class MedicamentImp implements MedicamentInt{

    @Override
    public Medicament getMedByID(String cod) {
      Medicament m=new Medicament();
        CategorieImp cat = new CategorieImp();
        try {
            Connection con=Conectare.getConnection();
           
            String query="Select * from Medicamente where Cod_Med=\""+cod+"\""; //querry
            Statement statement;
            statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                m.setNume(resultSet.getString("Nume"));
                m.setCod_Med(resultSet.getString("Cod_Med"));
                m.setCod_Cat(cat.getCategorieName(resultSet.getString("Cod_Cat")));
            }
            resultSet.close();
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(CategorieImp.class.getName()).log(Level.SEVERE, null, ex);
        }
            return m;
    }
    
     public ArrayList<Medicament> getList() {
       ArrayList<Medicament> list = new ArrayList<Medicament>();
        
            
        try {
            Connection con = Conectare.getConnection();
            String sql = "SELECT * FROM Medicamente ";
            Statement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery(sql);
            
            while(resultSet.next()){
                Medicament m = new Medicament();
                m.setNume(resultSet.getString("Nume"));
                m.setCod_Med(resultSet.getString("Cod_Med"));
                m.setCod_Cat(resultSet.getString("Cod_Cat"));
                list.add(m);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Eroare la preluarea datelor");
        }
        return list;
  
    }
    
}
