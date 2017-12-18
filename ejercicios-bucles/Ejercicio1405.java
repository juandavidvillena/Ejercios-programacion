/**
 * Ejercicios Bucles
 * Escribe un programa que pida una base y un exponente (entero positivo)
 * y que calcule la potencia.
 * 
 * @author Juan David Villena Gil
 */

public class Ejercicio1405 {

  public static void main(String[] args) {
    
    System.out.println("Potencia");
    System.out.print("Indica la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Indica el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    double potencia = 1;
    if (exponente == 0) {
      potencia = 1;
    }
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1/potencia;
    }
    System.out.println(base + "*(se multiplica por ese mismo numero) " + exponente + " = " + potencia);
  }
}
