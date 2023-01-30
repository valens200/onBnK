package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.onbank.orm.appDos.deos.daos.BankDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Bank;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.util.List;

public class BankDaoImplementor extends DAO implements BankDao {

  
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();
    private boolean isSaved = false;

    @Override
    public List<Bank> getAvailableBanks() {
        return null;
    }

    @Override
    public Bank getBankById(long id) {
        return null;
    }

    @Override
    public boolean saveBank(Bank bank) {

        try {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(bank);
            transaction.commit();
            isSaved = true;
        } catch (Exception e) {
            printer.print("Error" + e.getMessage());

        } finally {
            session.close();
        }
        return  isSaved;
    }

    @Override
    public boolean deleteBankById(long id) {
        return false;
    }
}
