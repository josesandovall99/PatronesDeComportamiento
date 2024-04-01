//Una colección personalizada de cursos Interfaz de agregado de cursos:

package PatronIterator;

public interface AgregadoCurso {
    void add(Curso course);
    void remove(Curso course);
    Iterador<Curso> iterator();
}
