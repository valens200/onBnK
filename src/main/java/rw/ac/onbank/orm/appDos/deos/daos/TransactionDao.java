package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Transaction;

import java.util.List;

public interface Transaction {
    public List<Transaction> getAllTransactions();
    public Transaction getTransactionById(long id);
    public  boolean saveTransaction(Transaction transaction);
    public boolean deleteTransactionById(long id);


}