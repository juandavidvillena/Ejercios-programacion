/**
 *Ejercicios Bucles Tema 5
 *Muestra la tabla de multiplicar de un número introducido por teclado.
 *Juan David Villena Gil
 */
public class Ejercicio0805 {
  public static void main(String[] args) {
    System.out.println("Que tabla de multiplicar quieres");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int tabla = 0;
    
    do {
      System.out.println(numeroIntroducido * tabla);
      tabla++;
    }while (tabla<=10);
  }
}

