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
public class Cliente extends  Persona{
    private int numeroDeCliente;
    
    public Cliente(int numeroDecliente)
    {
        setNumeroDeCliente(numeroDecliente);
    }

    @Override
    protected String getIdentificacion() {
        return String.valueOf(numeroDeCliente);
    }

    @Override
    protected String getTipoId() {
        return "numero cliente";
    }

    /**
     * @return the numeroDeCliente
     */
    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    /**
     * @param numeroDeCliente the numeroDeCliente to set
     */
    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }
    
    
}
