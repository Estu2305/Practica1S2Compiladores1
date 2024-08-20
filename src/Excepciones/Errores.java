/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author SELVYN
 */
public class Errores {

    private String tipo;
    private String contenido;
    private int linea;
    private int columna;

    public Errores(String tipo, String contenido, int linea, int columna) {
        this.tipo = tipo;
        this.contenido = contenido;
        this.linea = linea;
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Errores{" + "tipo=" + tipo + ", contenido=" + contenido + ", linea=" + linea + ", columna=" + columna + '}';
    }

}
