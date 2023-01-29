
package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import org.hibernate.Session;
import rw.ac.onbank.orm.appDos.deos.daos.TransactionDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Transaction;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.util.List;

public class TransactionDaoImplementor extends DAO implements TransactionDao{
    private boolean isSaved = false;

    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();
    @Override
    public List<Transaction> getAllTransactions() {
        return null;
    }

    @Override
    public Transaction getTransactionById(long id) {
        return null;
    }

    @Override
    public boolean saveTransaction(Transaction transactionn) {
            try{
                org.hibernate.Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(transactionn);
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
    public boolean deleteTransactionById(long id) {
        return false;
    }

}