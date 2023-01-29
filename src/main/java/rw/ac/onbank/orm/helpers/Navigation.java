package rw.ac.onbank.orm.helpers;

import rw.ac.onbank.orm.entities.User;
import rw.ac.onbank.orm.superclasses.Scanner;

public class Navigation  extends  Scanner{
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    int choice = 0;
    private User user = new User();
    public void checkEmail(String email){
        if(email.length() == 2){
            printer.printLine("\t\t\t\t Error : please provide valid email");
            user.setEmail(generateInputs("Email"));
        }
        user.setEmail(email);
    }
    public  void checkPassword(String password){
        if(password.length() < 8){
            printer.printLine("Password should be at least  8 characters");
            user.setPassword(generateInputs("Password"));
        }
        user.setPassword(password);
    }
    public  void checkUserName(String name){
        if(name.length() < 5){
            printer.printLine("Name should be at least 5 characters");
            user.setUserName(generateInputs("UserName"));
        }
        user.setUserName(name);
    }
    public  void  checkSecurityAnswer(String answer){
        user.setSecurityAnswer(answer);
    }
    public  void  checkSecurityQuestion(String question){
        user.setSecurityQuestion(question);
    }
    public  void checkFirstName(String firstName){
        user.setFirstName(firstName);
    }
    public void checkSecondName(String secondName){
        user.setLastName(secondName);
    }
    public User getUser(){
        return user;
    }
    public  String generateInputs (String field){
        String value = "";
        switch (field){
            case "Email":
                printer.print("Enter your email");
                value = getScanner().nextLine();
                checkEmail(value);
                break;
            case "Password":
                printer.print("Enter your password");
                value = getScanner().nextLine();
                checkPassword(value);
                break;
            case "FirstName" :
                printer.print("Enter your FirstName");
                value = getScanner().nextLine();
                checkFirstName(value);
                break;
            case "SecondName":
                printer.print("Enter your SecondName");
                value = getScanner().nextLine();
                checkSecondName(value);
                break;
            case "UserName":
                printer.print("Enter your userName");
                value = getScanner().nextLine();
                checkUserName(value);
                break;
            case "securityQuestion":
                printer.print("Enter your security question");
                value = getScanner().nextLine();
                checkSecurityQuestion(value);
                break;
            case "securityAnswer":
                printer.print("Enter your security answer");
                value = getScanner().nextLine();
                checkSecurityAnswer(value);
                break;
            default:
                printer.print("Please choose the right choice");
                break;
        }
        return value;
    }
    public  void printHomeChoices(){
        printer.print("You are registered successfully");
        printer.print("");
        printer.printLine("What do we you want to do for you? ");
        String[]  options2 = {"My account ", "Create account " , "Delete my account", "Logout", "Add an account"};
        printer.printChoices(options2);
        choice = getScanner().nextInt();
        switch (choice){
            case 1:
                String[] options3 = {"Check my balance", "Deposit money", "Withdraw money", "Get a loan"};
                printer.printChoices(options3);
                break;
            case 2:
                printer.printLine("Warning : By deleting your account all  your staffs including balance will be lost ");
                printer.printLine("Are you sure you want to delete this account  Y(yes) or N(no)?");
                if(getScanner().nextLine() == "y" || getScanner().nextLine() == "yes" || getScanner().nextLine() == "YES" || getScanner().nextLine().hashCode() == "YES".hashCode()){
                    printer.printLine("You deleted your account successfully");

                }else {
                    printer.printLine("not deleted");
                }
        }
    }
}
