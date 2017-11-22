/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 * 
 * @author Juan David Villena Gil
 */
public class Ejercicio0307 {

  public static void main(String[] args) {
    System.out.println("Introduzca el valor del array desde el valor 0 al valor 9");
    int[] simbolo = new int[10];
      simbolo[0] = Integer.parseInt(System.console().readLine());
      simbolo[1] = Integer.parseInt(System.console().readLine());
      simbolo[2] = Integer.parseInt(System.console().readLine());
      simbolo[3] = Integer.parseInt(System.console().readLine());
      simbolo[4] = Integer.parseInt(System.console().readLine());
      simbolo[5] = Integer.parseInt(System.console().readLine());
      simbolo[6] = Integer.parseInt(System.console().readLine());
      simbolo[7] = Integer.parseInt(System.console().readLine());
      simbolo[8] = Integer.parseInt(System.console().readLine());
      simbolo[9] = Integer.parseInt(System.console().readLine());
      System.out.println("--------------------------------------------------------------------");
    for (int i = 9;i >= 0;i--) {
      System.out.println(simbolo[i]);
    }
  }
}
