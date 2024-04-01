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
public class Socio extends Persona {
    
    private int numeroDeSocio;
    public Socio (int numeroDeSocio)
    {
        setNumeroDeSocio(numeroDeSocio);
    }

    @Override
    protected String getIdentificacion() {
        return String.valueOf(numeroDeSocio);
    }

    @Override
    protected String getTipoId() {
        return "numero de socio";
    }

    /**
     * @return the numeroDeSocio
     */
    public int getNumeroDeSocio() {
        return numeroDeSocio;
    }

    /**
     * @param numeroDeSocio the numeroDeSocio to set
     */
    public void setNumeroDeSocio(int numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }
}
