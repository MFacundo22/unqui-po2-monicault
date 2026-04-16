package ar.edu.unq.po2.tp3;

/**
 * Utilidad para encontrar múltiplos comunes de dos números.
 * Proporciona funciones para calcular MCD, MCM y encontrar
 * el mayor múltiplo común en un rango específico.
 */
public class MultiplesFinder {

    /**
     * Calcula el Máximo Común Divisor (MCD) de dos números
     * utilizando el algoritmo de Euclides.
     * 
     * @param a primer número
     * @param b segundo número
     * @return el MCD de a y b
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }

    /**
     * Calcula el Mínimo Común Múltiplo (MCM) de dos números.
     * Utiliza la fórmula: MCM(a, b) = (a * b) / MCD(a, b)
     * 
     * @param a primer número
     * @param b segundo número
     * @return el MCM de a y b
     */
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        
        return (a * b) / gcd(a, b);
    }

    /**
     * Encuentra el número más alto entre 0 y 1000 que sea múltiplo
     * simultáneamente de X e Y (es decir, múltiplo del MCM de X e Y).
     * 
     * Ejemplos:
     * - X=3, Y=9: el MCM es 9, entonces 999 es el número más alto (999 / 9 = 111)
     * - X=3, Y=7: el MCM es 21, entonces 987 es el número más alto (987 / 21 = 47)
     * - X=2000, Y=3000: el MCM es 6000, que es > 1000, entonces retorna -1
     * 
     * @param x primer número
     * @param y segundo número
     * @return el número más alto entre 0 y 1000 que es múltiplo de ambos,
     *         o -1 si no existe
     * @throws IllegalArgumentException si X o Y son 0 o negativos
     */
    public static int getHighestCommonMultiple(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("X e Y deben ser números positivos");
        }
        
        // Calcular el MCM de X e Y
        int commonMultiple = lcm(x, y);
        
        // Si el MCM es mayor a 1000, no hay múltiplos en el rango
        if (commonMultiple > 1000) {
            return -1;
        }
        
        // El número más alto entre 0 y 1000 que es múltiplo del MCM
        // se calcula como: (1000 / MCM) * MCM
        return (1000 / commonMultiple) * commonMultiple;
    }
}
