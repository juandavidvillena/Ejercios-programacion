/**
 *Ejercicios Bucles Tema 5
 *Realiza el control de acceso a una caja fuerte. La combinación será un
 *número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 *acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 *y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 *Tendremos cuatro oportunidades para abrir la caja fuerte.
 *Juan David Villena Gil
 */
public class Ejercicio0605 {
  public static void main(String[] args) {
    int codigo = 5526;
    int nIntroducido = Integer.parseInt(System.console().readLine());
    
    while (nIntroducido != codigo) {
      System.out.println("Lo siento, esa no es la combinacion");
      System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      
      
  }
}
