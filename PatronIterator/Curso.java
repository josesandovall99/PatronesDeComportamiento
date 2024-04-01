/**Creamos una colección de cursos. 
 Cada elemento de la colección es un objeto del curso luego escribimos
 un iterador para leer la información de cada objeto del curso.
 Primero se crea un elemento de colección curso Clase de curso:*/
package PatronIterator;

public class Curso {
    private String nombre;

    public Curso(String name) {
        this.nombre = name;
    }

    public String getName() {
        return nombre;
    }
}