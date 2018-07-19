/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import SinPatrones.Articulo;


/**
 *
 * @author CltControl
 */
public interface FabricaLocales {
    
    
    public Articulo fabricarPolloAsado();

    public Articulo fabricarArrozConMenestra();
}
