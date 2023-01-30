package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.onbank.orm.appDos.deos.daos.LoanDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Loan;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.util.ArrayList;
import java.util.List;

public class LoanDaoImplementor extends DAO implements LoanDao {
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();

    @Override
    public List<Loan> getAllLoans() {
        return new ArrayList<Loan>();
    }

    @Override
    public Loan getLoanById(long id) {
        return null;
    }
    @Override
    public boolean saveLoan(Loan loan) {
        boolean isLoanSaved = false;
        try {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(loan);
            transaction.commit();
            isLoanSaved = true;
        } catch (Exception e) {
            printer.print("Error" + e.getMessage());
        } finally {
            session.close();
        }
        return  isLoanSaved;
    }
    @Override
    public boolean deleteLoanById(long id) {
        return false;
    }
}