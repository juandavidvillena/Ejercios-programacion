/**
 * Escribe un programa que dados dos números, uno real (base) y un
 * entero positivo (exponente), saque por pantalla todas las potencias
 * con base el numero dado y exponentes entre uno y el exponente introducido.
 * No se deben utilizar funciones de exponenciación. Por ejemplo, si
 * introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 * @author Juan David Villena Gil
 */
public class Ejercicio1505 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    int potencia = 0;
    int exponenteVar = 0;
    for (int i = 1; i <= exponente; i++) {
      potencia = 1;
      exponenteVar = i;
      for (int j = 0; j < exponenteVar; j++) {
        potencia *= base;
      }
      System.out.println(base + "*" + i + " = " + "base multiplicada " + (i) + " veces entre si " + potencia);
    }
  }
}
