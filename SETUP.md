# Entorno de Desarrollo Java - Configurado

Tu codespace está configurado para desarrollar en Java como lo harías en Eclipse.

## ✅ Instalado

- **Java Development Kit (JDK) 25 LTS** - OpenJDK de Microsoft
- **Maven 4.0.0-rc-5** - Gestor de dependencias y construcción
- **Extensiones de VS Code:**
  - Extension Pack for Java (Language Support, Debugger, Test Runner)
  - Maven for Java
  - Spring Boot Dashboard

## 📁 Estructura del Proyecto

```
src/
├── main/
│   ├── java/          # Código fuente
│   └── resources/     # Recursos (config, etc)
└── test/
    ├── java/          # Tests
    └── resources/     # Recursos de test
pom.xml               # Configuración de Maven
```

## 🚀 Primeros Pasos

1. **Compilar el proyecto:**
   ```bash
   mvn clean compile
   ```

2. **Ejecutar tests:**
   ```bash
   mvn test
   ```

3. **Empaquetar:**
   ```bash
   mvn package
   ```

4. **Ejecutar la aplicación:**
   ```bash
   mvn exec:java -Dexec.mainClass="Main"
   ```

## 🔧 Características Tipo Eclipse

- **IntelliSense completo** con Java Language Server
- **Debugging integrado** - Establece breakpoints y depura como en Eclipse
- **Refactoring** - Renombra variables, extrae métodos, etc.
- **Unit Testing** - Ejecuta tests directamente desde VS Code
- **Maven Projects** - Gestión de dependencias y construcción
- **Spring Boot** - Si decides usar Spring Boot (dashboard incluido)

## 💡 Atajos Útiles (VS Code - Like Eclipse)

- `Ctrl+Shift+O` - Organizar imports
- `Ctrl+.` - Acciones rápidas (generar getters/setters, etc)
- `F11` o `Ctrl+Shift+D` - Debug
- `Ctrl+Shift+T` - Crear tests

¡Tu entorno está listo para codificar! 🎉
