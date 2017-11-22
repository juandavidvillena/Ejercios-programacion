/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 * 
 * @author Juan David Villena Gil
 */
public class Ejercicio0507 {

  public static void main(String[] args) {
    System.out.println("Introduzca los valores 10 del array"); 
    long[] n = new long[11];
    for (int i = 0;i < 10;i++) {
      n[i] = Long.parseLong(System.console().readLine());
    }
    System.out.println("---------------------------------------------------------");
    long maximo = Long.MIN_VALUE;
    long minimo = Long.MAX_VALUE;
    int suma = 0;
    
    for(int i = 0; i < 10; i++) {
      long numero = n[i];
      
      if (numero > maximo) {
        maximo = numero;
      }
      if (numero < minimo) {
        minimo = numero;
      }
      
    }
    System.out.println("el valor máximo es " + (maximo)  + " el valor minimo es " + (minimo));
    System.out.println("-----------------------------------------------------------");
    for (int i = 10;i >= 0;i--) {
      if(n[i] == maximo) {
        System.out.print("maximo ");
      }
      if(n[i] == minimo) {
        System.out.print("Minimo ");
      }
      System.out.println(n[i]);
    }
    
  }
}
