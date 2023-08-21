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
|----------------|--------|--------|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/a2fd1404-0d01-4e91-8dae-28872313f999)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/88e6c0a9-2f3f-403e-8b2e-3db9faaa9e02)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/d4679860-0fe7-4e8c-a8cf-03ac1d801eb4)|  

#### 2. Herencia Jerárquica
*La clase Mascota sirve como una superclase para más de una subclase o clase hija (Gato, Perro, Conejo).*
|Diagrama UML|
|-----|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/28e27793-f7d4-4305-ba9b-6d83024d6f9f)|

|Clases Diagrama UML|Ingresar Información|Mostrar Información|
|-----|--------|--------|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/9c54411c-9569-493d-aa49-61b0ee881b05) ![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/b27094a4-7b23-4df3-b84b-6d33bc99610c)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/0f8c5fd4-df4f-408f-a4de-c9019bac76c1) ![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/633b9838-7aef-49b8-87d1-b93bd81b45b5)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/ac6a9767-4f11-4cf5-9ebe-267425526c31)|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/19f4d26c-1414-4e81-84e5-376ec5d67f7c)![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/22fce799-4619-4980-b48d-bf238f0e48ab)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/8b98b09d-4016-480f-8c28-0f2c2e3753b1)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/711fac96-02d2-4540-a4e1-fb3c0093c427)|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/16970bf0-1622-4b3f-9b93-02303e80e195) ![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/2c019aa8-df0c-4a99-ac6a-f7cccaf7713e)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/f0165636-4458-4453-a4b2-b54d0960c73f)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/4dc682e8-c617-40b0-ac20-d99055e1c463)|
#### 3. Herencia Multinivel
*La **clase "nieta" (Perro)** heredará los métodos y atributos de una **clase padre (Mascota)** y, además, la clase Mascota también heredará los métodos y atributos de una **clase "Abuela" (Animal_Dom)** como la clase Padre de la clase Mascota y abuela de la clase Perro. La **clase Lobo es hija** de la **clase Padre, Animal_Salv**.*
|Diagrama UML|
|-----|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/ac961353-e33f-49c3-9cff-1a96026b9073)|

|Ingresar Información|Mostrar Información|
|-----|-----|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/80614a35-1990-4a20-a91b-91f338a071be)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/743c2e17-0753-4cb2-aa1d-283f2f97d69f)|
|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/0125b5bf-6cab-4072-9cd8-4f04b338712f)|![image](https://github.com/brittanypallasco2003/Pilares-POO/assets/117743650/c9725581-9215-4e78-affa-f62a72d5452a)|
## 4) Polimorfismo
### Explicación
El polimorfismo permite tratar objetos de diferentes clases de manera uniforme a través de una interfaz común. Puedes crear métodos en una superclase que pueden ser implementados de manera diferente en las subclases. Esto permite que distintos objetos respondan a una misma llamada de método de manera adecuada según su tipo.
### Ejemplos:
### 1.
Supongamos que tenemos una jerarquía de clases que representan diferentes formas geométricas, como círculos y rectángulos.

![img.png](src/Polimorfismo/img/img.png)

Cada forma geométrica debe calcular su área. Para lograr el polimorfismo, podemos crear una interfaz común llamada "Shape" que define el método para calcular el área.

|![img.png](src/Polimorfismo/img/img2.png)|![img.png](src/Polimorfismo/img/img3.png)|
|-|-|
y luego las clases "Circle" y "Rectangle" implementarán esta interfaz y proporcionarán su propia implementación del cálculo del área.

|![img.png](src/Polimorfismo/img/img4.png)|![img.png](src/Polimorfismo/img/img5.png)|
|-|-|

En este ejemplo, tanto el objeto circle como el objeto rectangle pueden ser tratados de manera uniforme a través de la interfaz Shape, lo que permite llamar al método calculateArea() sin preocuparse por las diferencias específicas entre círculos y rectángulos. Esto es el polimorfismo en acción.
