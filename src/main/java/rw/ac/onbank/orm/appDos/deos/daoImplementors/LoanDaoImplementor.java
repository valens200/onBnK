package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.LoanDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Loan;

import java.util.List;

public class LoanDaoImplementor extends DAO implements LoanDao {

  
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();

    @Override
    public List<Loan> getAllDeLoans() {
        return null;
    }

    @Override
    public Loan getLoanById(long id) {
        return null;
    }

    @Override
    public Loan saveLoan(Loan loan) {

            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(loan);
                transaction.commit();
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }

    @Override
    public boolean deleteLoanById(long id) {
        return false;
    }
}