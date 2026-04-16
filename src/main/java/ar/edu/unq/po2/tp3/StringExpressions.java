package ar.edu.unq.po2.tp3;

/**
 * Análisis de Expresiones con Strings en Java
 * 
 * Dado el código:
 * 
 * String a = "abc";
 * String s = a;
 * String t;
 * 
 * A continuación se analiza cada expresión:
 */
public class StringExpressions {

    /**
     * EXPRESIÓN 1: s.length()
     * 
     * Retorna: 3
     * 
     * Explicación:
     * s está asignado a a, que contiene "abc"
     * El método length() retorna la cantidad de caracteres en el string
     * "abc" tiene 3 caracteres
     */
    public static void expresion1() {
        String a = "abc";
        String s = a;
        System.out.println("1. s.length() = " + s.length());  // Output: 3
    }

    /**
     * EXPRESIÓN 2: t.length()
     * 
     * ERROR: NullPointerException
     * 
     * Explicación:
     * t está declarada pero no inicializada, por lo tanto contiene null
     * Intentar llamar un método sobre null (incluso length()) lanza NullPointerException
     */
    public static void expresion2() {
        String t = null;  // Declarada pero no inicializada (o asignada explícitamente a null)
        try {
            System.out.println("2. t.length() = " + t.length());
        } catch (NullPointerException e) {
            System.out.println("2. t.length() -> ERROR: NullPointerException (t no está inicializada)");
        }
    }

    /**
     * EXPRESIÓN 3: 1 + a
     * 
     * Retorna: "1abc"
     * 
     * Explicación:
     * Cuando se suma un número con un String, Java realiza conversión implícita
     * del número a String y luego concatena
     * 1 (int) se convierte a "1" (String)
     * "1" + "abc" = "1abc"
     */
    public static void expresion3() {
        String a = "abc";
        Object result = 1 + a;
        System.out.println("3. 1 + a = " + result);  // Output: 1abc
    }

    /**
     * EXPRESIÓN 4: a.toUpperCase()
     * 
     * Retorna: "ABC"
     * 
     * Explicación:
     * El método toUpperCase() retorna un nuevo String con todos los caracteres
     * convertidos a mayúsculas
     * "abc".toUpperCase() = "ABC"
     * 
     * Nota: "a" no se modifica, los Strings son inmutables en Java
     */
    public static void expresion4() {
        String a = "abc";
        System.out.println("4. a.toUpperCase() = " + a.toUpperCase());  // Output: ABC
    }

    /**
     * EXPRESIÓN 5: "Libertad".indexOf("r")
     * 
     * Retorna: 4
     * 
     * Explicación:
     * El método indexOf() retorna el índice (posición) de la primera ocurrencia
     * de una substring
     * Posiciones: L(0) i(1) b(2) e(3) r(4) t(5) a(6) d(7)
     * "r" se encuentra en la posición 4
     */
    public static void expresion5() {
        System.out.println("5. \"Libertad\".indexOf(\"r\") = " + "Libertad".indexOf("r"));  // Output: 4
    }

    /**
     * EXPRESIÓN 6: "Universidad".lastIndexOf('i')
     * 
     * Retorna: 8
     * 
     * Explicación:
     * El método lastIndexOf() retorna el índice de la ÚLTIMA ocurrencia del carácter
     * Posiciones: U(0) n(1) i(2) v(3) e(4) r(5) s(6) i(7) d(8) a(9) d(10)
     * Hay dos 'i' en las posiciones 2 y 7
     * lastIndexOf('i') retorna 7 (la última ocurrencia)
     * 
     * ACLARACIÓN: La posición correcta es 7, no 8
     */
    public static void expresion6() {
        System.out.println("6. \"Universidad\".lastIndexOf('i') = " + "Universidad".lastIndexOf('i'));  // Output: 7
    }

    /**
     * EXPRESIÓN 7: "Quilmes".substring(2,4)
     * 
     * Retorna: "il"
     * 
     * Explicación:
     * substring(inicio, fin) retorna una substring desde el índice inicio (incluido)
     * hasta el índice fin (excluido)
     * Posiciones: Q(0) u(1) i(2) l(3) m(4) e(5) s(6)
     * substring(2, 4) = caracteres en posiciones 2 y 3 = "il"
     */
    public static void expresion7() {
        System.out.println("7. \"Quilmes\".substring(2,4) = " + "Quilmes".substring(2, 4));  // Output: il
    }

    /**
     * EXPRESIÓN 8: (a.length() + a).startsWith("a")
     * 
     * Retorna: false
     * 
     * Explicación:
     * Primero se resuelve la expresión entre paréntesis:
     * a.length() = 3 (ya que a = "abc")
     * 3 + a convierte el número a string y concatena: "3" + "abc" = "3abc"
     * Luego se aplica startsWith("a"):
     * "3abc".startsWith("a") = false (comienza con "3", no con "a")
     */
    public static void expresion8() {
        String a = "abc";
        System.out.println("8. (a.length() + a).startsWith(\"a\") = " + (a.length() + a).startsWith("a"));  // Output: false
    }

    /**
     * EXPRESIÓN 9: s == a
     * 
     * Retorna: true
     * 
     * Explicación:
     * El operador == compara referencias (no contenido) en caso de objetos
     * s = a significa que ambas variables apuntan al MISMO objeto en memoria
     * Por lo tanto, s == a retorna true
     * 
     * Nota: Si hubiéramos hecho s = new String(a), habría retornado false
     * aunque el contenido fuera igual
     */
    public static void expresion9() {
        String a = "abc";
        String s = a;
        System.out.println("9. s == a = " + (s == a));  // Output: true
    }

    /**
     * EXPRESIÓN 10: a.substring(1,3).equals("bc")
     * 
     * Retorna: true
     * 
     * Explicación:
     * a = "abc"
     * a.substring(1, 3) extrae caracteres desde índice 1 (incluido) hasta 3 (excluido)
     * Posiciones: a(0) b(1) c(2)
     * substring(1, 3) = "bc"
     * "bc".equals("bc") = true
     * 
     * Nota: equals() compara el CONTENIDO de los strings, no las referencias
     */
    public static void expresion10() {
        String a = "abc";
        System.out.println("10. a.substring(1,3).equals(\"bc\") = " + a.substring(1, 3).equals("bc"));  // Output: true
    }

    /**
     * Método principal que ejecuta todos los análisis
     */
    public static void main(String[] args) {
        System.out.println("=== ANÁLISIS DE EXPRESIONES CON STRINGS ===\n");

        expresion1();
        expresion2();
        expresion3();
        expresion4();
        expresion5();
        expresion6();
        expresion7();
        expresion8();
        expresion9();
        expresion10();

        System.out.println("\n=== RESUMEN ===");
        System.out.println("1. s.length() -> 3");
        System.out.println("2. t.length() -> ERROR: NullPointerException");
        System.out.println("3. 1 + a -> \"1abc\"");
        System.out.println("4. a.toUpperCase() -> \"ABC\"");
        System.out.println("5. \"Libertad\".indexOf(\"r\") -> 4");
        System.out.println("6. \"Universidad\".lastIndexOf('i') -> 7");
        System.out.println("7. \"Quilmes\".substring(2,4) -> \"il\"");
        System.out.println("8. (a.length() + a).startsWith(\"a\") -> false");
        System.out.println("9. s == a -> true");
        System.out.println("10. a.substring(1,3).equals(\"bc\") -> true");
    }
}
