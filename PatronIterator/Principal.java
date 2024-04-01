// Luego, escriba el código del cliente:

package PatronIterator;

public class Principal {
    public static void main(String[] args) {
        Curso java = new Curso("Arquitectura Java");
        Curso javaBase = new Curso("Conceptos básicos de Java");
        Curso design = new Curso("Patrones de diseño");
        Curso ai = new Curso("inteligencia artificial");

        AgregadoConcretoCurso agregado = new AgregadoConcretoCurso();
        agregado.add(java);
        agregado.add(javaBase);
        agregado.add(design);
        agregado.add(ai);

        System.out.println("=========== Lista de cursos ==========\n");
        printCourse(agregado);

        agregado.remove(ai);

        System.out.println("\n=========== Lista de cursos después de la eliminación ==========");
        printCourse(agregado);
    }

    private static void printCourse(AgregadoCurso agregado) {
        Iterador<Curso> i = agregado.iterator();
        while (i.hasNext()){
            Curso course = i.next();
            System.out.println(" " + course.getName()  + " ");
        }
    }
}
