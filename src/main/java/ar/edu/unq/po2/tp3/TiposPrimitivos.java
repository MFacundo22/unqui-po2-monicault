package ar.edu.unq.po2.tp3;

/**
 * TIPOS PRIMITIVOS EN JAVA
 * 
 * Respuestas a las preguntas del TP3 - Punto 5
 * ============================================
 * 
 * 1. ¿QUÉ SON LOS TIPOS DE DATOS PRIMITIVOS?
 * 
 * Los tipos de datos primitivos son 8 tipos fundamentales en Java que almacenan
 * valores simples directamente (no son objetos):
 * 
 * - byte:     8 bits, rango: -128 a 127
 * - short:    16 bits, rango: -32,768 a 32,767
 * - int:      32 bits, rango: -2^31 a 2^31-1
 * - long:     64 bits, rango: -2^63 a 2^63-1
 * - float:    32 bits, números decimales de precisión simple
 * - double:   64 bits, números decimales de precisión doble
 * - boolean:  true o false
 * - char:     16 bits, un único carácter Unicode
 * 
 * Característica clave: Se almacenan directamente en la variable,
 * no es una referencia a un objeto.
 * 
 * ============================================
 * 
 * 2. DIFERENCIA ENTRE int E Integer
 * 
 * int:
 * - Tipo primitivo
 * - Almacena el valor directamente
 * - No puede ser null
 * - Más rápido y usa menos memoria
 * - Valor predeterminado en variables de instancia: 0
 * 
 * Integer:
 * - Clase (tipo Wrapper/Envoltorio) que envuelve al tipo primitivo int
 * - Almacena una referencia a un objeto
 * - Puede ser null
 * - Más lento, usa más memoria
 * - Permite usar métodos: Integer.parseInt(), Integer.MAX_VALUE, etc.
 * - Valor predeterminado en variables de instancia: null
 * 
 * ============================================
 */
public class TiposPrimitivos {

    // ==========================================
    // 3. VARIABLES DE INSTANCIA - Valores Predeterminados
    // ==========================================
    
    private int miIntPrimitivo;           // Predeterminado: 0
    private Integer miIntegerObjeto;      // Predeterminado: null
    
    private long miLongPrimitivo;         // Predeterminado: 0L
    private double miDoublePrimitivo;     // Predeterminado: 0.0
    private boolean miBoolean;            // Predeterminado: false
    private char miChar;                  // Predeterminado: '\u0000' (carácter nulo)
    private byte miByte;                  // Predeterminado: 0
    
    /**
     * Demuestra los valores predeterminados de variables de instancia
     */
    public void demostrarVariablesDeInstancia() {
        System.out.println("\n=== 3. VALORES PREDETERMINADOS - VARIABLES DE INSTANCIA ===\n");
        
        System.out.println("int primitivo (miIntPrimitivo):         " + this.miIntPrimitivo);
        System.out.println("Integer objeto (miIntegerObjeto):      " + this.miIntegerObjeto);
        System.out.println("long primitivo (miLongPrimitivo):       " + this.miLongPrimitivo);
        System.out.println("double primitivo (miDoublePrimitivo):  " + this.miDoublePrimitivo);
        System.out.println("boolean primitivo (miBoolean):         " + this.miBoolean);
        System.out.println("char primitivo (miChar):               " + (int)this.miChar + " (código Unicode del carácter nulo)");
        System.out.println("byte primitivo (miByte):               " + this.miByte);
        
        System.out.println("\nCONCLUSIÓN:");
        System.out.println("- Los primitivos tienen valores predeterminados numéricos/lógicos");
        System.out.println("- Los objetos wrapper (como Integer) tienen valor predeterminado null");
    }
    
    // ==========================================
    // 4. VARIABLES DE MÉTODO - Valores Predeterminados
    // ==========================================
    
