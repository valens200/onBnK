package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Account;

import java.util.List;

public interface AccountDao {
    public List<Account> getAllAccounts();
    public Account getAccountById(long id);
    public  boolean saveAccount(Account account);
    public boolean deleteAccountById(long id);


}