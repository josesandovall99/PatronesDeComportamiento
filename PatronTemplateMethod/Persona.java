/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronTemplateMethod;


/**
 *
 * @author Hugo
 */
public abstract class Persona {
    private String nombre;
    private String DNI;
    
    public String identificate()
    {
        String frase ="Me identifico con : ";
        frase = frase + getTipoId();
        frase = frase + ". El numero es: ";
        frase = frase + getIdentificacion();
        return frase;
    }
    
    protected abstract String getIdentificacion();
    protected abstract String getTipoId();
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
