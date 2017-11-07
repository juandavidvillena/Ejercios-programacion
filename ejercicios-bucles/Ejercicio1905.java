public class piramide {

  public static void main(String[] args) {
    System.out.println("Introduzca la altura de la piramide");
  int altura = Integer.parseInt(System.console().readLine());
  int espacios = altura -1;
  int largoAs = 1;
  int planta = 1;
  String a = "*";
  
  while (altura >= planta) {
      //System.out.print(espacios);
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
    }
    //System.out.println(a);
    for ( int numeroAsteriscos = 1; numeroAsteriscos <= largoAs; numeroAsteriscos++) {
      System.out.print(a);
    }
    System.out.println();
    altura--;
    espacios--;
    largoAs += 2;
    }
  }
}
    
