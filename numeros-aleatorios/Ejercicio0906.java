/** Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 *
 *@author Juan David Villena Gil
 */
 public class Ejercicio0906 {

  public static void main(String[] args) {
    int contador = 0;
    int aleatorio = 0;
    do {
      aleatorio = (int)((Math.random()*100)+1);
      if (aleatorio % 2 == 0){
      contador++;
          System.out.println(aleatorio);
      }
       
    }while (aleatorio != 24);
    System.out.println(contador);
  }
}
