/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author SELVYN
 */
public class Archivo {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;

    public String Abrir(File archivo) {
        StringBuilder contenido = new StringBuilder();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contenido.toString();
    }

    public String GuardarArchivo(File archivo, String documento) {
        String mensaje = null;
        try {
            FileOutputStream salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo Guardado";
        } catch (Exception e) {

        }
        return mensaje;
    }

    public void AbrirMOstrar(TextArea txtArchivo) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String contenido = Abrir(selectedFile);
            txtArchivo.setText(contenido);
        }
    }

    public void guardar(TextArea txtArchivo) {

        if (seleccionar.showDialog(null, "Archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt") || archivo.getName().endsWith("xml")) {
                String Documento = txtArchivo.getText();
                String mensaje = GuardarArchivo(archivo, Documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, " Error al guardar el archivo. ");
                }
            } else {
                JOptionPane.showMessageDialog(seleccionar, " El archivo debe tener extensión .xml ");
            }
        }
    }

    public void crearArchivo(TextArea txtArchivo) {

        seleccionar.setDialogTitle("Crear Archivo");
        seleccionar.setSelectedFile(new File("nuevoArchivo.txt"));  // Nombre predeterminado
        int result = seleccionar.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (!archivo.exists()) {
                try {
                    if (archivo.createNewFile()) {
                        String documento = txtArchivo.getText();
                        String mensaje = GuardarArchivo(archivo, documento);
                        if (mensaje != null) {
                            JOptionPane.showMessageDialog(null, "Archivo creado y " + mensaje);
                        } else {
                            JOptionPane.showMessageDialog(null, "Archivo creado, pero error al guardar el contenido.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al crear el archivo.");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo ya existe. Elija otro nombre.");
            }
        }
    }

   
}
