package model.stack;

/**
 * Clase simple en el paquete model.stack
 */
public class Pila {
    private int[] elementos;
    private int tamaño;
    
    public Pila(int capacidad) {
        this.elementos = new int[capacidad];
        this.tamaño = 0;
    }
    
    public void apilar(int elemento) {
        if (tamaño < elementos.length) {
            elementos[tamaño] = elemento;
            tamaño++;
        }
    }
    
    public int desapilar() {
        if (tamaño > 0) {
            return elementos[--tamaño];
        }
        return -1;
    }
    
    public boolean estaVacia() {
        return tamaño == 0;
    }
    
    @Override
    public String toString() {
        return "Pila{" +
                "tamaño=" + tamaño +
                '}';
    }
}
