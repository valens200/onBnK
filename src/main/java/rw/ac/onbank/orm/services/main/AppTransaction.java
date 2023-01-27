package rw.ac.onbank.orm.services.main;

import rw.ac.onbank.orm.appDos.deos.daos.UserDao;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;
import rw.ac.onbank.orm.services.entityServices.BankServices;
import rw.ac.onbank.orm.services.entityServices.UserServices;
import rw.ac.onbank.orm.superclasses.Scanner;

public class AppTransaction  extends Scanner {
    private BankServices bankTransaction;
    private UserServices userTransaction = new UserServices();
    private MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    public void startApplication(){
        int choice = 0;
        System.out.println("Welcome to our online banking application");
            String[] options = {"Login", "Get started"};
            printer.printChoices(options);
            choice = getScanner().nextInt();
            switch (choice){
                case 1:
                    userTransaction.loginUser();
                    break;
                case 2:
                    userTransaction.registerUser();
                    break;
                default:
                    System.out.println("Please choose the right choice");
                    printer.printChoices(options);
        }

    }
}
