/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfete;

import Classes.Farmacie;
import java.util.ArrayList;

/**
 *
 * @author delim
 */
public interface FarmacieInt {
    public ArrayList<Farmacie> cautaInOras(String oras);
    public Farmacie getFarmacie(String cod);
      public Farmacie getFarmacieNume(String nume, String oras);
}
