package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

/**
 * Clase Counter que mantiene una lista de números enteros
 * y proporciona métodos para contar paridades y múltiplos.
 */
public class Counter {
    private ArrayList<Integer> numbers;

    /**
     * Constructor que inicializa el ArrayList de números
     */
    public Counter() {
        this.numbers = new ArrayList<>();
    }

    /**
     * Agrega un número a la lista
     * @param number el número a agregar
     */
    public void addNumber(int number) {
        this.numbers.add(number);
    }

    /**
     * Cuenta la cantidad de números pares en la lista
     * @return cantidad de números pares
     */
    public int getEvenOcurrences() {
        int count = 0;
        for (int number : this.numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Cuenta la cantidad de números impares en la lista
     * @return cantidad de números impares
     */
    public int getOddOcurrences() {
        int count = 0;
        for (int number : this.numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Cuenta la cantidad de múltiplos de un cierto número
     * @param divisor el número del cual contar múltiplos
     * @return cantidad de múltiplos
     */
    public int getMultiplesOcurrences(int divisor) {
        if (divisor == 0) {
            return 0;
        }
        int count = 0;
        for (int number : this.numbers) {
            if (number % divisor == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Retorna la lista de números
     * @return el ArrayList de números
     */
    public ArrayList<Integer> getNumbers() {
        return this.numbers;
    }


//------------------------------------------------------------------------- punto2
    /**
     * Cuenta la cantidad de dígitos pares en un número entero.
     * Utiliza operadores matemáticos (mod y div) sin usar String.
     * 
     * Ejemplo: 2468 tiene 4 dígitos pares (2, 4, 6, 8)
     *          1234 tiene 2 dígitos pares (2, 4)
     * 
     * @param number el número a analizar
     * @return cantidad de dígitos pares en el número
     */
    public int countEvenDigits(int number) {
        int count = 0;
        number = Math.abs(number); // Manejamos números negativos
        
        // Caso especial: el número 0 tiene un dígito par
        if (number == 0) {
            return 1;
        }
        
        // Extraemos dígitos de derecha a izquierda usando mod y div
        while (number > 0) {
            int digit = number % 10;  // Obtiene el último dígito
            
            if (digit % 2 == 0) {  // Verifica si el dígito es par
                count++;
            }
            
            number = number / 10;  // Elimina el último dígito
        }
        
        return count;
    }

    /**
     * Encuentra el número en un arreglo que tiene la mayor cantidad de dígitos pares.
     * Utiliza solo operadores matemáticos sin usar String.
     * 
     * En caso de empate, retorna el primer número que encontró con esa cantidad.
     * 
     * @param numbers arreglo de números enteros
     * @return el número con la mayor cantidad de dígitos pares
     * @throws IllegalArgumentException si el arreglo es nulo o vacío
     */
    public int getNumberWithMostEvenDigits(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }
        
        int maxEvenDigits = -1;
        int result = numbers[0];
        
        // Itera sobre cada número del arreglo
        for (int number : numbers) {
            int evenDigitsCount = countEvenDigits(number);
            
            // Si este número tiene más dígitos pares, lo actualiza
            if (evenDigitsCount > maxEvenDigits) {
                maxEvenDigits = evenDigitsCount;
                result = number;
            }
        }
        
        return result;
    }
}
