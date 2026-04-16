import model.Persona;
import model.gui.Ventana;
import model.stack.Pila;

/**
 * Clase de prueba que usa las 3 clases creadas en diferentes paquetes
 * 
 * Demuestra que:
 * 1. Las clases pueden ser importadas desde diferentes paquetes
 * 2. La estructura de directorios reflejará exactamente la estructura de paquetes
 */
public class PruebaEstructuraPaquetes {
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║   PRUEBA DE ESTRUCTURA DE PAQUETES Y COMPILACIÓN           ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
        
        // Crear instancia de clase del paquete: model
        System.out.println("1. Clase del paquete 'model':");
        Persona p = new Persona("Juan", 30);
        System.out.println("   " + p);
        System.out.println("   Ubicación: src/main/java/model/Persona.java\n");
        
        // Crear instancia de clase del paquete: model.gui
        System.out.println("2. Clase del paquete 'model.gui':");
        Ventana v = new Ventana("Mi Aplicación", 800, 600);
        System.out.println("   " + v);
        System.out.println("   Ubicación: src/main/java/model/gui/Ventana.java\n");
        
        // Crear instancia de clase del paquete: model.stack
        System.out.println("3. Clase del paquete 'model.stack':");
        Pila pila = new Pila(10);
        pila.apilar(5);
        pila.apilar(10);
        pila.apilar(15);
        System.out.println("   " + pila);
        System.out.println("   Ubicación: src/main/java/model/stack/Pila.java\n");
        
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║             ARCHIVOS COMPILADOS (.class)                   ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
        
        System.out.println("target/classes/model/Persona.class");
        System.out.println("target/classes/model/gui/Ventana.class");
        System.out.println("target/classes/model/stack/Pila.class\n");
        
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║   CONCLUSION: La estructura de directorios refleja         ║");
        System.out.println("║   exactamente la estructura de paquetes                    ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
    }
}
