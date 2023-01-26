package rw.ac.onbank.orm.transactions.main;

import rw.ac.onbank.orm.entities.Bank;
import rw.ac.onbank.orm.transactions.entityTransctions.BankTransaction;
import rw.ac.onbank.orm.transactions.entityTransctions.UserTransaction;

public class AppTransaction {
    private BankTransaction bankTransaction;
    private UserTransaction userTransaction;
    public void startApplication(){
        System.out.println("application is starting");
    }
}
