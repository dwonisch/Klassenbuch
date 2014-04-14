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
public abstract class Person implements Comparable<Person> {
    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
        setName(vorname, nachname);
    }
    
    private final String vorname;
    private final String nachname;
    private String name;
    protected int katalogNr;
    private String id;

    
    public String getVorname(){
        return vorname;
    }
    
    public String getNachname(){
        return nachname;
    }
    
    private void setName(String vorname, String nachname){
        name = String.format("%s %s", nachname, vorname);
    }
    
    public void setKatalogNummer(int nummer){
        katalogNr = nummer;
        setId(Integer.toString(katalogNr));
    }
    
    public String getId(){
        return this.id;
    }
    
    protected void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s", getVorname(), getNachname());
    }
}
