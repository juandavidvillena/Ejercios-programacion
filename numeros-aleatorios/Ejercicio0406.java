/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
 * por espacios.
 * @author Juan David Villena Gil
 */
public class Ejercicio0406 {
  
  public static void main(String[] args) {
    for (int cantidadNumero = 20;cantidadNumero >= 0;cantidadNumero--) {
      System.out.print(((int)(Math.random()*11)) + " ");
    }
  }
}


