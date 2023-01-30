package rw.ac.onbank.orm.helpers;

import rw.ac.onbank.orm.entities.User;
import rw.ac.onbank.orm.services.entityServices.UserService;

public class InputValidator {
    UserService userService = new UserService();
    Navigation navigation = new Navigation();
    User user = new User();
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();

}
