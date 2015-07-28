/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G.Meta;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author paolo
 */
public class DiedEventSource {
    private Vector _listeners = new Vector();
    
    public void addListener(IDiedEvent value){
        _listeners.add(value);
    }
    
    public void removeListener(IDiedEvent value){
        _listeners.remove(value);
    }
    
    public void fireEvent(){
    
        if(_listeners != null && !_listeners.isEmpty())
        {
            for(Object pippo : _listeners)
            {
//                IDiedEvent listener = (IDiedEvent)pippo;
//                listener.Died();
                ((IDiedEvent)pippo).Died();
            }
            
//            Enumeration e = _listeners.elements();
//            while(e.hasMoreElements())
//            {
//                IDiedEvent listener =(IDiedEvent)e.nextElement();
//                listener.Died();
//            }
        }
        
    }
}
