/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author paolo
 */
public class test {
    public static void main(String[] args)
    {
        Lista l = new Lista();
        
        Character c = new Character();
        c.Name = "Paolo";
        c.Description = "personaggio 1";
        c.Endurance = 5;
        c.Strength = 42;
        
        l.Add(c);
        
        l.Search(new ISearch(){
            @Override
            public boolean IsValid(Object item) {
             Character cc = (Character)item;
             if(cc.Endurance>3) return true;
             return false;
            }
        });
        
        l.Search(i -> ((Character)i).Endurance>3 && ((Character)i).Strength>40);
        
    }
}
