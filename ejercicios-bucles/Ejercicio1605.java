/**
 * Escribe un programa que diga si un número introducido por teclado
 * es o no primo. Un número primo es aquel que sólo es divisible entre
 * él mismo y la unidad.
 * 
 * @author Juan David Villena Gil
 *
 */
public class Ejercicio1605 {

  public static void main(String[] args) {
            
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());

    boolean primo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        primo = false;
      }
    }
        
    if (primo) {
      System.out.println("Es primo.");
    } else {
      System.out.println("No es primo.");
    }

  }
}
