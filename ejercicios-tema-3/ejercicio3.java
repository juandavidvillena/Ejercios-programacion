public class ejercicio3 {
    public static void main(String[] args) {
      String linea;
      
      System.out.print("Introduzca el primer numero de pesetas que quiera convertir a euros: ");
      linea = System.console().readLine();
      int pesetas;
      pesetas = Integer.parseInt( linea );
      
      
      double total;
      total = pesetas / 166.33;
      
      System.out.print(total + " euros");
      }
    }
