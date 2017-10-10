/**
*Tema 3 Ejercicios Introducir Texto
*Juan David Villena Gil
*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
*/
  public class ejercicio4 {
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
      
      int multiplicar;
      multiplicar = primerNumero * segundoNumero;
      
      int suma;
      suma = primerNumero + segundoNumero;
      
      double resta;
      resta = primerNumero - segundoNumero;
      
      double division;
      division = primerNumero / segundoNumero;
      
      System.out.println("El resultado de la multiplicacion es: " + multiplicar);
      System.out.println("El resultado de la suma es: " + suma);
      System.out.println("El resultado de la resta es: " + resta);
      System.out.println("El resultado de la division es: " + division);
      }
    }
      
