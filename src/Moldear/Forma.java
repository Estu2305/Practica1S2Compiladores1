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
public abstract class Forma {

    protected int posx, posy;
    protected Color color;

    public Forma(int posx, int posy, Color color) {
        this.posx = posx;
        this.posy = posy;
        this.color = color;
    }

    public abstract void dibujar(Graphics g);
}
