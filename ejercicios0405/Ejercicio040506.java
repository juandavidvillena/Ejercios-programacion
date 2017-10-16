/**
 *Ejercicios Tema 0405
 * Realiza un programa que calcule el √
*tiempo que tardará en caer un objeto desde 2 una altura h. Aplica la fórmula t = 2h g 
* siendo g = 9.81m/s
 * 
 */
public class Ejercicio040506 {

  // las constantes se declaran fuera del main
  final static double g = 9.81;

  public static void main(String[] args) {

    System.out.println("Tiempo de caída de un objeto.");
    System.out.print("introduzca la altura (en metros) desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
