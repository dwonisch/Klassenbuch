/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collections;

import Entities.Person;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Daniel
 */
public class PersonenModell extends AbstractListModel {
    
    private List<Person> liste = new LinkedList<>();
    
    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Object getElementAt(int index) {
        return liste.get(index);
    }
    
    public void add(Person person){
        if(!liste.contains(person)){
            liste.add(person);
            refresh();
        }
    }
    
    public void remove(Person person){
        if(liste.contains(person)) {
            liste.remove(person);
            refresh();         
        }
    }
    
    public void refresh(){
        Collections.sort(liste);

        for(int i=0; i < liste.size(); i++){
            liste.get(i).setKatalogNummer(i+1);
        }
        super.fireContentsChanged(liste, 0, liste.size());
    }
}
