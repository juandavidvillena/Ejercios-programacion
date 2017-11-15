/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
 * ducido es menor o mayor que el número secreto.
 *
 * @author Juan David Villena Gil
 */
public class Ejercicio0606 {
  
  public static void main(String[] args) {
  int numero = ((int)(Math.random()*100) + 1);
  int numeroIntroducido = 0;
  System.out.println(numero + "Adivina el número oculto este esta en un rango de números de 0 a 100");
    for (int intento = 4; (intento >0) && (numero != numeroIntroducido);intento--){
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if(numeroIntroducido != numero) {
      System.out.println("Intentelo de nuevo le quedan " + intento + " intentos");
    }
      if (numeroIntroducido<numero) {
        System.out.println("Su numero es mayor que el número a adivinar");
      }
      if (numeroIntroducido>numero) {
        System.out.println(" su número es menor que el número a adivinar");
      }if (numeroIntroducido == numero) {
      System.out.println("Enhorabuena has acertado el numero");
      }
    }
  }
}
