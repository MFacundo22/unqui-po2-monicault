package unq;

import ar.edu.unq.po2.tp3.Point;

/**
 * Casos de prueba para la clase Point.
 */
public class PointTestCase {

    public static void main(String[] args) {
        testConstructorWithParameters();
        testConstructorWithoutParameters();
        testMove();
        testAdd();
        testEqualsAndToString();
    }

    /**
     * Prueba 1: Constructor con parámetros
     */
    public static void testConstructorWithParameters() {
        System.out.println("Test 1: Constructor con parámetros");
        Point p1 = new Point(3.5, 4.2);
        System.out.println("Punto creado: " + p1);
        assert p1.getX() == 3.5 : "X debe ser 3.5";
        assert p1.getY() == 4.2 : "Y debe ser 4.2";
        System.out.println("✓ Prueba superada\n");
    }

    /**
     * Prueba 2: Constructor sin parámetros (punto en el origen)
     */
    public static void testConstructorWithoutParameters() {
        System.out.println("Test 2: Constructor sin parámetros");
        Point p2 = new Point();
        System.out.println("Punto creado: " + p2);
        assert p2.getX() == 0 : "X debe ser 0";
        assert p2.getY() == 0 : "Y debe ser 0";
        System.out.println("✓ Prueba superada\n");
    }

    /**
     * Prueba 3: Mover un punto
     */
    public static void testMove() {
        System.out.println("Test 3: Mover un punto");
        Point p3 = new Point(1, 1);
        System.out.println("Punto inicial: " + p3);
        p3.move(5, 7);
        System.out.println("Punto después de mover: " + p3);
        assert p3.getX() == 5 : "X debe ser 5";
        assert p3.getY() == 7 : "Y debe ser 7";
        System.out.println("✓ Prueba superada\n");
    }

    /**
     * Prueba 4: Sumar dos puntos
     */
    public static void testAdd() {
        System.out.println("Test 4: Sumar dos puntos");
        Point p4 = new Point(2, 3);
        Point p5 = new Point(4, 5);
        System.out.println("Punto 1: " + p4);
        System.out.println("Punto 2: " + p5);
        Point suma = p4.add(p5);
        System.out.println("Resultado de la suma: " + suma);
        assert suma.getX() == 6 : "X debe ser 6";
        assert suma.getY() == 8 : "Y debe ser 8";
        // Verificar que los puntos originales no cambien
        assert p4.getX() == 2 && p4.getY() == 3 : "El primer punto no debe cambiar";
        assert p5.getX() == 4 && p5.getY() == 5 : "El segundo punto no debe cambiar";
        System.out.println("✓ Prueba superada\n");
    }

    /**
     * Prueba 5: equals y toString
     */
    public static void testEqualsAndToString() {
        System.out.println("Test 5: equals y toString");
        Point p6 = new Point(2, 3);
        Point p7 = new Point(2, 3);
        Point p8 = new Point(1, 1);
        System.out.println("Punto 1: " + p6);
        System.out.println("Punto 2: " + p7);
        System.out.println("Punto 3: " + p8);
        assert p6.equals(p7) : "Los puntos con las mismas coordenadas deben ser iguales";
        assert !p6.equals(p8) : "Los puntos con diferentes coordenadas no deben ser iguales";
        System.out.println("✓ Prueba superada\n");
    }
}
