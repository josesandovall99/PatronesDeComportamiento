/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronVisitor;

/**
 *
 * @author User
 */
public class ElementConcretMoto implements IElemento{

    @Override
    public void accept(IVisitor visitador) {
       visitador.visitar(this);
    }
    
}
