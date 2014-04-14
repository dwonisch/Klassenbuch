/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collections;

import Entities.Person;
import java.util.LinkedList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Daniel
 */
public class PersonenModell extends AbstractListModel {
    
    private final LinkedList<Person> liste = new LinkedList<>();
    
    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Object getElementAt(int index) {
        return liste.get(index);
    }
    
}
