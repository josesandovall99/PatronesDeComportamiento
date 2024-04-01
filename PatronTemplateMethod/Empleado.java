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
public class Empleado extends Persona{
    
    private String legado;
    
    public Empleado(String legado)
    {
        setLegado(legado);
    }

    @Override
    protected String getIdentificacion() {
       return  getLegado();
    }

    @Override
    protected String getTipoId() {
       return "numero legado";
    }

    /**
     * @return the legado
     */
    public String getLegado() {
        return legado;
    }

    /**
     * @param legado the legado to set
     */
    public void setLegado(String legado) {
        this.legado = legado;
    }
    
    
}
