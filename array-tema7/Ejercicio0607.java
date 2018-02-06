/**
 *Tema 7 Array
 *Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
 *elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
 *el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 *posición 0. Finalmente, muestra el contenido del array.
 *
 * @author Juan David Villena
 */
public class Ejercicio0607 {

  public static void main(String[] args) {
    
      int[] numero = new int[15];
      int i = 0;
      
      System.out.println("Introduzca los 15 numeros:");
      for (i = 0; i < 15; i++) {
        numero[i] = Integer.parseInt(System.console().readLine());
      }
      System.out.println();
      System.out.println("Array original:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
      int aux = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = aux;
      System.out.println("\nArray rotado a la derecha una posición:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
  }
}
