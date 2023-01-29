
package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.TransactionDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Transaction;

import java.util.List;

public class TransactionDaoImplementor extends DAO implements TransactionDao{

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
    public Transaction saveTransaction(Transaction transaction) {
            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(transaction);
                transaction.commit();
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }
    }

    @Override
    public boolean deleteTransactionById(long id) {
        return false;
    }

}