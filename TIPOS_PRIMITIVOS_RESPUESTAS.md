# Tipos Primitivos en Java - Respuestas al TP3

## 1. ¿Qué son los tipos de datos primitivos?

Los **tipos de datos primitivos** en Java son 8 tipos fundamentales que almacenan valores simples directamente en la memoria, sin ser objetos. Son proporcionados como parte del lenguaje Java y tienen comportamientos especiales.

### Los 8 tipos primitivos de Java:

| Tipo | Tamaño | Rango | Valor Predeterminado |
|------|--------|-------|----------------------|
| `byte` | 8 bits | -128 a 127 | 0 |
| `short` | 16 bits | -32,768 a 32,767 | 0 |
| `int` | 32 bits | -2,147,483,648 a 2,147,483,647 | 0 |
| `long` | 64 bits | -2^63 a 2^63-1 | 0L |
| `float` | 32 bits | Números decimales (precisión simple) | 0.0f |
| `double` | 64 bits | Números decimales (precisión doble) | 0.0 |
| `boolean` | N/A | `true` o `false` | `false` |
| `char` | 16 bits | 0 a 65,535 (caracteres Unicode) | `'\u0000'` |

### Características principales:
- **Se almacenan directamente en la variable** (no es una referencia)
- **No pueden ser null** (solo tienen valores predeterminados)
- **Son más rápidos y usan menos memoria** que sus equivalentes de clase
- **No tienen métodos** (a diferencia de sus clases wrapper)

---

## 2. ¿Cuál es la diferencia entre `int` e `Integer`?

### `int` (Tipo Primitivo)
```java
int numero = 42;
```
- **Tipo**: Primitivo
- **Almacenamiento**: Valor se guarda directamente en la variable
- **Puede ser null**: ❌ No
- **Valor predeterminado (variable de instancia)**: `0`
- **Valor predeterminado (variable local)**: Sin valor predeterminado (debe inicializarse)
- **Velocidad**: Rápido
- **Memoria**: Optimizada
- **Métodos**: No tiene métodos
- **Uso**: Cálculos, operaciones aritméticas

### `Integer` (Clase Wrapper)
```java
Integer numero = 42;
```
- **Tipo**: Clase (objeto)
- **Almacenamiento**: Referencia a un objeto en el heap
- **Puede ser null**: ✅ Sí
- **Valor predeterminado (variable de instancia)**: `null`
- **Valor predeterminado (variable local)**: Sin valor predeterminado (debe inicializarse)
- **Velocidad**: Más lento (es un objeto)
- **Memoria**: Más consumo (overhead de objeto)
- **Métodos**: Sí, ej: `Integer.parseInt()`, `Integer.MAX_VALUE`, `toString()`, etc.
- **Uso**: Casos donde necesitas null, colecciones genéricas

### Tabla comparativa:

| Aspecto | `int` | `Integer` |
|---------|-------|-----------|
| Tipo | Primitivo | Clase (Wrapper) |
| Almacenaje | Valor directo | Referencia a objeto |
| `null` | ❌ No | ✅ Sí |
| Predeterminado (instancia) | 0 | null |
| Velocidad | Rápido | Lento |
| Métodos | No | Sí |
| Uso en colecciones | ❌ No | ✅ Sí (`ArrayList<Integer>`) |

---

## 3. Valor predeterminado para variables de instancia

### Respuesta: Variables de Instancia

**`int` (primitivo):**
- **Valor predeterminado: `0`**
- Se inicializa automáticamente

**`Integer` (objeto):**
- **Valor predeterminado: `null`**
- No hace referencia a ningún objeto

### Código de ejemplo:

```java
public class Ejemplo {
    private int intPrimitivo;      // Predeterminado: 0
    private Integer intObjeto;     // Predeterminado: null
    
    public void demostrar() {
        System.out.println(intPrimitivo);  // Imprime: 0
        System.out.println(intObjeto);     // Imprime: null
    }
}
```

### Por qué ocurre esto:
- Las **variables de instancia** se inicializan automáticamente cuando se crea un objeto
- Los **tipos primitivos** se inicializan a sus valores numéricos/lógicos predeterminados
- Los **tipos de objeto** se inicializan a `null`

---

## 4. Valor predeterminado para variables de método (variables locales)

### Respuesta: Variables Locales

**⚠️ Las variables locales NO tienen valores predeterminados**

Tanto `int` como `Integer` (ni ningún otro tipo) tienen valores predeterminados en variables locales.

### Código de ejemplo:

```java
public void demostrar() {
    int intLocal;          // ❌ ERROR: no inicializada
    Integer integerLocal;  // ❌ ERROR: no inicializada
    
    System.out.println(intLocal);      // ❌ COMPILER ERROR: "variable might not have been initialized"
    System.out.println(integerLocal);  // ❌ COMPILER ERROR: "variable might not have been initialized"
    
    // Solución: DEBEN inicializarse explícitamente
    int intLocal2 = 0;           // ✅ Correcto
    Integer integerLocal2 = null; // ✅ Correcto
    
    System.out.println(intLocal2);      // Imprime: 0
    System.out.println(integerLocal2);  // Imprime: null
}
```

### Diferencia clave: Variables de Instancia vs Variables Locales

| Aspecto | Variables de Instancia | Variables Locales |
|---------|----------------------|-------------------|
| **Ubicación** | Dentro de la clase | Dentro de métodos/bloques |
| **Inicialización automática** | ✅ Sí | ❌ No |
| **Valor predeterminado (primitivo)** | Valores numéricos/false | No hay |
| **Valor predeterminado (objeto)** | null | No hay |
| **Compilación** | Se inicializa sin código | Debe inicializarse explícitamente |
| **Causa de error** | Nunca | Si se usa sin inicializar |

### Por qué ocurre esta diferencia:

1. **Variables de instancia**: Forman parte del estado del objeto, por lo que Java garantiza iniciarlas cuando se crea el objeto.

2. **Variables locales**: Son temporales dentro de un método. Java no puede asumir cuál debería ser su valor inicial, por lo que te obliga a inicializarlas explícitamente.

---

## Resumen de Respuestas

| Pregunta | Respuesta |
|----------|-----------|
| 1️⃣ Tipos primitivos | 8 tipos fundamentales que almacenan valores directamente (byte, short, int, long, float, double, boolean, char) |
| 2️⃣ int vs Integer | `int` es primitivo y rápido; `Integer` es objeto y puede ser null |
| 3️⃣ Valor predeterminado (instancia) | `int`: 0 | `Integer`: null |
| 4️⃣ Valor predeterminado (método/local) | Ambos: NO tienen valor predeterminado (deben inicializarse) |

---

## Notas Adicionales

### Autoboxing y Unboxing
Java permite conversiones automáticas entre primitivos y sus wrappers:

```java
int x = 5;
Integer obj = x;           // Autoboxing automático
int y = obj;               // Unboxing automático

// ⚠️ Cuidado con null:
Integer objNull = null;
int z = objNull;           // ❌ NullPointerException
```

### Uso en Colecciones
Los tipos primitivos no pueden usarse directamente en colecciones genéricas:

```java
// ❌ No funciona:
List<int> lista = new ArrayList<>();

// ✅ Funciona:
List<Integer> lista = new ArrayList<>();
```

---

## Referencias
- [Documentación Oficial de Java - Primitive Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Documentación Oficial de Java - Autoboxing](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html)
