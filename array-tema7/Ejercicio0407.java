/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero ,
 * cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 * array numero . En el array cubo se deben almacenar los cubos de los valores que
 * hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
 * en tres columnas.
 * 
 * @author Juan David Villena Gil
 */
public class Ejercicio0407 {

  public static void main(String[] args) {
    int[] numero = new int[20];
    for (int i = 0;i < 20;i++) {
      numero[i] = (int)(Math.random() * 101);
    }
      int[] cuadrado = new int[20];
    for (int i = 0;i < 20;i++) {
      cuadrado[i] = (numero[i] * numero[i]) ;
    }
    int[] cubo = new int[20];
    for (int i = 0;i < 20;i++) {
      cubo[i] = (numero[i] * numero[i] * numero[i]);
    }
    for (int i = 9;i >= 0;i--) {
      System.out.println(numero[i] + " " + cuadrado[i] + " "+ " " + cubo[i]);
    }
    
  }
}
