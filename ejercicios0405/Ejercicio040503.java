/**
 * Ejercicios Tema 0504
 *Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
*diente nombre del día de la semana.
* Juan David Villena Gil
 */

public class Ejercicio040503 {
	public static void main(String[] args) {

		String dia;

		System.out.print("Escriba un número del 1 al 7: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		switch(numero) {
			case 1:
        dia = "lunes";
        break;
			case 2:
        dia = "martes";
        break;
			case 3:
        dia = "miércoles";
        break;
			case 4:
        dia = "jueves";
        break;
			case 5:
        dia = "viernes";
        break;
			case 6:
        dia = "sábado";
        break;
			case 7:
        dia = "domingo";
        break;
			default:
        dia = "Intriduzca un número del 1 al 7";
		}
		
		System.out.println(dia);

	}
}
