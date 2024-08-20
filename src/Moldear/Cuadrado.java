/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moldear;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author SELVYN
 */
public class Cuadrado extends Forma {
    
    private String nombre;
    private int lado;
    public Cuadrado(String nombre,int posx, int posy, int lado, Color color) {
        super(posx, posy, color);
        this.lado = lado;
    }
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(posx, posy, lado, lado);
    } 
    
}
