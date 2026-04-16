package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

/**
 * Clase Multioperador
 * 
 * Permite aplicar operaciones matemáticas (suma, resta y multiplicación)
 * sobre ArrayLists de enteros.
 * 
 * Operaciones disponibles:
 * - Suma: suma todos los números del ArrayList
 * - Resta: resta todos los números (primer elemento - segundo - tercero - ...)
 * - Multiplicación: multiplica todos los números entre sí
 * 
 * @author TP3 - Programación Orientada a Objetos 2
 */
public class Multioperador {
    
    private ArrayList<Integer> numeros;
    
    /**
     * Constructor que inicializa un ArrayList vacío de enteros
     */
    public Multioperador() {
        this.numeros = new ArrayList<>();
    }
    
    /**
     * Constructor que inicializa con un ArrayList de enteros específico
     * 
     * @param numeros ArrayList de enteros para inicializar
     */
    public Multioperador(ArrayList<Integer> numeros) {
        this.numeros = new ArrayList<>(numeros);
    }
    
    /**
     * Añade un número al ArrayList
     * 
     * @param numero entero a añadir
     */
    public void agregarNumero(int numero) {
        this.numeros.add(numero);
    }
    
    /**
     * Retorna el ArrayList de números
     * 
     * @return ArrayList<Integer> con los números almacenados
     */
    public ArrayList<Integer> getNumeros() {
        return new ArrayList<>(this.numeros);
    }
    
    /**
     * Calcula la suma de todos los números del ArrayList
     * 
     * Ejemplo: [2, 3, 5] → 2 + 3 + 5 = 10
     * 
     * @return la suma de todos los números
     * @throws IllegalArgumentException si el ArrayList está vacío
     */
    public int suma() {
        if (this.numeros.isEmpty()) {
            throw new IllegalArgumentException("El ArrayList no puede estar vacío para calcular la suma");
        }
        
        int resultado = 0;
        for (int numero : this.numeros) {
            resultado += numero;
        }
        return resultado;
    }
    
    /**
     * Calcula la resta de todos los números del ArrayList
     * 
     * La operación se realiza como: primer_elemento - segundo_elemento - tercer_elemento - ...
     * 
     * Ejemplo: [10, 3, 2] → 10 - 3 - 2 = 5
     * 
     * @return el resultado de la resta
     * @throws IllegalArgumentException si el ArrayList está vacío
     */
    public int resta() {
        if (this.numeros.isEmpty()) {
            throw new IllegalArgumentException("El ArrayList no puede estar vacío para calcular la resta");
        }
        
        int resultado = this.numeros.get(0);  // Comenzar con el primer elemento
        
        for (int i = 1; i < this.numeros.size(); i++) {
            resultado -= this.numeros.get(i);
        }
        
        return resultado;
    }
    
    /**
     * Calcula la multiplicación de todos los números del ArrayList
     * 
     * Ejemplo: [2, 3, 4] → 2 * 3 * 4 = 24
     * 
     * @return el resultado de la multiplicación
     * @throws IllegalArgumentException si el ArrayList está vacío
     */
    public int multiplicacion() {
        if (this.numeros.isEmpty()) {
            throw new IllegalArgumentException("El ArrayList no puede estar vacío para calcular la multiplicación");
        }
        
        int resultado = 1;
        for (int numero : this.numeros) {
            resultado *= numero;
        }
        return resultado;
    }
    
    /**
     * Retorna una representación en String del Multioperador
     * con todos los números y las operaciones disponibles
     * 
     * @return String con información del Multioperador
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Multioperador {\n");
        sb.append("  Números: ").append(this.numeros).append("\n");
        
        if (!this.numeros.isEmpty()) {
            try {
                sb.append("  Suma: ").append(this.suma()).append("\n");
                sb.append("  Resta: ").append(this.resta()).append("\n");
                sb.append("  Multiplicación: ").append(this.multiplicacion()).append("\n");
            } catch (IllegalArgumentException e) {
                sb.append("  Error al calcular operaciones: ").append(e.getMessage()).append("\n");
            }
        } else {
            sb.append("  (ArrayList vacío)\n");
        }
        
        sb.append("}");
        return sb.toString();
    }
    
    /**
     * Método main con ejemplos de uso del Multioperador
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║           CLASE MULTIOPERADOR - DEMOSTRACIONES             ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
        
        // Ejemplo 1: Multioperador con números positivos
        System.out.println("=== EJEMPLO 1: Números positivos ===\n");
        Multioperador multi1 = new Multioperador();
        multi1.agregarNumero(2);
        multi1.agregarNumero(3);
        multi1.agregarNumero(5);
        
        System.out.println("Números: " + multi1.getNumeros());
        System.out.println("Suma:           2 + 3 + 5 = " + multi1.suma());
        System.out.println("Resta:          2 - 3 - 5 = " + multi1.resta());
        System.out.println("Multiplicación: 2 × 3 × 5 = " + multi1.multiplicacion());
        
        // Ejemplo 2: Multioperador con números positivos y negativos
        System.out.println("\n=== EJEMPLO 2: Números positivos y negativos ===\n");
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(10);
        numeros2.add(3);
        numeros2.add(2);
        
        Multioperador multi2 = new Multioperador(numeros2);
        
        System.out.println("Números: " + multi2.getNumeros());
        System.out.println("Suma:           10 + 3 + 2 = " + multi2.suma());
        System.out.println("Resta:          10 - 3 - 2 = " + multi2.resta());
        System.out.println("Multiplicación: 10 × 3 × 2 = " + multi2.multiplicacion());
        
        // Ejemplo 3: Multioperador con un único número
        System.out.println("\n=== EJEMPLO 3: Un único número ===\n");
        Multioperador multi3 = new Multioperador();
        multi3.agregarNumero(42);
        
        System.out.println("Números: " + multi3.getNumeros());
        System.out.println("Suma:           42 = " + multi3.suma());
        System.out.println("Resta:          42 = " + multi3.resta());
        System.out.println("Multiplicación: 42 = " + multi3.multiplicacion());
        
        // Ejemplo 4: Multioperador con números que incluyen ceros y negativos
        System.out.println("\n=== EJEMPLO 4: Con ceros y números negativos ===\n");
        Multioperador multi4 = new Multioperador();
        multi4.agregarNumero(5);
        multi4.agregarNumero(-2);
        multi4.agregarNumero(3);
        multi4.agregarNumero(0);
        
        System.out.println("Números: " + multi4.getNumeros());
        System.out.println("Suma:           5 + (-2) + 3 + 0 = " + multi4.suma());
        System.out.println("Resta:          5 - (-2) - 3 - 0 = " + multi4.resta());
        System.out.println("Multiplicación: 5 × (-2) × 3 × 0 = " + multi4.multiplicacion());
        
        // Ejemplo 5: Usando toString()
        System.out.println("\n=== EJEMPLO 5: Usando toString() ===\n");
        Multioperador multi5 = new Multioperador();
        multi5.agregarNumero(6);
        multi5.agregarNumero(4);
        multi5.agregarNumero(2);
        
        System.out.println(multi5.toString());
        
        // Ejemplo 6: Error - ArrayList vacío
        System.out.println("\n=== EJEMPLO 6: Manejo de error (ArrayList vacío) ===\n");
        Multioperador multi6 = new Multioperador();
        
        try {
            multi6.suma();
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error al calcular suma: " + e.getMessage());
        }
        
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║             FIN DE LAS DEMOSTRACIONES                       ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
    }
}
