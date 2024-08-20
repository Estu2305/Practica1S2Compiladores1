/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analisis;

/**
 *
 * @author SELVYN
 */
public class Generador {
    
     public static void main(String[] args) {
        generarCompiladores();
    }
    
     
    public static void generarCompiladores() {
        try {
            String ruta = "src/Analisis/";

            // Generar léxico con JFlex
            String[] Flex = {ruta + "lexico.jflex", "-d", ruta};
            System.out.println("Ejecutando JFlex...");
            jflex.Main.generate(Flex);
            System.out.println("JFlex completado.");

            // Generar parser con CUP
            String[] Cup = {"-destdir", ruta, "-parser", "parser", ruta + "sintactico.cup"};
            System.out.println("Ejecutando CUP...");
            java_cup.Main.main(Cup);
            System.out.println("CUP completado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
