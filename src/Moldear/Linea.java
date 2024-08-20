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
public class Linea extends Forma {

    private String nombre;
    private int x2;
    private int y2;

    public Linea(String nombre, int x2, int y2, int posx, int posy, Color color) {
        super(posx, posy, color);
        this.nombre = nombre;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.drawLine(posx, posy, x2, y2);
    }

}
