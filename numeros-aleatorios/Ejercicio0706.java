/**Escribe un programa que muestre tres apuestas de la quiniela en tres columas
 * para los 14 partidos y el pleno al quince (15 filas).
 * @author Juan David Villena Gil
 **/
 public class Ejercicio0706 {
  
  public static void main(String[] args) {
    int resultados;
    int columna= 3;
    
    for (int i = 1; i <= 15; i++) {
      if (i == 15) {
        columna = 1;
      }
      
      for (int z = 0; z < columna; z++) {
        resultados = (int)(Math.random() * 3);
        switch(resultados) {
          case 0:
            System.out.print("1  |");
            break;
          case 1:
            System.out.print("  2|");
            break;
          case 2:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
  }
}
