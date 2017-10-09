/**
*Tema 3 Ejercicios Introducir Texto
*Juan David Villena Gil
*Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
*/
  public class Ejercicio1 {
    public static void main(String[] args) {
      String linea;
      
      System.out.print("Introduzca el primer numero ");
      linea = System.console().readLine();
      int primerNumero;
      primerNumero = Integer.parseInt( linea );
      
      System.out.print("introduce el segundo numero ");
      linea=System.console().readLine();
      int segundoNumero;
      segundoNumero = Integer.parseInt( linea );
      
      int total;
      total = primerNumero * segundoNumero;
      
      System.out.print("El resultado de la multiplicacion es: " + total);
      }
    }
      
