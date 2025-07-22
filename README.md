# 🧭 Java Mapping Demo: ModelMapper, Orika y MapStruct

Este proyecto Java demuestra cómo realizar mapeos de entidades a DTOs utilizando tres librerías populares de mapeo: **ModelMapper**, **Orika** y **MapStruct**.

---

## 📦 Tecnologías usadas

- **Java 17**
- **Spring Boot 3.2**
- **MapStruct 1.5.5.Final**
- **ModelMapper 3.0.0**
- **Orika 1.4.2**
- **Maven**
- **Lombok**

---

## 📚 Descripción

En este proyecto encontrarás cómo transformar objetos de tipo `Person` a diferentes tipos de DTOs utilizando tres estrategias de mapeo:

### 🔁 Librerías implementadas

- ✅ **ModelMapper**: Mapeo flexible con configuración en tiempo de ejecución.
- ✅ **Orika**: Mapeo por rendimiento y velocidad, ideal para estructuras complejas.
- ✅ **MapStruct**: Mapeo compile-time, altamente eficiente y fácil de mantener.

Cada enfoque está encapsulado en métodos independientes, lo que facilita la comparación de estilos, rendimiento y legibilidad.

---

## 🧪 Ejecución

Puedes ejecutar la clase `Main.java` para ver los resultados de los tres mapeos impresos en consola:

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.mappers.mapstruct.Main"

src/
└── main/
    ├── java/
    │   └── com.mappers.mapstruct/
    │       ├── dto/          # Clases DTO
    │       ├── entities/     # Clases entidad (ej. Person)
    │       ├── mapper/       # MapStruct interface
    │       └── Main.java     # Punto de entrada
    └── resources/

✅ Objetivos de aprendizaje
Comparar diferentes técnicas de mapeo en Java

Entender ventajas/desventajas de mapeo dinámico vs compile-time

Implementar MapStruct correctamente con Maven y Lombok

Mostrar buenas prácticas de organización de código para proyectos Java


