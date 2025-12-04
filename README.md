# Proyecto: Modelado del Mundo Real a Objetos en Java

Este proyecto corresponde a una actividad práctica del **SENA – Análisis y Desarrollo de Software**, en la cual se debe representar objetos del mundo real utilizando **Programación Orientada a Objetos (POO) en Java**.

El proyecto incluye varias clases que representan objetos reales (Bolso, CascoMoto, ParlantePhonic), sus atributos, métodos y una clase principal donde se crean las instancias y se visualizan en consola.

---

## 📌 **Objetivos del Proyecto**

- Comprender el proceso de **modelar objetos del mundo real** mediante clases.
- Aplicar los conceptos fundamentales de POO:
  - **Clases y objetos**
  - **Atributos y métodos**
  - **Constructores**
  - **Encapsulamiento**
  - **Sobrescritura del método `toString()`**
- Organizar el código utilizando la estructura estándar de un proyecto Java con Maven.

---

## 📂 **Estructura del Proyecto**

src
└── main
    └── java
        ├── com.example 
        │   └── Main.java
        └── modelo
            ├── Bolso.java
            ├── CascoMoto.java
            └── ParlantePhonic.java

---

## 🧱 **Clases Incluidas**

### 👜 **Bolso**
Representa un bolso real con atributos como:
- Marca  
- Precio  
- Altura  
- Capacidad en litros  
- Cierre  
- Fecha de compra  
- Lista de colores  

---

### 🔊 **ParlantePhonic**
Simula un parlante portátil:
- Marca 
- Modelo  
- Precio  
- Portátil (boolean)  
- Potencia en watts  
- Fecha de fabricación  

---

### 🪖 **CascoMoto**
Representa un casco de motocicleta con:
- Fabricante  
- Talla  
- Tiene Intercomunicador 
- Batería  
- Contactos Pareados  
- Parlante integrado  

---

## 🖥️ **Salida en Consola**

El programa imprime los objetos creados usando toString().
Ejemplo:

```bash
Bolso:
  Marca: MarcaGenérica
  Precio: 49.99
  Alto (cm): 30.0
  Capacidad (L): 8
  Con cierre: true
  Fecha de compra: 2025-11-03
  Colores: [rojo, amarillo]
```

---

## **Requisitos**

- Java 17 o superior
- Maven 3+
- IDE recomendado: IntelliJ IDEA / VS Code / NetBeans

### 📘 **Conceptos Aplicados**

- Modelado de objetos

- Encapsulamiento

- Listas en Java

- Sobrescritura del método toString()

- Paquetes y organización de código

## **Autor**

Mateo Betancur Escobar
Ficha: 3144585
📍 ADSO – SENA
📧 betancurmateo116@gmail.com
📱 3136045753
