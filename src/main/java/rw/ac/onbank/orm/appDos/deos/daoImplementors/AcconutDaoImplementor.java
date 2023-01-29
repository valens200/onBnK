
package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.AccountDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Account;

import java.util.List;

public class AccountDaoImplementor extends DAO implements AccountDao{

    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();
    @Override
    public List<Account> getAllAccounts() {
        return null;
    }

    @Override
    public Account getAccountById(long id) {
        return null;
    }

    @Override
    public Account saveAccount(Account account) {
      
            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(account);
                transaction.commit();
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }
    }

    @Override
    public boolean deleteAccountById(long id) {
        return false;
    }

}