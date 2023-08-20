# Pilares-POO
## 1) Abstracción
### Explicación
La abstracción se trata de simplificar la realidad al modelar objetos y conceptos complejos en el software. En lugar de tratar con todos los detalles específicos de un objeto, se destacan solo los aspectos relevantes para la tarea en cuestión. 
### Ejemplos:
## 2) Encapsulamiento
### Explicación
La encapsulación consiste en agrupar datos y los métodos (funciones) que operan sobre esos datos en una única entidad llamada "clase". Una clase encapsula la implementación interna de un objeto y proporciona una interfaz pública para interactuar con él. Esto significa que el código externo no necesita conocer los detalles internos de cómo funciona la clase, solo necesita utilizar los métodos públicos proporcionados.
### Ejemplos:
## 3) Herencia
### Explicación
 La herencia es una relación especial entre dos clases, la clase ***Padre*** o la ***SuperClase*** y la clase ***Hija*** en donde la clase Hija obtiene la habilidad de utilizar ciertas propiedades y funcionalidades de la clase Padre. La idea es que la clase Hija “hereda” los métodos y atributos de la clase Padre.  
Una de las ventajas que ofrece la Herencia es la reutilización de código en el programa, puesto que permite ahorrar trabajo al realizar un cambio en en el sistema al permitir que un solo algoritmo pueda procesar distintas clases de entidades.
### Ejemplos: 
#### 1. Herencia Única
|Digrama UML|Ingresar Información|Mostrar Información|
|-----|--------|--------|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/ea2b7d8e-1ee1-4263-9b8f-d2f6e1a6c805 "Diagrama UML")|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/cdfe5547-e145-431c-acf1-a5937ef19635)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/44e7f0a6-c69b-499a-863e-33da2148c268)| 

*La clase Gato hereda los métodos y atributos de la clase Mascota, por lo cual se puede acceder y setear el nombre de la mascota, del dueño y la dieta* 
#### 2. Herencia Jerárquica
|Digrama UML|Ingresar Información|Mostrar Información|
|-----|--------|--------|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/0fb685e4-6627-4469-84a1-d38df5e77130)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/cdfe5547-e145-431c-acf1-a5937ef19635)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/44e7f0a6-c69b-499a-863e-33da2148c268)| 

#### 3. Herencia Multinivel

## 4) Polimorfismo
### Explicación
El polimorfismo permite tratar objetos de diferentes clases de manera uniforme a través de una interfaz común. Puedes crear métodos en una superclase que pueden ser implementados de manera diferente en las subclases. Esto permite que distintos objetos respondan a una misma llamada de método de manera adecuada según su tipo.
### Ejemplos:
