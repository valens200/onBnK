package rw.ac.onbank.orm.onBankApp;
import rw.ac.onbank.orm.services.main.AppTransaction;
public class Starter {
    public static void main(String[] args) {
        AppTransaction  app = new AppTransaction();
        app.startApplication();
    }
}
