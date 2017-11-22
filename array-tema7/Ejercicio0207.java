/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 * 
 * @author Juan David Villena Gil
 */
public class Ejercicio0207 {

  public static void main(String[] args) {
    char[] simbolo = new char[9];
      simbolo[0] = 'a';
      simbolo[1] ='x'; 
      simbolo[4] = '@'; 
      simbolo[6] = ' ';
      simbolo[7] = '+';
      simbolo[8] = 'Q';
    for (int i = 8;i >= 0;i--) {
      System.out.println(simbolo[i]);
    }
    System.out.println("Los valores no indicados en el Array obtienen el valor de un espacio");
  }
}
