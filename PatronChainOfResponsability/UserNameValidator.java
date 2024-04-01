/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronChainOfResponsability;

import java.util.List;

public class UserNameValidator implements Validator {

    protected Validator nextValidator;
    private List<User> users;

    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }


    public UserNameValidator(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean validate(User user) {
        for (User existingUser : users) {
            if (existingUser.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        System.out.println("User not found.");
        return false;
    }
}
