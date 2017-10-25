/**
 *Ejercicios Bucles Tema 5
 *Escribe un programa que muestre los n primeros términos de la serie de
 *Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 *y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 *los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
 *debe introducir por teclado.
 *Juan David Villena Gil
 */
public class Ejercicio1205 {
  public static void main(String[] args) {
    int n = 0;
    int i = 2;
    int primero = 0;
    int segundo = 1;
    int suma = primero + segundo;
    System.out.println("Cuantos numeros quieres de la serie Fibonacci");
    n = Integer.parseInt(System.console().readLine());
    System.out.print(primero + ", " + segundo + ", ");
    do { 
      System.out.print(suma +", ");
      primero=segundo;
      segundo=suma;
      suma=primero + segundo;
      i++;
    } while (n > i);
  }
}
