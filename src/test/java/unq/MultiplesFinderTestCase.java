package unq;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.MultiplesFinder;

public class MultiplesFinderTestCase {

    /**
     * Test del ejemplo proporcionado: X=3, Y=9
     * MCM(3, 9) = 9
     * El número más alto múltiplo de 9 entre 0 y 1000 es 999
     */
    @Test
    public void testGetHighestCommonMultiple_3_and_9() {
        int result = MultiplesFinder.getHighestCommonMultiple(3, 9);
        assertEquals(result, 999);
    }

    /**
     * Test con números coprimos: X=3, Y=7
     * MCM(3, 7) = 21
     * El número más alto múltiplo de 21 entre 0 y 1000 es 987 (21 * 47)
     */
    @Test
    public void testGetHighestCommonMultiple_3_and_7() {
        int result = MultiplesFinder.getHighestCommonMultiple(3, 7);
        assertEquals(result, 987);
    }

    /**
     * Test con números pares: X=2, Y=4
     * MCM(2, 4) = 4
     * El número más alto múltiplo de 4 entre 0 y 1000 es 1000
     */
    @Test
    public void testGetHighestCommonMultiple_2_and_4() {
        int result = MultiplesFinder.getHighestCommonMultiple(2, 4);
        assertEquals(result, 1000);
    }

    /**
     * Test con MCM muy grande (fuera del rango)
     * X=2000, Y=3000
     * MCM(2000, 3000) = 6000 > 1000
     * Debe retornar -1
     */
    @Test
    public void testGetHighestCommonMultiple_OutOfRange() {
        int result = MultiplesFinder.getHighestCommonMultiple(2000, 3000);
        assertEquals(result, -1);
    }

    /**
     * Test con números iguales: X=5, Y=5
     * MCM(5, 5) = 5
     * El número más alto múltiplo de 5 entre 0 y 1000 es 1000
     */
    @Test
    public void testGetHighestCommonMultiple_Same_Numbers() {
        int result = MultiplesFinder.getHighestCommonMultiple(5, 5);
        assertEquals(result, 1000);
    }

    /**
     * Test con un número que divide a 1000: X=10, Y=25
     * MCM(10, 25) = 50
     * El número más alto múltiplo de 50 entre 0 y 1000 es 1000
     */
    @Test
    public void testGetHighestCommonMultiple_10_and_25() {
        int result = MultiplesFinder.getHighestCommonMultiple(10, 25);
        assertEquals(result, 1000);
    }

    /**
     * Test con X=1, Y=1
     * MCM(1, 1) = 1
     * El número más alto múltiplo de 1 entre 0 y 1000 es 1000
     */
    @Test
    public void testGetHighestCommonMultiple_1_and_1() {
        int result = MultiplesFinder.getHighestCommonMultiple(1, 1);
        assertEquals(result, 1000);
    }

    /**
     * Test del cálculo de MCD: MCD(12, 8) = 4
     */
    @Test
    public void testGCD_12_and_8() {
        int result = MultiplesFinder.gcd(12, 8);
        assertEquals(result, 4);
    }

    /**
     * Test del cálculo de MCM: MCM(12, 8) = 24
     */
    @Test
    public void testLCM_12_and_8() {
        int result = MultiplesFinder.lcm(12, 8);
        assertEquals(result, 24);
    }

    /**
     * Test de excepción con valor negativo
     */
    @Test
    public void testGetHighestCommonMultiple_NegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplesFinder.getHighestCommonMultiple(-3, 5);
        });
    }

    /**
     * Test de excepción con cero
     */
    @Test
    public void testGetHighestCommonMultiple_Zero() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplesFinder.getHighestCommonMultiple(0, 5);
        });
    }
}
