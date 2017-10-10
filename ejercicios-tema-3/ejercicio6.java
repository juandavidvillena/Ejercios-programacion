/**
*Tema 3 Ejercicios Introducir Texto
*Juan David Villena Gil
*Escribe un programa que calcule el área de un triangulo.
*/
  public class ejercicio6 {
    public static void main(String[] args) {
      String linea;
      
      System.out.print("Introduzca la base ");
      linea = System.console().readLine();
      int base;
      base = Integer.parseInt( linea );
      
      System.out.print("introduce la altura ");
      linea=System.console().readLine();
      int altura;
      altura = Integer.parseInt( linea );
      
      System.out.println("El area del rectangulo es : " + (altura * base / 2));

      }
    }
