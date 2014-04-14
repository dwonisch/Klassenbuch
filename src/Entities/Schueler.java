/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author Daniel
 */
public class Schueler extends Person {
    public Schueler(String vorname, String nachname, String klasse){
        super(vorname, nachname);
        this.klasse = klasse;
    }
    
    private final String klasse;
    
    public String getKlasse(){
        return klasse;
    }
    
    public int getKatalogNr(){
        return katalogNr;
    }
    
    public void setKatalogNr(int katalogNr){
        this.katalogNr = katalogNr;
    }
}
