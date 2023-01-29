package rw.ac.onbank.orm.services.entityServices;

import rw.ac.onbank.orm.appDos.deos.daoImplementors.UserDaoImplementor;
import rw.ac.onbank.orm.appDos.deos.daos.UserDao;
import rw.ac.onbank.orm.entities.User;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;
import rw.ac.onbank.orm.superclasses.Scanner;

import java.util.List;
public class UserServices  extends Scanner {
    private UserDao userDao = new UserDaoImplementor();
    private MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    public List<User> getAllUsers(){
        return  userDao.getAllUsers();
    }
    public boolean loginUser(){
        User user = new User();
        System.out.println("Enter your email : ");
        user.setEmail(getScanner().nextLine());
        System.out.println("Enter your password: ");
        user.setPassword(getScanner().nextLine());
        User availableUser = userDao.getUserByEmail(user.getEmail());
        if(availableUser == null){
            return false;
        }else if (availableUser.getPassword() == user.getPassword()){
            return true;
        }else {
            return false;
        }
    }
    public  boolean registerUser(){
        User user = new User();
        System.out.print("Enter your FirstName : ");
        user.setFirstName(getScanner().nextLine());
        System.out.print("Enter your LastName");
        user.setLastName(getScanner().nextLine());
        System.out.print("Enter your phone number : ");
        user.setPhone(getScanner().nextLine());
        System.out.print("Enter your email : ");
        user.setEmail(getScanner().nextLine());
        System.out.print("Enter your password : ");
        user.setPassword(getScanner().nextLine());
        System.out.println("Enter your security question");
        user.setSecurityQuestion(getScanner().nextLine());
        System.out.println("Enter your security answer");
        user.setSecurityAnswer(getScanner().next());
        return userDao.saveUser(user);
    }
}
