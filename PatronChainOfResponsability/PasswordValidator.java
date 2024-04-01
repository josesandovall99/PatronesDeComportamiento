/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronChainOfResponsability;

/**
 *
 * @author JOSE SANDOVAL
 */
import java.util.List;

public class PasswordValidator implements Validator {

    protected Validator nextValidator;
    private List<User> users;
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }


    public PasswordValidator(List<User> users) {

        this.users = users;
    }

    @Override
    public boolean validate(User user) {
        for (User existingUser : users) {
            if ( existingUser.getUsername().equals(user.getUsername())&& existingUser.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        System.out.println("Invalid password.");
        return false;}
}
