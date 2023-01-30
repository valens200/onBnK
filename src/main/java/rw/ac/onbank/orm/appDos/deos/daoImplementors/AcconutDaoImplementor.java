
package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.onbank.orm.appDos.deos.daos.AccountDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Account;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.util.List;

public class AcconutDaoImplementor extends DAO implements AccountDao{
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();
    private  boolean isSaved = false;
    @Override
    public List<Account> getAllAccounts() {
        return null;
    }

    @Override
    public Account getAccountById(long id) {
        return null;
    }

    @Override
    public boolean saveAccount(Account account) {
            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(account);
                transaction.commit();
                isSaved = true;
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }
            return  isSaved;
    }

    @Override
    public boolean deleteAccountById(long id) {
        return false;
    }

}