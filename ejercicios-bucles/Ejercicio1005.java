/**
 *Ejercicios Bucles Tema 5
 *Escribe un programa que calcule la media de un conjunto de números positivos
 *introducidos por teclado. A priori, el programa no sabe cuántos números se
 *introducirán. El usuario indicará que ha terminado de introducir los datos
 *cuando meta un número negativo.
 *Juan David Villena Gil
 */
public class Ejercicio1005 {
  public static void main(String[] args) {
     System.out.println("Introduzca las notas cuando hayas terminado introduce un numero negativo");
    int numeroIntroducido = 0;
    int divisor = 0;
    int suma = 0;
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      divisor++;
      suma += numeroIntroducido;
    }
    System.out.println("La media de los valores introducidos es " + ((double)suma - numeroIntroducido)/ (divisor - 1));
  }   
  
}
