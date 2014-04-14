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
public class Person {
    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }
    
    private final String vorname;
    private final String nachname;
    
    public String getVorname(){
        return vorname;
    }
    
    public String getNachname(){
        return nachname;
    }
}
