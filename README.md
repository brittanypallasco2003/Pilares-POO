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
*La clase Gato hereda los métodos y atributos de la clase Mascota, por lo cual se puede acceder y setear el nombre de la mascota y del dueño.* 
|Diagrama UML|Ingresar Información|Mostrar Información|
|-----|--------|--------|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/a2fd1404-0d01-4e91-8dae-28872313f999)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/88e6c0a9-2f3f-403e-8b2e-3db9faaa9e02)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/d4679860-0fe7-4e8c-a8cf-03ac1d801eb4)|  

#### 2. Herencia Jerárquica
*La clase Mascota sirve como una superclase para más de una subclase o clase hija (Gato, Perro, Conejo).*

|Diagrama UML|Ingresar Información|Mostrar Información|
|-----|--------|--------|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/28e27793-f7d4-4305-ba9b-6d83024d6f9f)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/0f8c5fd4-df4f-408f-a4de-c9019bac76c1) ![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/633b9838-7aef-49b8-87d1-b93bd81b45b5)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/ac6a9767-4f11-4cf5-9ebe-267425526c31)|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/22fce799-4619-4980-b48d-bf238f0e48ab)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/8b98b09d-4016-480f-8c28-0f2c2e3753b1)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/711fac96-02d2-4540-a4e1-fb3c0093c427)|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/2c019aa8-df0c-4a99-ac6a-f7cccaf7713e)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/f0165636-4458-4453-a4b2-b54d0960c73f)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/4dc682e8-c617-40b0-ac20-d99055e1c463)|
#### 3. Herencia Multinivel

## 4) Polimorfismo
### Explicación
El polimorfismo permite tratar objetos de diferentes clases de manera uniforme a través de una interfaz común. Puedes crear métodos en una superclase que pueden ser implementados de manera diferente en las subclases. Esto permite que distintos objetos respondan a una misma llamada de método de manera adecuada según su tipo.
### Ejemplos:
