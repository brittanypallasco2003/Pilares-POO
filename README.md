# Pilares-POO
## 1) Abstracción
### Explicación
La abstracción se trata de simplificar la realidad al modelar objetos y conceptos complejos en el software. En lugar de tratar con todos los detalles específicos de un objeto, se destacan solo los aspectos relevantes para la tarea en cuestión. 
### Ejemplos:
#### 1. Ejemplo Abstracción Carros
| ![img.png](img/img.png)<br/>En este ejemplo, se utiliza la abstracción para definir una clase base abstracta llamada Vehicle. Esta clase tiene dos métodos abstractos: start() y stop(), que representan acciones genéricas de encendido y apagado de un vehículo. | ![img_1.png](img/img_1.png)<br/>Las clases derivadas Car y Motorcycle heredan de la clase Vehicle y proporcionan implementaciones específicas para los métodos start() y stop() según el tipo de vehículo.| ![img_2.png](img/img_2.png)En el método main, se crean instancias de las clases Car y Motorcycle y se llama a los métodos start() y stop() en cada una. La abstracción permite tratar a los vehículos de manera general, sin preocuparse por los detalles específicos de su funcionamiento interno.|
|--------------------------|----|----|
![img_12.png](img/img_12.png)

#### 2. Ejemplo Abstracción Geométrica
|![img_3.png](img/img_3.png)<br/>En este ejemplo, se utiliza la abstracción a través de una interfaz llamada Shape. Esta interfaz define un único método calculateArea(), que representa la acción genérica de calcular el área de una forma geométrica. |![img_4.png](img/img_4.png)<br/>Las clases Circle y Rectangle implementan la interfaz Shape y proporcionan implementaciones específicas para el cálculo del área según la forma.|![img_5.png](img/img_5.png)<br/>En el método main, se crean instancias de las clases Circle y Rectangle y se llama al método calculateArea() en cada una. La abstracción permite tratar a las formas geométricas de manera uniforme, sin preocuparse por las diferencias específicas entre círculos y rectángulos.|
|-|-|-|
![img_13.png](img/img_13.png)


#### 3. Ejemplo Abstracción Cuenta
|![img_6.png](img/img_6.png)<br/>En este ejemplo, se emplea la abstracción para definir una clase base abstracta llamada BankAccount. Esta clase contiene una propiedad balance y métodos abstractos deposit() y withdraw() que representan acciones genéricas para depositar y retirar dinero.|![img_7.png](img/img_7.png)<br/>Las clases derivadas CheckingAccount y SavingsAccount heredan de BankAccount y proporcionan implementaciones específicas para los métodos deposit() y withdraw() según el tipo de cuenta.|![img_8.png](img/img_8.png)<br/>En el método main, se crean instancias de las clases CheckingAccount y SavingsAccount se realizan depósitos y retiros en cada una, y la abstracción permite gestionar las cuentas bancarias sin preocuparse por los detalles específicos de cómo funcionan internamente.|
|-|-|-|

## 2) Encapsulamiento
### Explicación
La encapsulación consiste en agrupar datos y los métodos (funciones) que operan sobre esos datos en una única entidad llamada "clase". Una clase encapsula la implementación interna de un objeto y proporciona una interfaz pública para interactuar con él. Esto significa que el código externo no necesita conocer los detalles internos de cómo funciona la clase, solo necesita utilizar los métodos públicos proporcionados.
### Ejemplos:

#### 1. Ejemplo Encapsulamiento 1

|![img_4.png](img_4.png)<br/>Dentro de la clase "Personas" los atributos se encuentran declarados en privados por lo cual no pueden ser llamados por otra clase que no sea la misma. |![img_5.png](img_5.png)<br/>Una vez creados los atributos se procede a crear los metodos publicos los cuales permitiran que se puedan acceder a los atributos en otra clase. |![img_6.png](img_6.png)![img_7.png](img_7.png)<br/>Dentro de clase main se puede observar que los atributos finalmente pueden ser llamados junto a los metodos publicos|
|-|-|-|

#### 2. Ejemplo Encapsulamiento 2

|![img_9.png](img_9.png)<br/>|<br/>![img_11.png](img_11.png)|
|-|-|
![img_10.png](img_10.png)<br/>![img_8.png](img_8.png)

#### 3. Ejemplo Encapsulamiento 3

|![img_12.png](img_12.png)<br/>|![img_13.png](img_13.png)|<br/>![img_14.png](img_14.png)|
|-|-|-|
![img_15.png](img_15.png)

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
#### 1.
Supongamos que tenemos una jerarquía de clases que representan diferentes formas geométricas, como círculos y rectángulos.

![img.png](img/img15.png)

Cada forma geométrica debe calcular su área. Para lograr el polimorfismo, podemos crear una interfaz común llamada "Shape" que define el método para calcular el área.

|![img.png](img/img16.png)|![img.png](img/img19.png)|
|-|-|

y luego las clases "Circle" y "Rectangle" implementarán esta interfaz y proporcionarán su propia implementación del cálculo del área.

|![img.png](img/img18.png)|![img.png](img/img17.png)|
|-|-|

En este ejemplo, tanto el objeto circle como el objeto rectangle pueden ser tratados de manera uniforme a través de la interfaz Shape, lo que permite llamar al método calculateArea() sin preocuparse por las diferencias específicas entre círculos y rectángulos. Esto es el polimorfismo en acción.

#### 2.
|En el segundo ejemplo se crean 4 clases en las cuales se puede observar que de una clase padre llamada "Animal" se desprenden dos clases hijas llamadas "Perro" y "Gato"|
|---|

|![img.png](img.png)|![img_1.png](img_1.png)|![img_2.png](img_2.png)|
|----|---|---|

|La ultima clase llamada "Polimorfismo" se puede observar que se llama el metodo "hacersonido" tanto de la clase padre como de las clases hijas| 
|------|
|![img_3.png](img_3.png)|

Esto demuestra como el polimorfismo permite que un mismo metodo se comporte de manera diferente segun el tipo real del objeto en tiempo de ejecucion
