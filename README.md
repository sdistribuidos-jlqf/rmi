# Práctica: Invocación de Métodos Remotos (RMI) en Java

## Descripción

En esta práctica se implementa un sistema cliente-servidor utilizando **RMI (Remote Method Invocation)** en Java.  
El objetivo es comprender cómo invocar métodos de manera remota, abstraiendo la comunicación de bajo nivel que se realiza con sockets.

A diferencia de los sockets, RMI permite trabajar directamente con **objetos distribuidos**, facilitando el desarrollo de aplicaciones distribuidas.

---

## Estructura del proyecto

```
.
├── Operaciones.java
├── ImplOperaciones.java
├── Servidor.java
├── Cliente.java
```

---

## Requisitos

- Java JDK 8 o superior
- Conectividad de red (si se ejecuta en máquinas distintas)

---

## Compilación

```bash
javac *.java
```

---

## Ejecución

### 1. Iniciar el registro RMI (solo una vez en el servidor)

```bash
rmiregistry &
```

### 2. Ejecutar el servidor

```bash
java Servidor
```

### 3. Ejecutar el cliente

```bash
java Cliente
```

---

## Funcionamiento

1. El cliente se conecta al registro RMI del servidor.
2. Busca el objeto remoto registrado como **Calculadora**.
3. Invoca el método `factorial`.
4. El servidor ejecuta la operación y devuelve el resultado.

---

## Ejemplo de salida

```
Factorial de 30: 265252859812191058636308480000000
```

---


## Comparación rápida: RMI vs Sockets

| Característica | Sockets | RMI |
|--------------|--------|-----|
| Nivel | Bajo | Alto |
| Comunicación | Mensajes | Objetos |
| Serialización | Manual | Automática |
| Complejidad | Mayor | Menor |

---

## Autor

José Luis Quiroz Fabián
