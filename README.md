# Hoja de Trabajo #4  
## Pilas, Listas y Evaluación de Expresiones

## Integrantes:

Hector E. Duarte Lambour - 25939

Edgar R. Guevara de Leon - 251154

### Descripción
Programa en Java que:

1. Lee una expresión infix desde `datos.txt`
2. La convierte a postfix
3. Evalúa la expresión postfix
4. Muestra el resultado en consola

Ejemplo:

Entrada en datos.txt:
(10+20)*9

Salida:
Postfix: 10 20 + 9 *
Resultado: 270.0


---

## Implementaciones

### Stack (Pila)
- Interfaz
- Clase abstracta
- Implementaciones:
  - ArrayList
  - Vector
  - Lista

### List (Lista)
- Interfaz
- Clase abstracta
- Implementaciones:
  - Simplemente enlazada
  - Doblemente enlazada

---

## Características
- Uso de genéricos
- Conversión infix → postfix
- Evaluación postfix
- Selección dinámica de implementación
- Pruebas unitarias con JUnit

---

## Cómo ejecutar

1. Crear archivo `datos.txt` en la raíz del proyecto.
2. Escribir la expresión infix.
3. Ejecutar `Main`.
4. Elegir la implementación deseada.