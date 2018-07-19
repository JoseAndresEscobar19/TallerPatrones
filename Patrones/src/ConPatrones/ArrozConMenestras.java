/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConPatrones;

/**
 *
 * @author Administrador
 */
public class ArrozConMenestras extends IArticulo{

   public ArrozConMenestras(){
        super();
    }
    
    public ArrozConMenestras(String nombre, String descripcion, double precio, String tipo) {
		// Recuerde que en composite se debe tener una lista/arreglo de articulos simples
        super(nombre, descripcion, precio, tipo);
    }
}
