/**
 *Ejercicios Bucles Tema 5
 *Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 *por teclado
 *Juan David Villena Gil
 */
public class Ejercicio0905 {
  public static void main(String[] args) {
     System.out.println("Introduzca un numero");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int contador = 0;
    while (numeroIntroducido >0) {
      numeroIntroducido = numeroIntroducido/10;
      contador++;
      
    }
    System.out.println("El numero tiene " + contador + " digitos");
  }   
  
}