    /**
     * Demuestra que las variables locales NO tienen valores predeterminados
     * Este método fallará al compilar si se descomenta el código
     */
    public void demostrarVariablesDeMetodo() {
        System.out.println("\n=== 4. VALORES PREDETERMINADOS - VARIABLES DE MÉTODO ===\n");
        
        // IMPORTANTE: Variables locales NO tienen valores predeterminados
        // Las siguientes líneas causarían ERROR AL COMPILAR si se descomentsn:
        
        // int intLocal;                    // NO INICIALIZADA
        // System.out.println(intLocal);    // ERROR: variable might not have been initialized
        
        // Integer integerLocal;            // NO INICIALIZADA
        // System.out.println(integerLocal); // ERROR: variable might not have been initialized
        
        // Para usar variables locales, DEBEN ser inicializadas:
        int intLocal = 0;                    // Inicializada explícitamente
        Integer integerLocal = null;         // Inicializada explícitamente
        
        System.out.println("int local (intLocal):                  " + intLocal);
        System.out.println("Integer local (integerLocal):         " + integerLocal);
        
        System.out.println("\nCONCLUSIÓN:");
        System.out.println("- Las variables locales NO tienen valores predeterminados");
        System.out.println("- DEBEN ser inicializadas antes de usarse");
        System.out.println("- El compilador genera error si intentas usar sin inicializar");
    }
    
    /**
     * Ejemplo de prueba adicional: Autoboxing y Unboxing
     */
    public void demostrarAutoboxing() {
        System.out.println("\n=== BONUS: AUTOBOXING Y UNBOXING ===\n");
        
        // Autoboxing: conversión automática de int a Integer
        int intPrimitivo = 42;
        Integer intObjeto = intPrimitivo;  // Autoboxing automático
        System.out.println("Autoboxing - int a Integer: " + intObjeto);
        
        // Unboxing: conversión automática de Integer a int
        Integer objetoConValor = 100;
        int primitivoExtraido = objetoConValor;  // Unboxing automático
        System.out.println("Unboxing - Integer a int:  " + primitivoExtraido);
        
        // Cuidado: Unboxing de null causa NullPointerException
        Integer objetoNull = null;
        try {
            int resultado = objetoNull;  // Intentará hacer unboxing
        } catch (NullPointerException e) {
            System.out.println("ERROR: No se puede hacer unboxing de null -> NullPointerException");
        }
    }
    
    /**
     * Comparación entre == y equals() con Integer
     */
    public void demostrarComparacionInteger() {
        System.out.println("\n=== COMPARACIÓN: == vs equals() CON INTEGER ===\n");
        
        Integer a = 128;
        Integer b = 128;
        Integer c = new Integer(128);
        
        System.out.println("a = 128 (autoboxing)");
        System.out.println("b = 128 (autoboxing)");
        System.out.println("c = new Integer(128)");
        System.out.println();
        
        System.out.println("a == b:              " + (a == b) + " (puede ser false por caching)");
        System.out.println("a.equals(b):         " + a.equals(b) + " (compara valores)");
        System.out.println("a == c:              " + (a == c) + " (diferentes objetos)");
        System.out.println("a.equals(c):         " + a.equals(c) + " (compara valores)");
        
        System.out.println("\nNOTA: Java cachea integers pequeños (-128 a 127)");
        System.out.println("Por eso a == b puede ser true, pero no siempre es fiable.");
    }
    
    public static void main(String[] args) {
        TiposPrimitivos demo = new TiposPrimitivos();
        
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║        TIPOS PRIMITIVOS EN JAVA - DEMOSTRACIONES           ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        
        // Pregunta 3: Variables de instancia
        demo.demostrarVariablesDeInstancia();
        
        // Pregunta 4: Variables de método
        demo.demostrarVariablesDeMetodo();
        
        // Bonus: Autoboxing y unboxing
        demo.demostrarAutoboxing();
        
        // Bonus: Comparación de Integer
        demo.demostrarComparacionInteger();
        
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║             FIN DE LAS DEMOSTRACIONES                       ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
    }
}

