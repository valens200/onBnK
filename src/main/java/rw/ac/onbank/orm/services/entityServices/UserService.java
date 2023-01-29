package rw.ac.onbank.orm.services.entityServices;

import org.apache.poi.hssf.record.formula.functions.Na;
import rw.ac.onbank.orm.appDos.deos.daoImplementors.UserDaoImplementor;
import rw.ac.onbank.orm.appDos.deos.daos.UserDao;
import rw.ac.onbank.orm.entities.User;
import rw.ac.onbank.orm.helpers.InputValidator;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;
import rw.ac.onbank.orm.helpers.Navigation;
import rw.ac.onbank.orm.superclasses.Scanner;

import java.util.List;
public class UserService extends Scanner {
     UserDao userDao = new UserDaoImplementor();
     Navigation navigation = new Navigation();
     MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    public List<User> getAllUsers(){
        return  userDao.getAllUsers();
    }
    public boolean loginUser(){
        User user = new User();
        boolean isLoggedInSuccessFully = true;
        try{
            String[] inputs = {"Email", "Password"};
            for (String s: inputs){
                navigation.generateInputs(s);
            }
            user = navigation.getUser();
            User availableUser = userDao.getUserByEmail(user.getEmail());
            if(availableUser == null){
                isLoggedInSuccessFully = false;
            }else if (availableUser.getPassword() != user.getPassword()){
                isLoggedInSuccessFully = true;
            }else {
                isLoggedInSuccessFully =  true;
            }
        }catch (Exception exception){
            printer.print("Error : " + exception.getMessage());
            return false;
        }
        return  isLoggedInSuccessFully;
    }
    public  boolean registerUser() throws  Exception{
        User user = new User();
        System.out.print("Enter your FirstName : ");
        user.setFirstName(getScanner().nextLine());
        System.out.print("Enter your LastName");
        user.setLastName(getScanner().nextLine());
        System.out.print("Enter your userName : ");
        user.setUserName(getScanner().nextLine());
        System.out.print("Enter your email : ");
        user.setEmail(getScanner().nextLine());
        System.out.print("Enter your password : ");
        user.setPassword(getScanner().nextLine());
        System.out.println("Enter your security question");
        user.setSecurityQuestion(getScanner().nextLine());
        System.out.println("Enter your security answer");
        user.setSecurityAnswer(getScanner().next());
        if(!userDao.saveUser(user)){
           printer.print("nott ");
        }
            return userDao.saveUser(user);
    }
}
