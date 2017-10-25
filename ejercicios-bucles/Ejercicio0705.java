/**
 *Ejercicios Bucles Tema 5
 *Realiza el control de acceso a una caja fuerte. La combinación será un
 *número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 *acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 *y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 *Tendremos cuatro oportunidades para abrir la caja fuerte.
 *Juan David Villena Gil
 */
public class Ejercicio0705 {
  public static void main(String[] args) {
    int codigo = 5526;
    int nIntroducido = 0;
    int oportunidades = 4;
    System.out.println("Escriba la combinacion de la caja fuerte");
    while ((nIntroducido != codigo) && (oportunidades >0)) {
      nIntroducido = Integer.parseInt(System.console().readLine());
      if (nIntroducido != codigo) {
        oportunidades--;
        System.out.println("Lo siento, esa no es la combinacion " + oportunidades);
      } else {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      }
    }
  }
}
