/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media de esos números
 *
 * @author Juan David Villena Gil
 */
public class Ejercicio0506 {
  
  public static void main(String[] args) {
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int numero= 0;
    
    for (int i = 50; i > 0; i--) {
      numero = (int)(Math.random()*100) + 100;
      System.out.print(numero + " ");
      suma += numero;
      
      if (numero < minimo) {
        minimo = numero;
      }
      
      if (numero > maximo) {
        maximo = numero;
      }
    }
    System.out.println("\nEl valor mínimo: " + minimo + "\nEl valor máximo: " + maximo);
    System.out.print("La media: " + suma / 50);
  }
}

