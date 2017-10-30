/**
 *Ejercicios Bucles Tema 5
 *Escribe un programa que lea una lista de diez números y determine cuántos
 *son positivos, y cuántos son negativos.
 *Juan David Villena Gil
 */
public class Ejercicio1305 {
  public static void main(String[] args) {
    System.out.println("Introduzca 10 numeros y te determinara cuantos son positivos y negativos :");
    int positivo = 0;
    int negativo = 0;
    for (int i = 0; i < 10; i++) {
        if (Integer.parseInt(System.console().readLine()) < 0) {
        negativo++;
      } else {
        positivo++;
      }
    }
    
    System.out.println("Ha introducido " + positivo + " positivos y " + negativo + " negativos");

  }
}
