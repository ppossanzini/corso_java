/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Vector;

/**
 *
 * @author paolo
 */
public class Lista
        implements ILista {

    private Vector _items = new Vector();

    @Override
    public void Add(Object item) {
        _items.add(item);
    }

    @Override
    public void Remove(Object item) {
        _items.remove(item);
    }

    @Override
    public Object[] Search(ISearch filter) {
        Vector result = new Vector();
        if (_items != null && !_items.isEmpty() && filter != null) {
            for (Object item : _items) {
                if(filter.IsValid(item))
                {
                    result.add(item);
                }
            }
        }
        return result.toArray();
    }

}
