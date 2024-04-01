/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PatronChainOfResponsability;

/**
 *
 * @author JOSE SANDOVAL
 */
public interface Validator {
    
    public void setNextValidator(Validator nextValidator);
    public boolean validate(User user);
    
}
