/* 1 donde escribo el comportamiento 
    2 donde escribo lo que quiero que se haga realmente
    3 siguiente paso que tengo que hacer en la estructura de mi codigo
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotema9;

/**
 *
 * @author david
 */
public class EjercicioTema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caballo pegaso = new Caballo();
        System.out.println("hola soy pegaso");
        pegaso.come();
        pegaso.relincha();
        Caballo homer = new Caballo();
        homer.cabalga();
    }
    
}
