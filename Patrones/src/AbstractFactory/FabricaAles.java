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
public class FabricaAles implements FabricaLocales {

    public FabricaAles(){
        
    }
    
    @Override
    public Articulo fabricarPolloAsado() {
        Articulo articulo = new Articulo();
	return articulo;
    }

    @Override
    public Articulo fabricarArrozConMenestra() {
        Articulo articulo = new Articulo();
	return articulo;
    }
    
    
}
