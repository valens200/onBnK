package rw.ac.onbank.orm.onBankApp;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;
import rw.ac.onbank.orm.services.main.AppTransaction;
public class Starter {
    static MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    public static void main(String[] args) {
       printer.printLine("\t\t\t\t================================Welcome to our online banking application=====================================");
        printer.printLine("\t\t\t\t\t\t\t\t\t\t\t save as you earn for the best future preparation");
        AppTransaction  app = new AppTransaction();
        app.startApplication();
    }
}
