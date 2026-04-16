# Estructura de Paquetes y Compilación - Respuestas

## 📋 Resumen Rápido

Se crearon **3 clases simples** en 3 paquetes diferentes:
- `model.Persona` ✅
- `model.gui.Ventana` ✅
- `model.stack.Pila` ✅

Se compilaron exitosamente con **Maven** (`mvn compile`)

---

## 1️⃣ ¿Cómo están organizadas en el sistema de archivos?

### 📂 Archivos Fuente (.java)

```
src/main/java/model/
├── Persona.java              ← package model
├── gui/
│   └── Ventana.java         ← package model.gui
└── stack/
    └── Pila.java            ← package model.stack
```

### Rutas completas:
```
/workspaces/unqui-po2-monicault/src/main/java/model/Persona.java
/workspaces/unqui-po2-monicault/src/main/java/model/gui/Ventana.java
/workspaces/unqui-po2-monicault/src/main/java/model/stack/Pila.java
```

### 🏗️ Archivos Compilados (.class)

```
target/classes/model/
├── Persona.class            ← class model
├── gui/
│   └── Ventana.class       ← class model.gui
└── stack/
    └── Pila.class          ← class model.stack
```

### Rutas completas compiladas:
```
/workspaces/unqui-po2-monicault/target/classes/model/Persona.class
/workspaces/unqui-po2-monicault/target/classes/model/gui/Ventana.class
/workspaces/unqui-po2-monicault/target/classes/model/stack/Pila.class
```

---

## 2️⃣ Relación entre el nombre del paquete y la ubicación de archivos

### 📌 REGLA FUNDAMENTAL DE JAVA:

> **El nombre del paquete determina directamente la estructura de directorios**

### Comparación específica:

| Paquete | Archivo .java | Carpeta .java | Archivo .class | Carpeta .class |
|---------|------|---------|-------|----------|
| `model` | `Persona.java` | `model/` | `Persona.class` | `model/` |
| `model.gui` | `Ventana.java` | `model/gui/` | `Ventana.class` | `model/gui/` |
| `model.stack` | `Pila.java` | `model/stack/` | `Pila.class` | `model/stack/` |

### 🔍 Ejemplo Detallado: `model.gui.Ventana`

```
Declaración en código:
┌────────────────────────────────────┐
│ package model.gui;                 │
│ public class Ventana { ... }       │
└────────────────────────────────────┘
                 ↓
        (determina estructura)
                 ↓
Archivo fuente debe estar:
┌────────────────────────────────────┐
│ src/main/java/model/gui/Ventana.java
└────────────────────────────────────┘
                 ↓
        (al compilar)
                 ↓
Archivo compilado estará:
┌────────────────────────────────────┐
│ target/classes/model/gui/Ventana.class
└────────────────────────────────────┘
```

---

## 🎯 Relaciones Clave

### 1. **Puntos separados por puntos = subdirectorios**

```
Paquete: model.gui.ventanas.dialogs
         ↓    ↓    ↓         ↓
Ruta:    model/gui/ventanas/dialogs/
         (cada punto = un nivel más)
```

### 2. **Nombres de directorio = nombres de paquete**

- Paquete `model` → Directorio `model/`
- Paquete `model.gui` → Directorio `model/gui/`
- Paquete `model.gui.ventanas` → Directorio `model/gui/ventanas/`

### 3. **La estructura es idéntica para .java y .class**

```
Fuentes:        Compilados:
model/          model/
├── Persona.java   ├── Persona.class
├── gui/           ├── gui/
│   └── Ventana.java   │   └── Ventana.class
└── stack/         └── stack/
    └── Pila.java      └── Pila.class
```

---

## 📊 Resumen Visual

```
═══════════════════════════════════════════════════════════
                 RELACIÓN PAQUETES-DIRECTORIOS
═══════════════════════════════════════════════════════════

CÓDIGO FUENTE (.java):
    package model;
    public class Persona { }
         ↓
    src/main/java/model/Persona.java

CÓDIGO COMPILADO (.class):
    (mismo paquete, misma estructura)
         ↓
    target/classes/model/Persona.class

───────────────────────────────────────────────────────────

CÓDIGO FUENTE (.java):
    package model.gui;
    public class Ventana { }
         ↓
    src/main/java/model/gui/Ventana.java

CÓDIGO COMPILADO (.class):
    (mismo paquete, misma estructura)
         ↓
    target/classes/model/gui/Ventana.class

═══════════════════════════════════════════════════════════
```

---

## 💡 Por qué es así

Java hace esta separación por estas razones:

1. **Organización**: Los paquetes organizan el código de forma lógica
2. **Evita conflictos**: Dos clases con el mismo nombre pueden coexistir en paquetes diferentes
3. **Accesibilidad**: El paquete determina el acceso (public, private, protected)
4. **Carga dinámica**: Java necesita encontrar las clases en la estructura de directorios

---

## 🚀 Compilación

Compilamos usando **Maven**:

```bash
mvn clean compile
```

Esto:
1. Limpia la carpeta `target/` anterior
2. Lee los archivos `.java` de `src/main/java/`
3. Genera los `.class` en `target/classes/` 
4. **Mantiene la misma estructura de directorios**

---

## ✅ Conclusión

**La respuesta a ambas preguntas en una frase:**

> El nombre del paquete (separado por puntos) se convierte directamente en la ruta de directorios (separada por `/`), tanto para archivos fuente `.java` como para archivos compilados `.class`.

**Lo importante de recordar:**
- `package model` → carpeta `model/`
- `package model.gui` → carpeta `model/gui/`
- `package model.stack` → carpeta `model/stack/`
- Esto es mandatorio en Java, no es opcional
