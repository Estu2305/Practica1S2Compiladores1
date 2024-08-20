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
public class Rectangulo extends Forma {

    private String nombre;
    private int ancho;
    private int alto;

    public Rectangulo(String nombre, int ancho, int alto, int posx, int posy, Color color) {
        super(posx, posy, color);
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(posx, posy, ancho, alto);
    }
}
