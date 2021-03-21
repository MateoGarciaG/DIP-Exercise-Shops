package org.formacion.di.negocio;

/* El motivo por el cual crear una interfaz en el paquete negocio
es debido a dos cosas:
1. Cumplir el principio del DIP:
Los módulos de alto nivel no deberían depender de los módulos de bajo nivel. Ambos deberían depender de abstracciones.

El paquete negocio es un modulo de alto nivel el cual depende
del paquete de bbdd, el cual es un modulo de bajo nivel.

Por lo cual hay que eliminar esta dependencia asegurandonos
de que ambos modulos de bajo y alto nivel dependan de abstracciones,
en este ejercicio seria crear dos interfaces, una para el modulo
de BBDD de bajo nivel y otra para el modulo d negocio de alto nivel
con el fin de que ambas ahora dependan de abstracciones(las interfaces)

2. El segundo motivo está directamente relacionado con el primero,
el motivo logico de crear una interfaz en el paquete de negocio, más
allá de cumplir el principio DIP, es que en el caso de que
queramos tener otro tipo de Controllador para recibir otro tipo
de Inventario por ejemplo, no podriamos porque siempre tendriamos que
usar la clase: ControladorEstoc. Lo cual no inpediría poder usar otro
tipo de Controlador que sea del mismo tipo que ControladorEstoc. De ahí
el motivo de usar una interfaz para poder abstraer todas las clases que pretendan ser controladores y que ahora cuando usemos un objeto de tipo
Controlador, ya no sea sobre una clase específica/controlador en específico
sino que ese objeto que usemos será de tipo Interfaz, incluso después
podríamos hacer Casting hacia ese objeto/controlador en especifico.


*/
public interface Controlador {
    boolean necesitaReponer(String tienda, String producto);
}
