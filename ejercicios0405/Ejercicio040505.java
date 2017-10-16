/**
 * Ejercicios Tema 0405
 *
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 * b = 0).
 * Juan David Villena Gil
 */

public class Ejercicio040505 {
  public static void main(String[] args) {

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Escriba el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("Esta ecuación no tiene solución.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
