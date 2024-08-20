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
public class Circulo extends Forma {

    private String nombre;
    private int radio;

    public Circulo(String nombre, int radio, int posx, int posy, Color color) {
        super(posx, posy, color);
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(posx - radio, posy - radio, 2 * radio, 2 * radio);  // Centro en (posx, posy)
    }

}
