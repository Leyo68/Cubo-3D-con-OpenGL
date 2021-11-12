# Cubo 3D con OpenGL

El siguiente programa se realizó en el lenguaje de programación Java con el entorno de desarrollo NetBeans. A continuación, se presenta una breve descripción de cada una de las partes del programa. En la parte final podemos encontrar los resultados obtenidos al ejecutar este programa.


**Código Fuente**

En la siguiente figura se puede observar todas las librerías utilizadas.

**Figura 1**

Librerías importadas.

![image](https://user-images.githubusercontent.com/71055467/141412667-64bef5d7-a460-4923-9359-44252143f23f.png)

El programa sólo contiene una clase la cuál lleva por nombre “Cube” que a su vez implementa la interfaz GLEventListener. Es en esta clase donde se encuentra todo el cuerpo del programa como son: la función principal, declaración de variables y/o métodos.

Figura 2

Clase principal.

![image](https://user-images.githubusercontent.com/71055467/141415178-0f670484-2760-4dd2-801b-661d4be406e0.png)

Un programa hecho en java siempre debe tener la función principal que se conoce como main porque es aquí desde donde empieza a correr el programa.
En este caso se crea un marco y dentro de esta se crea un canva para poder usar las herramientas de OpenGL. Asimismo, se agrega un evento de ventana, para que el programa finalice una vez cerrado dicha ventana.

Figura 3

Función principal.

![image](https://user-images.githubusercontent.com/71055467/141415225-4c932816-397d-47aa-915a-6685b6a134b8.png)

El siguiente código trata de un método que se ejecuta después del método main. En este método se configura el área de dibujo y el modo de sombreado, entre otras cosas.

Figura 4

Método init.

![image](https://user-images.githubusercontent.com/71055467/141415244-e8f5cae9-e859-4009-a161-c76c621341e0.png)

El siguiente método es el reshape en la que se definen los diversos parámetros para mostrar de manera correcta el objeto, por ejemplo, se determina el tamaño final de la ventana, se elije entre una proyección ya sea ortogonal o perspectiva, así como el modelo de vista.

Figura 5

Método reshape.

![image](https://user-images.githubusercontent.com/71055467/141415274-90ba8221-10d6-4e6a-8fe1-0a69c2613733.png)

La parte central de este programa se encuentra en el siguiente método. En este método display es donde se encuentra definido el cubo que se desea mostrar en pantalla. De igual forma, es en esta parte donde se aplica cada una de las transformaciones que conocemos, los cuales son, la traslación, escalamiento, rotación y sesgado.

Figura 6

Método display.

![image](https://user-images.githubusercontent.com/71055467/141415322-c940d8e3-4205-4288-8588-15b119c5b0cb.png)

![image](https://user-images.githubusercontent.com/71055467/141415338-a0a136a9-9473-475b-a628-40f6956e8ce2.png)

![image](https://user-images.githubusercontent.com/71055467/141415349-3f1e7e34-3bd3-4240-9a23-dad194932d2f.png)

Por último, se encuentra un método que en este programa no fue necesario su uso.

Figura 7

Método displayChanged.

![image](https://user-images.githubusercontent.com/71055467/141415500-cabbf571-dca6-4f89-92e5-1d5853ccb725.png)



**Ejecución del programa**

El código fuente explicado anteriormente fue para tener una mejor comprensión del funcionamiento de dicho programa, ahora se ilustran unas capturas de pantalla del resultado obtenido al ejecutar este programa.
Esta primera captura de pantalla muestra el cubo en tres dimensiones sin antes haber aplicado alguna transformación tridimensional.

Figura 8

Cubo 3D sin transformación tridimensional alguna.

![image](https://user-images.githubusercontent.com/71055467/141415528-7f6d11de-d72b-4280-8581-ee2e5a3e10d5.png)

Si deseamos aplicar una traslación a este objeto, simplemente escribimos la sentencia correcta antes de pintar los lados del cubo y este se mostrará en otro lugar. En la figura siguiente se trasladó dos unidades sobre el eje x y uno sobre el eje y y z.

Figura 9

Cubo 3D al que se le aplicó una traslación.

![image](https://user-images.githubusercontent.com/71055467/141415565-50e4e6ef-6c76-47b8-9402-39eff9b08ee0.png)

La figura siguiente es el mismo cubo que se mostró en la captura de arriba, sólo que en este caso tiene aplicado una escala mayor al doble de su tamaño original.

Figura 10

Cubo 3D con una escala de 1-5.

![image](https://user-images.githubusercontent.com/71055467/141415589-bd0eca69-2f89-45f5-a3b9-57d08e885f61.png)

Otra de las transformaciones que se puede aplicar a objetos en tercera dimensión es la rotación, y en este caso el cubo se rotó 30 grados con respecto al eje x. El resultado obtenido es el siguiente:

Figura 11

Cubo 3D al que se le aplicó una rotación de 30 grados.

![image](https://user-images.githubusercontent.com/71055467/141415653-bb6f1560-4f16-44b5-8f96-2d4977a6f3ae.png)

Para terminar, la figura 12 ilustra el mismo cubo, pero esta vez se le aplicó otra de las transformaciones y se trata del sesgado. Para este caso sólo se modificó las dimensiones relacionadas con el eje x.

Figura 12

Cubo 3D que presenta un sesgado sobre el eje x.

![image](https://user-images.githubusercontent.com/71055467/141415669-82179db4-5515-4731-90ff-da36adfa5b0b.png)

