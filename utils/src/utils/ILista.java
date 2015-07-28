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
public interface ILista {
    public void Add(Object item);
    public void Remove(Object item);
    public Object[] Search(ISearch filter);
}
