/**
*Tema 3 Ejercicios Introducir Texto
*Juan David Villena Gil
*Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 12 euros la hora.
*/
  public class ejercicio8 {
    public static void main(String[] args) {
      String linea;
      
      System.out.print("Introduzca las horas trabajadas ");
      linea = System.console().readLine();
      int horas;
      horas = Integer.parseInt( linea );
      int eurosHora;
      eurosHora = 12;
      System.out.print("Su salario semanal es de : " + (horas * eurosHora));
      

      }
    }
