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
public class Lehrer extends Person {
    public Lehrer(String vorname, String nachname, String kurzzeichen){
        super(vorname, nachname);
        
        setId(kurzzeichen);
    }
    
    public String getKurzzeichen(){
        return getId();
    }

    @Override
    public void setKatalogNummer(int nummer){
    }
}
