/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfete;

import Classes.Comanda;
import java.util.ArrayList;

/**
 *
 * @author delim
 */
public interface ComandaInt {
   public ArrayList<Comanda> getComenziFarmacie(String cod,String Oras);
     public ArrayList<Comanda> getComenziFarmacieLuna(ArrayList <Comanda> lista);
     
}
