/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G.Meta;

import java.util.Vector;

/**
 *
 * @author paolo
 */
public class Place {

    private Vector _characters = new Vector();

    public void addCharacter(Character value) {
        _characters.add(value);
        value.DiedEvent.addListener(()->{
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });        
        
    }

}
