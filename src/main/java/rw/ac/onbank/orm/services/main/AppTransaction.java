package rw.ac.onbank.orm.services.main;

import org.apache.poi.hssf.record.formula.functions.Na;
import rw.ac.onbank.orm.helpers.InputValidator;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;
import rw.ac.onbank.orm.helpers.Navigation;
import rw.ac.onbank.orm.services.entityServices.BankServices;
import rw.ac.onbank.orm.services.entityServices.UserService;
import rw.ac.onbank.orm.superclasses.Scanner;

public class AppTransaction  extends Scanner {

    private BankServices bankTransaction;
     UserService userTransaction = new UserService();
     Navigation navigation = new Navigation();
     InputValidator inputValidator = new InputValidator();
    private MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    public void startApplication()  {
        try {
            boolean loggedIn = false;
            String quit = "NO";
            do {
                int choice = 0;
                String[] options = {"Login", "Get started", "Exit"};
                printer.printChoices(options);
                choice = getScanner().nextInt();
                switch (choice) {
                    case 1:
                        if (userTransaction.loginUser()) {
                            loggedIn = true;
                            printer.printLine("\t\tYou logged in successfully");
                            navigation.printHomeChoices();
                        } else {
                            printer.printLine("\t\tInvalid email or password :");
                        }
                        break;
                    case 2:
                        if(userTransaction.registerUser()){
                            loggedIn = true;
                            printer.printLine("\t\t\t\t Your account was created successfully");
                            navigation.printHomeChoices();
                        }else{
                            printer.print("Some thing went wrong");
                        }
                        break;
                    case 3:
                        printer.printLine("\t\t\t\t You logged out to your account ");
                        String answer = "";
                        answer = getScanner().nextLine();
                        if(answer == "yes" || answer == "YES" || answer == "y" || answer == "y"){
                            quit = "Y";
                            System.exit(0);
                        }
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please choose the right choice");
                        printer.printChoices(options);
                }
            }while (!loggedIn);

            }catch(Exception exception){
                printer.print("Error :" + exception.getMessage());
            }
        }
}
