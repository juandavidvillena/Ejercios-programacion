/**
*Tema 3 Ejercicios Introducir Texto
*Juan David Villena Gil
*Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 12 euros la hora.
*/
  public class Ejercicio040504 {
    public static void main(String[] args) {
      int sueldoSemanal;

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);    
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
  }
}
