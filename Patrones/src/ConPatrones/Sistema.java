/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConPatrones;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Sistema {
    public static void main(String[] args) {
//		El mismo sistema se lo va vender a 2 locales de comida.
		Scanner scanner = new Scanner(System.in);
		
		String menu = "  *** Sistema para preparar comida autom�ticamente ***\n"
				+ "1. Esquina de Ales\n"
				+ "2. Pollos Gus\n"
				+ "3. Salir del sistema\n"
				+ "Seleccione una opci�n:";
		System.out.println(menu);
		String opcion = scanner.nextLine();
		while (! opcion.equals("3")){
			if (opcion.equals("1")){
				System.out.println("Bienvenido a la Esquina de Ales");
//				Preparar un Arroz con menestra y pollo
                EsquinaDeAles esquina=new EsquinaDeAles();
                
                IArticulo arrozConMenestras=esquina.fabricarArrozConMenestra();
                esquina.fabricarPolloAsado();
			}else if(opcion.equals("2")){
				System.out.println("Bienvenido a Pollos Gus");
//				Preparar un Arroz con menestra y pollo
			}else{
				System.out.println("Opci�n incorrecta");
			}
			System.out.println(menu);
			opcion = scanner.nextLine();
			
		}
		System.out.println("Se cerr� el programa");
	}
}
