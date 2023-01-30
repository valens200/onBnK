package rw.ac.onbank.orm.entities.enums;

import rw.ac.onbank.orm.entities.Account;

public enum TransactionType {
    DEPOSIT,
    WITHDRAWAL,
    TRANSFER,
    LOAN;
    public boolean isValid(Account fromAccount, double amount) {
        switch(this) {
            case DEPOSIT:
            case LOAN:
                return true;
            case WITHDRAWAL:
            case TRANSFER:
                return fromAccount.getBalance() >= amount;
            default:
                throw new IllegalArgumentException();
        }
    }
}
