/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotema9;

/**
 *
 * @author david
 */
public class Caballo {
    private String nombre;
    private String dueno;
    private int edad;
    private String raza;
    private String color;
    private String sexo;
    private int carrerasGanadas;
    
    Caballo (String n, String d, int e, String r, String c, String s, int cg){
        this.nombre = n;
        this.dueno = d;
        this.edad = e;
        this.sexo = s;
        this.color = c;
        this.carrerasGanadas = cg;
    }
     Caballo (String n, int e,String s){
        this.nombre = n;
        this.edad = e;
        this.sexo = s;
    }
      Caballo (){
        this.raza = "Carreras";
        this.sexo = "Macho";
    }
     public static void relincha(){
         System.out.println("hiiijiiii");
     }
     public static void come(){
         System.out.println("Necesito que me des de comer");
     }
    
     public static void cabalga(){
    System.out.println("TacaTatacata trumtrumtrum");
     }
}
    
