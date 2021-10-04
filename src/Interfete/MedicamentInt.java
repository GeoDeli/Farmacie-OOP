/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfete;

import Classes.Medicament;
import java.util.ArrayList;

/**
 *
 * @author delim
 */
public interface MedicamentInt {
    public Medicament getMedByID(String cod);
     public ArrayList<Medicament> getList();
}
