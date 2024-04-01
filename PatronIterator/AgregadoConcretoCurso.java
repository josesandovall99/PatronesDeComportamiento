//Crear una colección de cursos Clase de implementación de AgregadoCurso:
package PatronIterator;

import java.util.ArrayList;
import java.util.List;
    
public class AgregadoConcretoCurso implements AgregadoCurso {
    private List ListaCursos;
    //Constructor
    public AgregadoConcretoCurso() {
        this.ListaCursos = new ArrayList();
    }

    /**
     * @param curso
     */
    public void add(Curso curso) {
        ListaCursos.add(curso);
    }


    public void remove(Curso course) {
        ListaCursos.remove(course);
    }

    public Iterador<Curso> iterator() {
        return new IteradorConcreto<Curso>(ListaCursos);
    }
}
