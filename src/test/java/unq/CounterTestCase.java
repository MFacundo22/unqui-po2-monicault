package unq;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {
    private Counter counter;

    /**
     * Crea un escenario de test básico, que consiste en un contador
     * con 10 enteros
     *
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
        // Se crea el contador
        counter = new Counter();
        // Se agregan los numeros. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testEvenNumbers() {
        // Getting the even occurrences
        int amount = counter.getEvenOcurrences();
        // I check the amount is the expected one
        assertEquals(amount, 1);
    }

    /**
     * Verifica la cantidad de números impares
     */
    @Test
    public void testOddNumbers() {
        int amount = counter.getOddOcurrences();
        assertEquals(amount, 9);
    }

    /**
     * Verifica la cantidad de múltiplos de 2
     */
    @Test
    public void testMultiplesOfTwo() {
        int amount = counter.getMultiplesOcurrences(2);
        assertEquals(amount, 1);
    }

// punto 2 auxiliares -----------------------------------------------------------------
    /**
     * Verifica el conteo de dígitos pares en un número
     * Número 2468 tiene 4 dígitos pares
     */
    @Test
    public void testCountEvenDigits() {
        int count = counter.countEvenDigits(2468);
        assertEquals(count, 4);
    }

    /**
     * Verifica el conteo con número que tiene dígitos impares
     * Número 1357 tiene 0 dígitos pares
     */
    @Test
    public void testCountEvenDigitsWithOddNumber() {
        int count = counter.countEvenDigits(1357);
        assertEquals(count, 0);
    }

    /**
     * Verifica el conteo con número mixto
     * Número 1234 tiene 2 dígitos pares (2, 4)
     */
    @Test
    public void testCountEvenDigitsMixed() {
        int count = counter.countEvenDigits(1234);
        assertEquals(count, 2);
    }

    /**
     * Verifica el conteo con número 0
     */
    @Test
    public void testCountEvenDigitsZero() {
        int count = counter.countEvenDigits(0);
        assertEquals(count, 1);
    }


    // punto 2 main -----------------------------------------------------------------
    /**
     * Verifica el conteo con número negativo
     * Número -2468 tiene 4 dígitos pares
     */
    @Test
    public void testCountEvenDigitsNegative() {
        int count = counter.countEvenDigits(-2468);
        assertEquals(count, 4);
    }

    /**
     * Encuentra el número con más dígitos pares en un arreglo
     * Arreglo: [1357, 2468, 1234]
     * 1357 tiene 0 dígitos pares
     * 2468 tiene 4 dígitos pares
     * 1234 tiene 2 dígitos pares
     * Resultado esperado: 2468
     */
    @Test
    public void testGetNumberWithMostEvenDigits() {
        int[] numbers = {1357, 2468, 1234};
        int result = counter.getNumberWithMostEvenDigits(numbers);
        assertEquals(result, 2468);
    }

    /**
     * Encuentra el número con más dígitos pares cuando hay un empate
     * Debe retornar el primero que encuentra con esa cantidad
     * Arreglo: [24, 68, 13]
     * 24 tiene 2 dígitos pares
     * 68 tiene 2 dígitos pares
     * 13 tiene 0 dígitos pares
     * Resultado esperado: 24 (el primero en el arreglo)
     */
    @Test
    public void testGetNumberWithMostEvenDigitsTie() {
        int[] numbers = {24, 68, 13};
        int result = counter.getNumberWithMostEvenDigits(numbers);
        assertEquals(result, 24);
    }

    /**
     * Verifica con un solo número en el arreglo
     */
    @Test
    public void testGetNumberWithMostEvenDigitsSingleNumber() {
        int[] numbers = {2468};
        int result = counter.getNumberWithMostEvenDigits(numbers);
        assertEquals(result, 2468);
    }

    /**
     * Verifica con números negativos en el arreglo
     * Arreglo: [-2468, -1357]
     * -2468 tiene 4 dígitos pares
     * -1357 tiene 0 dígitos pares
     * Resultado esperado: -2468
     */
    @Test
    public void testGetNumberWithMostEvenDigitsNegative() {
        int[] numbers = {-2468, -1357, 13};
        int result = counter.getNumberWithMostEvenDigits(numbers);
        assertEquals(result, -2468);
    }
}
