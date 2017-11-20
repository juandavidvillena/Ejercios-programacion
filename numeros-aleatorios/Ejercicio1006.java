/** Realiza un programa que pinte por pantalla diez líneas formadas por carac-
 * teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 *
 * @author Juan David Villena Gil
 */
 public class Ejercicio1006 {

  public static void main(String[] args) {
    int cadena = 0;
    int longitud = 0;
    for (int i = 10;i > 0;i--){
      longitud = (int)((Math.random()*40)+1);
      for (int j = 0;j<longitud;j++) {
        cadena = (int)(Math.random()*5);
        switch(cadena){
          case (0):
            System.out.print("*");
            break;
          case (1):
            System.out.print("-");
            break;
          case (2):
            System.out.print("=");
            break;
          case (3):
            System.out.print(",");
            break;
          case (4):
            System.out.print("@");
            break;
          case (5):
            System.out.print("|");
            break;
          }
    }
    System.out.println();
      } 
      System.out.println();
    }
  }

