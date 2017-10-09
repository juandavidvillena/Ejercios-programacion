/**
*Tema 3 Ejercicios Introducir Texto
*Juan David Villena Gil
*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*/
  public class ejercicio2 {
    public static void main(String[] args) {
      String linea;
      
      System.out.print("Introduzca el primer numero ");
      linea = System.console().readLine();
      int euros;
      euros = Integer.parseInt( linea );
      
      
      double total;
      total = euros * 166.33;
      
      System.out.print(total + " pesetas");
      }
    }
