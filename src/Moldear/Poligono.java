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
public class Poligono extends Forma {

    private String nombre;
    private int[] puntosX;  // Array de coordenadas X
    private int[] puntosY;  // Array de coordenadas Y
    private int numeroDeLados;

    public Poligono(String nombre, int[] puntosX, int[] puntosY, int numeroDeLados, int posx, int posy, Color color) {
        super(posx, posy, color);
        this.nombre = nombre;
        this.puntosX = puntosX;
        this.puntosY = puntosY;
        this.numeroDeLados = numeroDeLados;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillPolygon(puntosX, puntosY, numeroDeLados);
    }

}
