package unq;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ar.edu.unq.po2.tp3.Multioperador;

/**
 * Casos de prueba para la clase Multioperador
 * 
 * Prueba las operaciones de suma, resta y multiplicación
 * sobre ArrayLists de enteros
 */
public class MultioperadorTestCase {
    
    private Multioperador multioperador;
    
    @Before
    public void setUp() {
        this.multioperador = new Multioperador();
    }
    
    // ==========================================
    // PRUEBAS DE SUMA
    // ==========================================
    
    @Test
    public void testSumaVariosNumeros() {
        multioperador.agregarNumero(2);
        multioperador.agregarNumero(3);
        multioperador.agregarNumero(5);
        assertEquals(10, multioperador.suma());
    }
    
    @Test
    public void testSumaConNumerosNegativos() {
        multioperador.agregarNumero(10);
        multioperador.agregarNumero(-3);
        multioperador.agregarNumero(2);
        assertEquals(9, multioperador.suma());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSumaArrayListVacio() {
        multioperador.suma();
    }
    
    // ==========================================
    // PRUEBAS DE RESTA
    // ==========================================
    
    @Test
    public void testRestaUnNumero() {
        multioperador.agregarNumero(42);
        assertEquals(42, multioperador.resta());
    }
    
    @Test
    public void testRestaVariosNumeros() {
        multioperador.agregarNumero(10);
        multioperador.agregarNumero(3);
        multioperador.agregarNumero(2);
        assertEquals(5, multioperador.resta());  // 10 - 3 - 2 = 5
    }
    
    @Test
    public void testRestaConNumerosNegativos() {
        multioperador.agregarNumero(5);
        multioperador.agregarNumero(-2);
        multioperador.agregarNumero(3);
        assertEquals(4, multioperador.resta());  // 5 - (-2) - 3 = 4
    }
    
    @Test
    public void testRestaResultadoNegativo() {
        multioperador.agregarNumero(2);
        multioperador.agregarNumero(5);
        multioperador.agregarNumero(3);
        assertEquals(-6, multioperador.resta());  // 2 - 5 - 3 = -6
    }
    
    @Test
    public void testRestaConCero() {
        multioperador.agregarNumero(10);
        multioperador.agregarNumero(0);
        multioperador.agregarNumero(3);
        assertEquals(7, multioperador.resta());  // 10 - 0 - 3 = 7
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRestaArrayListVacio() {
        multioperador.resta();
    }
    
    // ==========================================
    // PRUEBAS DE MULTIPLICACIÓN
    // ==========================================
    
    @Test
    public void testMultiplicacionUnNumero() {
        multioperador.agregarNumero(42);
        assertEquals(42, multioperador.multiplicacion());
    }
    
    @Test
    public void testMultiplicacionVariosNumeros() {
        multioperador.agregarNumero(2);
        multioperador.agregarNumero(3);
        multioperador.agregarNumero(4);
        assertEquals(24, multioperador.multiplicacion());  // 2 * 3 * 4 = 24
    }
    
    @Test
    public void testMultiplicacionConCero() {
        multioperador.agregarNumero(5);
        multioperador.agregarNumero(0);
        multioperador.agregarNumero(3);
        assertEquals(0, multioperador.multiplicacion());  // 5 * 0 * 3 = 0
    }
    
    @Test
    public void testMultiplicacionConNumerosNegativos() {
        multioperador.agregarNumero(2);
        multioperador.agregarNumero(-3);
        multioperador.agregarNumero(4);
        assertEquals(-24, multioperador.multiplicacion());  // 2 * (-3) * 4 = -24
    }
    
    @Test
    public void testMultiplicacionNegativosPares() {
        multioperador.agregarNumero(-2);
        multioperador.agregarNumero(-3);
        multioperador.agregarNumero(4);
        assertEquals(24, multioperador.multiplicacion());  // (-2) * (-3) * 4 = 24
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMultiplicacionArrayListVacio() {
        multioperador.multiplicacion();
    }
    
    // ==========================================
    // PRUEBAS DE CONSTRUCTOR Y MÉTODOS AUXILIARES
    // ==========================================
    
    @Test
    public void testConstructorVacio() {
        Multioperador m = new Multioperador();
        assertTrue(m.getNumeros().isEmpty());
    }
    
    @Test
    public void testConstructorConArrayList() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        Multioperador m = new Multioperador(numeros);
        
        assertEquals(3, m.getNumeros().size());
        assertEquals(6, m.suma());
    }
    
    @Test
    public void testAgregarNumero() {
        multioperador.agregarNumero(5);
        multioperador.agregarNumero(3);
        
        ArrayList<Integer> numeros = multioperador.getNumeros();
        assertEquals(2, numeros.size());
        assertTrue(numeros.contains(5));
        assertTrue(numeros.contains(3));
    }
    
    @Test
    public void testGetNumerosRetornaCopiaMutable() {
        // Verifica que getNumeros() retorna una copia
        multioperador.agregarNumero(5);
        ArrayList<Integer> numeros1 = multioperador.getNumeros();
        ArrayList<Integer> numeros2 = multioperador.getNumeros();
        
        // Modificar la copia no debe afectar la otra
        numeros1.add(999);
        
        assertEquals(1, numeros2.size());
        assertFalse(numeros2.contains(999));
    }
    
    @Test
    public void testToStringNoVacio() {
        multioperador.agregarNumero(2);
        multioperador.agregarNumero(3);
        
        String resultado = multioperador.toString();
        
        assertTrue(resultado.contains("Multioperador"));
        assertTrue(resultado.contains("[2, 3]"));
        assertTrue(resultado.contains("Suma: 5"));
        assertTrue(resultado.contains("Resta: -1"));
        assertTrue(resultado.contains("Multiplicación: 6"));
    }
    
    @Test
    public void testToStringVacio() {
        String resultado = multioperador.toString();
        
        assertTrue(resultado.contains("Multioperador"));
        assertTrue(resultado.contains("vacío"));
    }
}
