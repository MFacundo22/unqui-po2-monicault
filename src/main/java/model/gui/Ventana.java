package model.gui;

/**
 * Clase simple en el paquete model.gui
 */
public class Ventana {
    private String titulo;
    private int ancho;
    private int alto;
    
    public Ventana(String titulo, int ancho, int alto) {
        this.titulo = titulo;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getAncho() {
        return ancho;
    }
    
    public int getAlto() {
        return alto;
    }
    
    @Override
    public String toString() {
        return "Ventana{" +
                "titulo='" + titulo + '\'' +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
