/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author delim
 */
public class Comanda {

    public int getComanda() {
        return comanda;
    }

    public void setComanda(int comanda) {
        this.comanda = comanda;
    }

    public String getCod_f() {
        return cod_f;
    }

    public void setCod_f(String cod_f) {
        this.cod_f = cod_f;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Date getLivrare() {
        return data_livrare;
    }

    public void setLivrare(Date data_livrare) {
  
        try {
            this.data_livrare = new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(data_livrare));
        } catch (ParseException ex) {
            Logger.getLogger(Comanda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getMed_cant() {
        return med_cant;
    }

    public void setMed_cant(String med_cant) {
        this.med_cant = med_cant;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }
    int comanda;
    String cod_f;
    String nume;
    Date data_livrare;
    String med_cant;
    Double pret;
    
}
