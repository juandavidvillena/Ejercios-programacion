/**
*Tema 3 Ejercicios Introducir Texto
*Juan David Villena Gil
*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
*/
  public class ejercicio3 {
    public static void main(String[] args) {
      String linea;
      
      System.out.print("Introduzca el primer numero ");
      linea = System.console().readLine();
      int pesetas;
      pesetas = Integer.parseInt( linea );
      
      
      double total;
      total = pesetas / 166.33;
      
      System.out.print(total + " euros");
      }
    }
