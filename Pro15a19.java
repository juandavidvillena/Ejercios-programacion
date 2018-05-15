/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import funciones.matematicas.Matematicas;
import java.util.Scanner;

/**
 *
 * @author Daviid Villena
 */
public class Pro15a19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         //TODO code application logic here
      //Ejercicio 15
       for(int i = 0; i <= 1000;i++){
//        if (Matematicas.esPrimo(i) == true){
//            System.out.println("El número " + i + " es primo");
//        }
//        }
//        
//        //Ejercicio 16
//        for(int i = 0; i <= 99999;i++){
//            if(Matematicas.esCapicua(i)== true){
//                System.out.println("El número " + i + " es Capicuo");
//            }
//        }
//        //Ejercicio 17 
//        Scanner s = new Scanner(System.in);
//        System.out.println("Escriba su número en binario: ");
//        int e = s.nextInt();
//        int o =  Matematicas.decimal(e);
//        System.out.println(o);
//       
//          //Ejercicio 18
//          Scanner s = new Scanner (System.in);
//          System.out.println("Escriba su número :");
//          int d = s.nextInt();
//          int o = Matematicas.binario(d);
//          System.out.println("Su número esn binario es : " + o);
//          
        //Ejercicio 19 
        Scanner s = new Scanner(System.in);
        System.out.println("¿Ên que base esta tu número?: ");
        System.out.println("1.- Decimal.");
        System.out.println("2.- Binario.");
        System.out.println("3.- Hexadecimal.");
        System.out.println("4.- Octal.");
        int tipoOrigen = s.nextInt();
        System.out.println("Ahora escriba el a que tipo quiere cambiar: ");
        System.out.println("1.- Decimal.");
        System.out.println("2.- Binario.");
        System.out.println("3.- Hexadecimal.");
        System.out.println("4.- Octal.");
        int tipoFinal = s.nextInt();
        System.out.print("Introduce el número que quiere cambiar de base: ");
        int n = s.nextInt();
        
        if (tipoOrigen == 1) {
            switch (tipoFinal) {
                case 1:
                    System.out.println("Su número ya está en decimal.");
                    break;
                case 2:
                    System.out.println("Su número en binario es: " + Matematicas.binario(n));
                    break;
                case 3:
                    System.out.println("Su número en hexadecimal es: " + Matematicas.hexadecimal(n));
                    break;
                case 4:
                    System.out.println("Su número en octal es: " + Matematicas.octal(n));
                    break;
                default:
                    System.out.println("Dato incorrecto.");
                    break;
            }
        }
        if (tipoOrigen == 2) {
            switch (tipoFinal) {
                case 1:
                    System.out.println("Su número en decimal es: " + Matematicas.decimal(n));
                    break;
                case 2:
                    System.out.println("Su número ya está en binario.");
                    break;
                case 3:
                    n = Matematicas.decimal(n);
                    System.out.println("Su número en hexadecimal es: " + Matematicas.hexadecimal(n));
                    break;
                case 4:
                    n = Matematicas.decimal(n);
                    n = Matematicas.octal(n);
                    System.out.println("Su número en octal es: " + n);
                    break;
                default:
                    System.out.println("Dato incorrecto.");
                    break;
            }
        }
        if (tipoOrigen == 3) {
            switch (tipoFinal) {
                case 1:
                    System.out.println("Su número en decimal es: " + Matematicas.hexaDec(n));
                    break;
                case 2:
                    n = Matematicas.hexaDec(n);
                    System.out.println("Su número en binario es: " + Matematicas.binario(n));
                    break;
                case 3:
                    System.out.print("Su número ya está en hexadecimal.");
                    break;
                case 4:
                    n = Matematicas.hexaDec(n);
                    System.out.println("Su número en octal es: " + Matematicas.octal(n));
                    break;
                default:
                    System.out.println("Dato incorrecto.");
                    break;
            }
        }
        if (tipoOrigen == 4) {
            switch (tipoFinal) {
                case 1:
                    n = Matematicas.octalDec(n);
                    System.out.println("Su número en decimal es: " + n);
                    break;
                case 2:
                    n = Matematicas.octalDec(n);
                    n = Matematicas.binario(n);
                    System.out.println("Su número en binario es: " + n);
                    break;
                case 3:
                    n = Matematicas.octalDec(n);
                    System.out.println("Su número en hexadecimal es: " + Matematicas.hexadecimal(n));
                    break;
                case 4:
                    System.out.print("Su número ya está en octal.");
                    break;
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
        }
    }
}
}
