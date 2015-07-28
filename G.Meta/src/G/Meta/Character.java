/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G.Meta;

/**
 *
 * @author paolo
 */
public class Character 
implements ICharacter
{
    
    DiedEventSource DiedEvent = new DiedEventSource();

    @Override
    public void Cura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Muoro(){
        this.DiedEvent.fireEvent();
    }

    
    
}
